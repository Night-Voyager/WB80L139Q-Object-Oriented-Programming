import java.util.Scanner;

public class AssignGrades {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		int number = in.nextInt();
		
		int [] score = new int [number];
		
		System.out.print("Enter "+number+" scores: ");
		
		int best=0, i;
		
		for (i=0; i<number; i++)
		{
			score[i] = in.nextInt();
			if (score[i]>best)
				best = score[i];
		}
		
		for (i=0; i<number; i++)
		{
			System.out.print("Student "+i+" score is "+score[i]+" and grade is ");
			if (score[i]>=best-10)
				System.out.println("A");
			else if (score[i]>=best-20)
				System.out.println("B");
			else if (score[i]>=best-30)
				System.out.println("C");
			else if (score[i]>=best-40)
				System.out.println("D");
			else
				System.out.println("F");
		}
	}

}
