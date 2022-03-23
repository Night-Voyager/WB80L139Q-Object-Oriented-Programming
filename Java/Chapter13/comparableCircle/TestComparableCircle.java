package comparableCircle;

import java.util.Scanner;

public class TestComparableCircle {

	public static void main(String[] args) {
		System.out.print("Enter two radii for two circles: ");
		
		Scanner in = new Scanner(System.in);
		
		int r1 = in.nextInt();
		int r2 = in.nextInt();
		
		ComparableCircle c1 = new ComparableCircle();
		ComparableCircle c2 = new ComparableCircle();
		
		c1.setRadius(r1);
		c2.setRadius(r2);
		
		if (c1.compareTo(c2)==0)
			System.out.println("The areas of the two circles are equal.");
		else
		{
			if (c1.compareTo(c2)==1)
				System.out.print("The first circle ");
			else
				System.out.print("The second circle ");
			System.out.print("is larger.");
		}
	}

}
