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
}
