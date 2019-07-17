package cz.davidhonkys.encdec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import cz.davidhonkys.encdec.constant.Conversion;
import cz.davidhonkys.encdec.object.Code;
import cz.davidhonkys.encdec.object.OutputString;;

@Controller
public class EncDecController {
  
	private static final String VIEW_NAME =  "encdec";
	
	@Autowired
	RestTemplate restTemplate;
    
    @PostMapping("/encdec")
    public String encryptDecript(@ModelAttribute Code code, Model model) {
    	
    	String outputValue = null;
    	
    	switch (Conversion.valueOf(code.getConversion())) {
			case Encrypt:			
				outputValue = restTemplate.postForObject("http://localhost:8080/encrypt", code, String.class);
				break;
			case Decrypt:
				outputValue = restTemplate.postForObject("http://localhost:8080/decrypt", code, String.class);
				break;
			default:
				break;
		}        
        
        OutputString outputString = new OutputString(code.getAlgorithm(), code.getValue(), code.getConversion(), outputValue);    	
        model.addAttribute("outputString", outputString);
    	
    	return VIEW_NAME;
    }
}
