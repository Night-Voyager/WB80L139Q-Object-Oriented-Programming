import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.print("Enter an integer: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (isPalindrome(n))
			System.out.print(n+" is a palindrome.");
		else
			System.out.print(n+" is not a palindrome.");
	}
	
	public static int reverse(int number) {
		int reverse=0;
		while(number!=0)
		{
			reverse = reverse*10 + number%10;
			number = number/10;
		}
		return reverse;
	}
	
	public static boolean isPalindrome(int number) {
		if (number==reverse(number))
			return true;
		else
			return false;
	}

}
