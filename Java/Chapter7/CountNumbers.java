import java.util.Scanner;

public class CountNumbers {

	public static void main(String[] args) {
		int [] integer = new int [101];
		for (int i=0; i<=100; i++)
			integer[i] = 0;
		System.out.print("Enter the integers between 1 and 100: ");
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		while (i!=0)
		{
			integer[i]++;
			i = in.nextInt();
		}
		for (i=1; i<=100; i++)
		{
			if (integer[i]!=0)
			{
				if (integer[i]==1)
					System.out.println(i+" occurs "+integer[i]+" time");
				else
					System.out.println(i+" occurs "+integer[i]+" times");
			}
		}
	}

}
