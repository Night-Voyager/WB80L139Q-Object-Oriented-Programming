package circle;

public class TestCircle {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(10.5);
		Circle c3 = new Circle();
		
		System.out.println(c1.getArea()+" "+c2.getArea()+" "+c1.compareTo(c2)+" "+Circle.numberOfObjects);
	}

}
