package cz.davidhonkys.encdec.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import cz.davidhonkys.encdec.constant.MorseCode;
import cz.davidhonkys.encdec.service.interfaces.AlgorithmService;

@Service
public class MorseCodeService implements AlgorithmService{
	
	private StringBuffer morseEncryptBuffer;
	private StringBuffer morseDecryptBuffer;
	
	private static Map<String, String> morseCodeMap = MorseCode.getEncryptCodes();
	private static Map<String, String> morseDecodeMap = MorseCode.getDecryptCodes();

	@Override
	public String encrypt(String input) {
		
		input = prepareInputString(input);
		
		morseEncryptBuffer = new StringBuffer();
		
		for (int i = 0; i < input.length(); i++) {
			morseEncryptBuffer.append(convertToMorse(input.charAt(i)));
			morseEncryptBuffer.append(MorseCode.MORSE_CODE_SEPARATOR);
		}
		
		return morseEncryptBuffer.toString();
	}

	@Override
	public String decrypt(String input) {
		
		input = prepareInputString(input);
		
		morseDecryptBuffer = new StringBuffer();

		String[] splittedInput = input.split(MorseCode.MORSE_CODE_SEPARATOR);
		
		for (int i = 0; i < splittedInput.length; i++) {
			morseDecryptBuffer.append(convertFromMorse(splittedInput[i]));
		}

		return morseDecryptBuffer.toString();
	}
	
	private String convertToMorse(char symbol) {
		
		return morseCodeMap.get(String.valueOf(symbol));
	}
	
	private String convertFromMorse(String code) {
		return morseDecodeMap.get(code);
	}

	private String prepareInputString(String input) {
		return input.trim().toLowerCase();
	}
	
}
