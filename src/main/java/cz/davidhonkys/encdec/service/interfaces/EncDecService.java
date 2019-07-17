package cz.davidhonkys.encdec.service.interfaces;

/**
 * Encryption / Decryption service
 * @author David Honkys
 *
 */
public interface EncDecService {
	
	/**
	 * Returns output for particular algorithm
	 * @param algorithm - Algorithm to be used.
	 * @param value - Text to be encrypted/decrypted.
	 * @return Text after encryption/decryption.
	 */
	public String getOutput(String algorithm, String value);

}
