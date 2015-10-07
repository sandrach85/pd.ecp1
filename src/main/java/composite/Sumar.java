package composite;

public class Sumar extends Expression{


	@Override
	public int operar(Expression exp1, Expression exp2) {
		return exp1+exp2;;
	}

}
