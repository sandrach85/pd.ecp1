package visitor2;

public class Visitor2 extends Visitor {
	private int contA;
	private int contB;

	public Visitor2() {
		contA = 0;
		contB = 0;
	}

	@Override
	public void visitElementA(ElementA e) {
		contA++;
	}

	@Override
	public void visitElementB(ElementB e) {
		contB++;
	}

	public int getAs() {
		return contA;
	}

	public int getBs() {
		return contB;
	}
}
