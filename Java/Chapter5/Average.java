import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		System.out.print("Enter an integer, the input ends if it is 0: ");
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt(), positive = 0, negative = 0, count=0;
		double total = 0.0, average = 0.0;
		
		while (n!=0)
		{
			if (n>0)
				positive++;
			else
				negative++;
			count++;
			total+=(double)n;
			
			n = in.nextInt();
		}
		average = total/count;
		
		System.out.println("The number of positives is "+positive);
		System.out.println("The number of negatives is "+negative);
		System.out.println("The total is "+total);
		System.out.println("The average is "+average);
	}

}
