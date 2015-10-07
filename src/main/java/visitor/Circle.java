package visitor;

public class Circle implements Figure {

	private double radius;

	public Circle(double r) {
		this.radius = r;
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double r) {
		this.radius = r;
	}

	@Override
	public void aceptar(Visitor v) {
		v.visitCircle(this);

	}

	/*
	 * public Circle(String description, double radius) { super(description);
	 * this.radius = radius; }
	 * 
	 * @Override public double area() { return Math.PI * radius * radius; }
	 * 
	 * @Override public double numberOfSides() { return
	 * Double.POSITIVE_INFINITY; }
	 */
}
