package texto;

public class Texto extends Enunciado {

	@Override
	public void add(Componente c) {
		if (c.esCompuesto()) {
			enunciado.add(c);
		} else {
			throw new UnsupportedOperationException("Acción no permitida... ");
		}
	}

	@Override
	public String dibujar(boolean b) {
		String cadena = "";
		for (int i = 0; i < enunciado.size(); i++) {
			cadena += enunciado.get(i).dibujar(b);
		}
		return cadena + "\n---o---";
	}

}
