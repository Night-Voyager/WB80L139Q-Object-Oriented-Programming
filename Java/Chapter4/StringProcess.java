import java.util.Scanner;

public class StringProcess {

	public static void main(String[] args) {
		System.out.print("Enter a string: ");
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		System.out.print("The length of the string is "+s.length()+", the first character is "+s.charAt(0)+'.');
	}

}
