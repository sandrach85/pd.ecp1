package calculadora;

import upm.jbb.IO;

public class PrintCommand extends Operacion{

	public PrintCommand(Calculator cal) {
		super(cal);
	}

	@Override
	public String name() {
		return "Imprimir";
	}

	@Override
	public void execute() {
		IO.getIO().println(calculator.getTotal());
	}

}
