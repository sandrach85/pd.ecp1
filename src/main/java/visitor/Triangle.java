package visitor;

public class Triangle implements Figure {
	private double base;

	private double height;

	public Triangle(double b, double h) {
		this.base = b;
		this.height = h;
	}

	public double getBase() {
		return this.base;
	}

	public double getHeight() {
		return this.height;
	}

	public void setBase(double b) {
		this.base = b;
	}

	public void setHeight(double h) {
		this.height = h;
	}

	@Override
	public void aceptar(Visitor v) {
		v.visitTriangle(this);
	}
}
