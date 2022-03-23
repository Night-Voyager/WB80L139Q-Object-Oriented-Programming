import java.util.Scanner;

public class ASCIIToChar {

	public static void main(String[] args) {
		System.out.print("Enter an ASCII code: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		char b = (char)a;
		System.out.println("The character for ASCII code "+a+" is "+b);
	}

}
