package cz.davidhonkys.encdec.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cz.davidhonkys.encdec.object.Code;
import cz.davidhonkys.encdec.service.DecryptionService;

@RestController
public class DecryptionServiceController {
	
	@Autowired
	DecryptionService service;

    @PostMapping(value = "/decrypt")
    public String encrypt(@RequestBody Code code) {
            	
    	return service.getOutput(code.getAlgorithm(), code.getValue());
    }
    
}