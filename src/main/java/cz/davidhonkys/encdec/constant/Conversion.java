package cz.davidhonkys.encdec.constant;

/**
 * 
 * Conversion types 
 *
 */
public enum Conversion {
	Encrypt("Encrypt"), 
	Decrypt("Decrypt");
	
	private String label;
	 
    Conversion(String label) {
        this.label = label;
    }
    
    @Override
    public String toString() { 
        return label; 
    }
}
