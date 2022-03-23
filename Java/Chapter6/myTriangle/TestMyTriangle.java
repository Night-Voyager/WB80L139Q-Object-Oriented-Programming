package myTriangle;

import java.util.Scanner;

public class TestMyTriangle {

	public static void main(String[] args) {
		System.out.print("Enter the values of three sides of a triangle: ");
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		
		if (MyTriangle.isValid(a, b, c))
			System.out.println("The area of this triangle is "+MyTriangle.area(a, b, c));
		else
			System.out.println("The input is invalid.");
	}

}
