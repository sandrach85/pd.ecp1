package composite;

public class Sumar extends Operador {

	public Sumar(Expresion exp1, Expresion exp2) {
		super(exp1, exp2);
	}

	@Override
	public int operar() {
		return operando1.operar() + operando2.operar();
	}

	@Override
	public String toString() {
		return "(" + operando1.toString() + "+" + operando2.toString() + ")";
	}

}
