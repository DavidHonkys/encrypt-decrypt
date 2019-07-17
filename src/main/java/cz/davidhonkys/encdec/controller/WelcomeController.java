package cz.davidhonkys.encdec.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cz.davidhonkys.encdec.constant.Algorithm;
import cz.davidhonkys.encdec.constant.Conversion;
import cz.davidhonkys.encdec.object.Code;

@Controller
public class WelcomeController {

	private static final String VIEW_NAME =  "welcome";
	
	private final AtomicLong counter = new AtomicLong();    
    
    @GetMapping("/")
    public String welcome(Model model) {
    	
    	model.addAttribute("counter", counter.incrementAndGet());
    	model.addAttribute("code", new Code("", "", ""));
    	model.addAttribute("algorithms", Algorithm.values());
    	model.addAttribute("conversions", Conversion.values());
    	
    	return VIEW_NAME;
    	
    }
   
}
