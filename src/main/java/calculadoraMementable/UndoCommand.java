package calculadoraMementable;

import upm.jbb.IO;
import calculadora.Operacion;

public class UndoCommand extends Operacion{
	
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
		String clave = IO.getIO().readString();
		calculator.restoreMemento(gestorMementos.getMemento(clave));
	}

}
