package composite;

public class Restar extends Operador {

	public Restar(Expresion exp1, Expresion exp2) {
		super(exp1, exp2);
	}

	@Override
	public int operar() {
		return operando1.operar() - operando2.operar();
	}

	@Override
	public String toString() {
		return "(" + operando1.toString() + "-" + operando2.toString() + ")";
	}

}
