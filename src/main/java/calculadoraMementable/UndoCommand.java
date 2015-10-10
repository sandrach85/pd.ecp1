package calculadoraMementable;

import upm.jbb.IO;
import calculadora.Operacion;

public class UndoCommand extends Operacion implements Comando {

	private GestorMementos<MementoCalculadora> gestorMementos;

	public UndoCommand(CalculadoraMementable cal, GestorMementos<MementoCalculadora> gestorMementos) {
		super(cal);
		this.gestorMementos = gestorMementos;

	}

	@Override
	public String name() {
		return "Deshacer";
	}

	@Override
	public void execute() {
		String clave = (String) IO.getIO().select(gestorMementos.keys());
		((CalculadoraMementable) calculator).restoreMemento(gestorMementos.getMemento(clave));
	}

}
