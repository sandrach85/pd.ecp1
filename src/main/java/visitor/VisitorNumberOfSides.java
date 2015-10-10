package visitor;

public class VisitorNumberOfSides extends Visitor {

	private double NumSides;

	public VisitorNumberOfSides() {
		NumSides = 0;
	}

	@Override
	public void visitCircle(Circle c) {
		double i = Double.POSITIVE_INFINITY;
		NumSides += i;
	}

	@Override
	public void visitTriangle(Triangle c) {
		double i = 3;
		NumSides += i;
	}

	@Override
	public void visitSquare(Square c) {
		double i = 4;
		NumSides += i;
	}

	public double getSides() {
		return NumSides;
	}

}
