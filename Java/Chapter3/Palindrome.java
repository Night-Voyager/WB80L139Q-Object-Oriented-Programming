import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.print("Enter a three-digit integer: ");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		if ((x/100)==(x%10))
			System.out.print(x+" is a palindrome.");
		else
			System.out.print(x+" is not a palindrome.");
	}

}
