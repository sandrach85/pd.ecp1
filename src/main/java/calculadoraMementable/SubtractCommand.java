package calculadoraMementable;

import calculadora.Operacion;
import upm.jbb.IO;

public class SubtractCommand extends Operacion implements Comando {

	public SubtractCommand(CalculadoraMementable cal) {
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
