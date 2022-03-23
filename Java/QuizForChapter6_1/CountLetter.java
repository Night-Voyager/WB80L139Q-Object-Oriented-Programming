import java.util.Scanner;

public class CountLetter {

	public static void main(String[] args) {
		System.out.print("Enter a string: ");
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();

		System.out.println("The number of letters in your string is "+countLetter(s));
	}
	
	public static int countLetter(String s)  {
		int i=0, count=0;
		for ( ; i<s.length(); i++)
			if (Character.isLetter(s.charAt(i)))
				count++;
		return count;
	}

}
