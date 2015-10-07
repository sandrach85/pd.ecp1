package visitor;

public class VisitorArea extends Visitor {

	private double area;

	public VisitorArea() {
		area = 0;
	}

	@Override
	public void visitCircle(Circle c) {
		double i = 3.14 * c.getRadius() * c.getRadius();
		area += i;
	}

	@Override
	public void visitTriangle(Triangle c) {
		double i = ((c.getBase() * c.getHeight()) / 2);
		area += i;
	}

	@Override
	public void visitSquare(Square c) {
		double i = (c.getSide() * c.getSide());
		area += i;
	}

	public double getArea() {
		return area;
	}

}
