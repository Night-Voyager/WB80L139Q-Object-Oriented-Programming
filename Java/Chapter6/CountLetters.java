import java.util.Scanner;

public class CountLetters {

	public static void main(String[] args) {
		System.out.print("Enter a string: ");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		System.out.println(countLetters(s));
	}
	
	public static int countLetters(String s) {
		int n=0;
		for (int i=0; i<s.length(); i++)
			if (Character.isLetter(s.charAt(i)))
				n++;
		return n;
	}

}
