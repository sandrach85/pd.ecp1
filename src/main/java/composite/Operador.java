package composite;

public abstract class Operador extends Expression{
	private Expression exp1;
	private Expression exp2;
	
	public abstract int operar(Expression exp1, Expression exp2);
}
