package cz.davidhonkys.encdec.constant;

import java.util.HashMap;

public class MorseCode {
	
	public static final String MORSE_CODE_SEPARATOR = "/";

	/**
	 * Map of symbols and theirs Morse code.
	 */
	private static HashMap<String, String> encryptCodes = new HashMap<String, String>();

	/**
	 * Map of  Morse codes and theirs symbols.
	 */
	private static HashMap<String, String> decryptCodes = new HashMap<String, String>();

	static {
		encryptCodes.put("a", ".-");
		encryptCodes.put("b", "-...");
		encryptCodes.put("c", "-.-.");
		encryptCodes.put("d", "-..");
		encryptCodes.put("e", ".");
		encryptCodes.put("f", "..-.");
		encryptCodes.put("g", "--.");
		encryptCodes.put("h", "....");
		encryptCodes.put("i", "..");
		encryptCodes.put("j", ".---");
		encryptCodes.put("k", "-.-");
		encryptCodes.put("l", ".-..");
		encryptCodes.put("m", "--");
		encryptCodes.put("n", "-.");
		encryptCodes.put("o", "---");
		encryptCodes.put("p", ".--.");
		encryptCodes.put("q", "--.-");
		encryptCodes.put("r", ".-.");
		encryptCodes.put("s", "...");
		encryptCodes.put("t", "-");
		encryptCodes.put("u", "..-");
		encryptCodes.put("v", "...-");
		encryptCodes.put("w", ".--");
		encryptCodes.put("x", "-..-");
		encryptCodes.put("y", "-.--");
		encryptCodes.put("z", "--..");
		encryptCodes.put("0", "-----");
		encryptCodes.put("1", ".----");
		encryptCodes.put("2", "..---");
		encryptCodes.put("3", "...--");
		encryptCodes.put("4", "....-");
		encryptCodes.put("5", ".....");
		encryptCodes.put("6", "-....");
		encryptCodes.put("7", "--...");
		encryptCodes.put("8", "---..");
		encryptCodes.put("9", "----.");
		encryptCodes.put(".", ".-.-.-");
		encryptCodes.put(",", "--..--");
		encryptCodes.put("?", "--..--");
		encryptCodes.put(" ", "/");
		encryptCodes.put(":", "---...");
		encryptCodes.put(";", "-.-.-.");
		encryptCodes.put("-", "-....-");
		encryptCodes.put("_", "--..-.");
		encryptCodes.put("(", "-.--.");
		encryptCodes.put(")", "-.--.-");
		
		decryptCodes.put(".-", "a");
		decryptCodes.put("-...", "b");
		decryptCodes.put("-.-.", "c");
		decryptCodes.put("-..", "d");
		decryptCodes.put(".", "e");
		decryptCodes.put("..-.", "f");
		decryptCodes.put("--.", "g");
		decryptCodes.put("....", "h");
		decryptCodes.put("..", "i");
		decryptCodes.put(".---", "j");
		decryptCodes.put("-.-", "k");
		decryptCodes.put(".-..", "l");
		decryptCodes.put("--", "m");
		decryptCodes.put("-.", "n");
		decryptCodes.put("---", "o");
		decryptCodes.put(".--.", "p");
		decryptCodes.put("--.-", "q");
		decryptCodes.put(".-.", "r");
		decryptCodes.put("...", "s");
		decryptCodes.put("-", "t");
		decryptCodes.put("..-", "u");
		decryptCodes.put("...-", "v");
		decryptCodes.put(".--", "w");
		decryptCodes.put("-..-", "x");
		decryptCodes.put("-.--", "y");
		decryptCodes.put("--..", "z");
		decryptCodes.put("-----", "0");
		decryptCodes.put(".----", "1");
		decryptCodes.put("..---", "2");
		decryptCodes.put("...--", "3");
		decryptCodes.put("....-", "4");
		decryptCodes.put(".....", "5");
		decryptCodes.put("-....", "6");
		decryptCodes.put("--...", "7");
		decryptCodes.put("---..", "8");
		decryptCodes.put("----.", "9");
		decryptCodes.put("---...", ":");
		decryptCodes.put("-.-.-.", ";");
		decryptCodes.put("--..--", "?");
		decryptCodes.put("--..-.", "_");
		decryptCodes.put(".-.-.-", ".");
		decryptCodes.put("-....-", "-");
		decryptCodes.put("--..--", ",");
		decryptCodes.put("-.--.", "(");
		decryptCodes.put("-.--.-", ")");
		decryptCodes.put("/", " ");
	}

	public static HashMap<String, String> getEncryptCodes() {		
		return encryptCodes;
	}

	public static HashMap<String, String> getDecryptCodes() {
		return decryptCodes;
	}

}
