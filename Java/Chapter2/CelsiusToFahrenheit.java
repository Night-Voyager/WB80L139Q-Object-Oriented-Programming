import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		System.out.print("Enter a degree in Celsius: ");
		Scanner input = new Scanner(System.in);
		double Celsius = input.nextDouble();
		double Fahrenheit = (9.0/5)*Celsius+32;
		System.out.println(Celsius+" Celsius is "+Fahrenheit+" Fahrenheit.");
	}

}
