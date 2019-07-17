package cz.davidhonkys.encdec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cz.davidhonkys.encdec.constant.Algorithm;
import cz.davidhonkys.encdec.service.interfaces.EncDecService;

@Service
public class EncryptionService implements EncDecService{

	@Autowired
	MorseCodeService morseCodeService;

	@Autowired
	CaesarCipherService caesarCipherService;
	
	@Override
	public String getOutput(String algorithm, String value) {		
		return encrypt(algorithm, value);		
	}
	
	private String encrypt(String algorithm, String value) {
		
		String encrypted = null;
		
		switch (Algorithm.valueOf(algorithm)) {
		case MorseCode:			
			encrypted = morseCodeService.encrypt(value);
			break;
		case CaesarCipher:
			encrypted = caesarCipherService.encrypt(value);
			break;
		default:
			encrypted = value;
			 break;
		} 
		
		return encrypted;		
	}	

}
