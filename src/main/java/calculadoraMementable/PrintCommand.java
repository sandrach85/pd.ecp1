package calculadoraMementable;

import calculadora.Operacion;
import upm.jbb.IO;

public class PrintCommand extends Operacion{

	public PrintCommand(CalculadoraMementable cal) {
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
