package calculadora;

import upm.jbb.IO;

public class SubtractCommand extends Operacion {

	public SubtractCommand(Calculator cal) {
		super(cal);
	}

	@Override
	public String name() {
		return "Restar";
	}

	@Override
	public void execute() {
		int i = IO.getIO().readInt();
		calculator.subtract(i);

	}

}
