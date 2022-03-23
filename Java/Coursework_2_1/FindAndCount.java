import java.util.Scanner;

public class FindAndCount {

	public static void main(String[] args) {
		System.out.print("Enter numbers: ");
		
		Scanner in = new Scanner(System.in);
		
		int number, max, count;
		number = in.nextInt();
		max = number;
		count = 1;
		
		while (number!=0)
		{
			number = in.nextInt();
			
			if (number>max)
			{
				max = number;
				count = 1;
			}
			else if (number==max)
			{
				count++;
			}
		}
		
		System.out.println("The largest number is "+max);
		System.out.println("The occurrence count of the largest number is "+count);
	}

}
