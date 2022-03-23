import java.util.Scanner;

public class DecToHex {

	public static void main(String[] args) {
		System.out.print("Enter a decimal value (0 to 15): ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		if (a>=0&&a<=15) {
			String b = Integer.toHexString(a);
			char c = b.charAt(0);
			System.out.println("The hex value is "+(Character.isLowerCase(c)? Character.toUpperCase(c): c));
		}
		else
			System.out.println(a+" is an invalid input");
	}

}
