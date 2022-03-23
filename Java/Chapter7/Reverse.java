import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		System.out.print("Enter 10 integers: ");
		int [] number = new int [10];
		Scanner in = new Scanner(System.in);
		int i;
		for (i=0; i<10; i++)
			number[i] = in.nextInt();
		for (i--; i>=0; i--)
			System.out.print(number[i]+" ");
	}

}
