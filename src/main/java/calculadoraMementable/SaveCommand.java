package calculadoraMementable;

import upm.jbb.IO;
import calculadora.Operacion;

public class SaveCommand extends Operacion implements Comando {

	private GestorMementos<MementoCalculadora> gestorMementos;

	public SaveCommand(CalculadoraMementable cal, GestorMementos<MementoCalculadora> gestorMementos) {
		super(cal);
		this.gestorMementos = gestorMementos;
	}

	@Override
	public String name() {
		return "Guardar";
	}

	@Override
	public void execute() {
		String clave = IO.getIO().readString();
		gestorMementos.addMemento(clave, ((CalculadoraMementable) calculator).createMemento());
	}

}
