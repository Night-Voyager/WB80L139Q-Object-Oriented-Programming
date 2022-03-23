import java.util.Scanner;

public class PrintMatrix {

	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		printMatrix(n);
	}
	
	public static void printMatrix(int n) {
		for (int i=0; i<n; i++)
		{
			for (int j=0; j<n; j++)
				System.out.print((int)(Math.random()*2)+" ");
			System.out.println();
		}
	}

}
