package calculadora;

import upm.jbb.IO;

public class AddCommand extends Operacion {

	public AddCommand(Calculator cal) {
		super(cal);
	}

	@Override
	public String name() {
		return "Sumar";
	}

	@Override
	public void execute() {
		int i = IO.getIO().readInt();
		calculator.add(i);
	}

}
