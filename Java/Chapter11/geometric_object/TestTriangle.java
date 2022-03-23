package geometric_object;

import java.util.Scanner;

public class TestTriangle {

	public static void main(String[] args) {
		System.out.println("side1, side2, side3, color, filled?");
		
		Scanner in = new Scanner(System.in);
		double side1 = in.nextDouble();
		double side2 = in.nextDouble();
		double side3 = in.nextDouble();
		String color = in.next();
		boolean filled = in.nextBoolean();
		
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFilled(filled);
		
		System.out.println(
				"The area of the "+triangle.toString()
				+" "+triangle.parentToString()
				+" is "+triangle.getArea());
	}

}
