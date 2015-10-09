package texto;

import java.util.ArrayList;

public abstract class Enunciado extends Componente {

	protected ArrayList<Componente> enunciado;

	public Enunciado() {
		enunciado = new ArrayList<Componente>();
	}

	public abstract String dibujar(boolean b);
}
