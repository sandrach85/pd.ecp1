package texto;

public class Parrafo extends Enunciado {

	@Override
	public void add(Componente c) {
		if (c.esCompuesto()) {
			throw new UnsupportedOperationException("Acción no permitida... ");
		} else {
			enunciado.add(c);
		}
	}

	@Override
	public String dibujar(boolean b) {
		String cadena = "";
		for (int i = 0; i < enunciado.size(); i++) {
			cadena += enunciado.get(i).dibujar(b);
		}
		return cadena + "\n";
	}

	@Override
	public boolean esCompuesto() {
		return true;
	}

}
