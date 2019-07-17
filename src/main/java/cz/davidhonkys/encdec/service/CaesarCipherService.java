package cz.davidhonkys.encdec.service;

import org.springframework.stereotype.Service;

import cz.davidhonkys.encdec.service.interfaces.AlgorithmService;

@Service
public class CaesarCipherService implements AlgorithmService{

	@Override
	public String encrypt(String input) {
		return "Caesar Cipher to be encrypted: " + input;
	}

	@Override
	public String decrypt(String input) {
		return "Caesar Cipher to be decrypted: " + input;
	}

}
