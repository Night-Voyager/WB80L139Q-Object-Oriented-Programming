import java.util.Scanner;

public class SolveEquation {

	public static void main(String[] args) {
		System.out.print("Enter a, b, c: ");
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double delta = b*b-4*a*c;
		if (delta!=0)
		{
			if (delta>0)
			{
				double r1 = (-b+Math.pow(delta, 0.5))/(2*a);
				double r2 = (-b-Math.pow(delta, 0.5))/(2*a);
				System.out.print("The equation has two roots "+r1+" and "+r2);
			}
			else
				System.out.print("The equation has one root "+(-b/(2*a)));
		}
		else
			System.out.print("The equation has no real roots.");
	}

}
