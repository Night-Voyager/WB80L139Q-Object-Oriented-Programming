import java.util.Scanner;

public class DrivingCost {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the driving distance: ");
		double distance = input.nextDouble();
		System.out.print("Enter miles per gallon: ");
		double milesPerGal = input.nextDouble();
		System.out.print("Enter price per gallon: ");
		double pricePerGal = input.nextDouble();
		
		double cost = distance/milesPerGal*pricePerGal;
		System.out.printf("The cost of driving is $%.2f", cost);
	}

}
