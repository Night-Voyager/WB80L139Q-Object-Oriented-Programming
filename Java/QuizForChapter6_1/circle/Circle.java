package circle;

public class Circle {

	private double radius = 10.0;
	
	static int numberOfObjects = 0;
	
	public Circle() {
		numberOfObjects++;
	}
	
	public Circle(double radius) {
		this.radius = radius;
		numberOfObjects++;
	}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	public int compareTo(Circle C) {
		if (this.getArea()>C.getArea())
			return 1;
		else if (this.getArea()==C.getArea())
			return 0;
		else
			return -1;
	}
	
}
