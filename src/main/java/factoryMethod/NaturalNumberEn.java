package factoryMethod;

public class NaturalNumberEn extends NaturalNumber {

	private static final String[] textValue = { "cero", "one", "two", "three", "four", "five" };

	public NaturalNumberEn(int value) {
		this.setValue(value);
	}

	@Override
	public String getTextValue() {
		if (this.value < textValue.length) {
			return NaturalNumberEn.textValue[this.value];
		} else {
			return "???";
		}
	}

	@Override
	public NumberValue createLanguage() {
		return new NumberEn();
	}

}
