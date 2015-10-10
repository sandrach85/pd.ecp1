package visitor;

public class Square implements Figure {

	private double side;

	public Square(double s) {
		this.side = s;

	}

	public double getSide() {
		return this.side;
	}

	public void setSide(double s) {
		this.side = s;
	}

	@Override
	public void aceptar(Visitor v) {
		v.visitSquare(this);
	}
}
