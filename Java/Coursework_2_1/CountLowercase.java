import java.util.Scanner;

public class CountLowercase {

	public static void main(String[] args) {
		System.out.print("Enter a string: ");
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		int i, count=0;
		
		for (i=0; i<s.length(); i++)
			if (Character.isLowerCase(s.charAt(i)))
				count++;
		
		System.out.println("The number of lowercase letters in your string is "+count);
	}

}
