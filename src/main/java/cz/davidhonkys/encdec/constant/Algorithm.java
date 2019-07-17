package cz.davidhonkys.encdec.constant;

/**
 * 
 * Supported algorithms 
 *
 */
public enum Algorithm {
	MorseCode("MorseCode"), 
	CaesarCipher("CaesarCipher");
	
	private String label;
	 
    Algorithm(String label) {
        this.label = label;
    }
    
    @Override
    public String toString() { 
        return label; 
    }
}
