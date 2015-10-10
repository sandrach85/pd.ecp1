package calculadora;

public class ResetCommand extends Operacion {

	public ResetCommand(Calculator cal) {
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
