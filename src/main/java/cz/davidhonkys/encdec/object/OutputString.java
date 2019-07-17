package cz.davidhonkys.encdec.object;

public class OutputString extends Code{
	
	private final String outputValue;

	public OutputString(String algorithm, String value, String conversion, String outputValue) {
		super(algorithm, value, conversion);
		this.outputValue = outputValue;
	}

	public String getOutputValue() {
		return outputValue;
	}	

}
