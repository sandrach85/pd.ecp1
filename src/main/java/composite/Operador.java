package composite;

public abstract class Operador extends Expresion {
	protected Expresion operando1;
	protected Expresion operando2;

	public Operador(Expresion exp1, Expresion exp2) {
		this.operando1 = exp1;
		this.operando2 = exp2;
	}

	public abstract String toString();
}
