package factoryMethod;

public class NumberEn extends NumberValue {

	@Override
	public NumberValue createLanguage() {
		return new NumberEn();
	}

}
