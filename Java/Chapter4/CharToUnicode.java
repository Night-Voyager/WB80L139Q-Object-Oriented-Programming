import java.util.Scanner;

public class CharToUnicode {

	public static void main(String[] args) {
		System.out.print("Enter a character: ");
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		char a = s.charAt(0);
		int b = (int)a;
		System.out.println("The Unicode for the character "+a+" is "+b);
	}

}
