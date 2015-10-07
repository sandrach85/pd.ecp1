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

	/*
	 * public Square(String description, double side) { super(description);
	 * this.side = side; }
	 * 
	 * @Override public double area() { return side * side; }
	 * 
	 * @Override public double numberOfSides() { return 4; }
	 * 
	 * @Override public String toString() { return super.toString(); }
	 */
}
