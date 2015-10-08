package calculadoraMementable;

import calculadora.Operacion;

public class ResetCommand extends Operacion{

	public ResetCommand(CalculadoraMementable cal) {
		super(cal);
	}

	@Override
	public String name() {
		return "Iniciar";
	}

	@Override
	public void execute() {
		calculator.reset();
	}

}
