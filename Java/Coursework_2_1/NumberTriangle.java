import java.util.Scanner;

public class NumberTriangle {

	public static void main(String[] args) {
		System.out.print("Enter a number between 1 and 15: ");
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int i, j;
		
		if (n<1||n>15)
		{
			System.out.println("Invalid input.");
		}
		else
		{
			for (i=1; i<=n; i++)
			{
				for (j=3*(n-i); j>=0; j--)
					System.out.print(" ");
				for (j=i; j>1; j--)
				{
					if (j>=10)
						System.out.print(j+" ");
					else
						System.out.print(j+"  ");
				}
				for ( ; j<=i; j++)
				{
					if (j>=10)
						System.out.print(j+" ");
					else
						System.out.print(j+"  ");
				}
				System.out.println();
			}
		}
	}

}
