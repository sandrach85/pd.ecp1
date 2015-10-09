package texto;

import java.util.ArrayList;

public abstract class Enunciado extends Componente {

	protected ArrayList<Componente> enunciado;

	public abstract String dibujar(boolean b);

	public Enunciado() {
		enunciado = new ArrayList<Componente>();
	}

	public boolean esCompuesto() {
		return true;
	}

}
