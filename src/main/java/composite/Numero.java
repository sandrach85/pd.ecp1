package composite;

public class Numero extends Expresion {
	private int numero;

	public Numero(int valor) {
		this.numero = valor;
	}

	@Override
	public int operar() {
		return this.numero;
	}

	@Override
	public String toString() {
		return  Integer.toString(numero);
	}
	
	

}
