package composite;

public class Numero extends Expression{
	private int numero;
	
	public Numero(int valor){
		this.numero=valor;
	}

	@Override
	public int operar() {
		return this.numero;
	}



}
