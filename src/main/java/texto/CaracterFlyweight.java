package texto;

public class CaracterFlyweight extends Componente {
	private char letra;

	public CaracterFlyweight(char let) {
		this.letra = let;
	}

	public char get() {
		return letra;
	}
	
	@Override
	public void add(Componente c) {

	}	

	@Override
	public String dibujar(boolean b) {
		if (b) {
			return Character.toString(Character.toUpperCase(letra));
		} else {
			return Character.toString(letra);
		}
	}

	@Override
	public boolean esCompuesto() {
		return false;
	}
}
