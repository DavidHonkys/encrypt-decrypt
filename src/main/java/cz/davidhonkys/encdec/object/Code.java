package cz.davidhonkys.encdec.object;

/*
 * Code defined by value and algorithm
 */
public class Code {

    private String algorithm;
    private String value;    
    private String conversion;    

    public Code() {
		super();
	}

	public Code(String algorithm, String value, String conversion) {
        this.algorithm = algorithm;
        this.value = value;
        this.conversion = conversion;
    }

	public String getAlgorithm() {
		return algorithm;
	}

	public String getValue() {
		return value;
	}

	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public String getConversion() {
		return conversion;
	}

	public void setConversion(String conversion) {
		this.conversion = conversion;
	}

	@Override
	public String toString() {
		return "Code [algorithm=" + algorithm + ", value=" + value + ", conversion=" + conversion + "]";
	}

}
