import java.util.Scanner;

public class Cost {

	public static void main(String[] args) {
		System.out.print("Enter a weight:");
		Scanner input = new Scanner(System.in);
		double w = input.nextDouble();
		if (w<=0)
			System.out.println("What you have entred is illegal");
		else if (w<=1)
			System.out.println(3.5);
		else if (w<=3)
			System.out.println(5.5);
		else if (w<=10)
			System.out.println(8.5);
		else if (w<=20)
			System.out.println(10.5);
		else
			System.out.println("The package cannot be shipped.");
	}

}
