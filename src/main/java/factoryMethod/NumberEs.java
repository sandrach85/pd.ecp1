package factoryMethod;

public class NumberEs extends NumberValue {

	@Override
	public NumberValue createLanguage() {
		return new NumberEs();
	}

}
