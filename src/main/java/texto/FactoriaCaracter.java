package texto;

import java.util.ArrayList;

public class FactoriaCaracter {

	private static FactoriaCaracter factoria = new FactoriaCaracter();
	private ArrayList<CaracterFlyweight> almacen;

	private FactoriaCaracter() {
		almacen = new ArrayList<CaracterFlyweight>();
	}

	public static FactoriaCaracter getFactoria() {
		return factoria;
	}

	public Componente get(char c) {
		if (almacen.contains(c)) {
			return almacen.get(c);
		} else {
			CaracterFlyweight caracter = new CaracterFlyweight(c);
			almacen.add(caracter);
			return caracter;
		}
	}

}
