package myPoint;

public class MyPoint {
	
	private double x;
	private double y;
	
	public MyPoint() {
		x=y=0;
	}
	
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double distance(MyPoint p) {
		return this.distance(p.x, p.y);
	}
	
	public double distance(double x, double y) {
		return Math.sqrt(Math.pow(this.x-x, 2)+Math.pow(this.y-y, 2));
	}

}
