package calculadora;

public abstract class Operacion implements Comando {
	protected Calculator calculator;

	public Operacion(Calculator cal) {
		this.calculator = cal;
	}

}
