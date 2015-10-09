package texto;

import java.util.ArrayList;

public class FactoriaCaracter {

	private static FactoriaCaracter factoria = new FactoriaCaracter();
	private ArrayList<CaracterFlyweight> almacen = new ArrayList<CaracterFlyweight>();

	private FactoriaCaracter() {
		factoria = null;
	}

	public static FactoriaCaracter getFactoria() {
		return factoria;
	}

	public Componente get(char c) {
		if (almacen.contains(c)) {
			return almacen.get(c);
		} else {
			return null;
		}
	}

}
