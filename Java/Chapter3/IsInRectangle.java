import java.util.Scanner;

public class IsInRectangle {

	public static void main(String[] args) {
		System.out.print("Enter a point with two coordinates: ");
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		double y = input.nextDouble();
		if (Math.abs(x)<=5&&Math.abs(y)<=2.5)
			System.out.println("Point ("+x+", "+y+") is in the rectangle.");
		else
			System.out.println("Point ("+x+", "+y+") is not in the rectangle.");
	}

}
