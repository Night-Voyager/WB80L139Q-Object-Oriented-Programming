package octagon;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
	private double side;
	
	public Octagon() {
	}
	
	public Octagon(double side) {
		this.side = side;
	}
	
	public Octagon(double side, String color, boolean filled) {
		this.side = side;
		setColor(color);
		setFilled(filled);
	}
	
	/** Return side */
	public double getSide() {
		return side;
	}
	
	/** Set a new side */
	public void setSide(double side) {
		this.side = side;
	}

	/** Return area */
	@Override
	public double getArea() {
		return (2+4.0/Math.sqrt(2))*side*side;
	}

	/** Return peirmeter */
	@Override
	public double getPerimeter() {
		return 8*side;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public int compareTo(Octagon o) {
		if (this.getArea()>o.getArea())
			return 1;
		else if (this.getArea()==o.getArea())
			return 0;
		else
			return -1;
	}

}
