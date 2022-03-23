import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		System.out.print("Enter an integer: ");
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		System.out.print("The sum of all its digits is "+sumDigits(n));
	}
	
	public static int sumDigits(long n) {
		int sum=0;
		while (n!=0)
		{
			sum+=n%10;
			n/=10;
		}
		return sum;
	}

}
