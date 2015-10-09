package calculadoraMementable;

import calculadora.Operacion;
import upm.jbb.IO;

public class AddCommand extends Operacion implements Comando{

	
	public AddCommand(CalculadoraMementable cal){
		super(cal);
	}

	@Override
	public String name() {
		return "Sumar";
	}

	@Override
	public void execute() {
		int i= IO.getIO().readInt();
		calculator.add(i);
	}


}
