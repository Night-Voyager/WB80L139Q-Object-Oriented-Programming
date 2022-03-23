package location;

import java.util.Scanner;

public class TestLocation {

	public static void main(String[] args) {
		System.out.print("Enter the number of rows and columns in the arrey: ");
		
		Scanner in = new Scanner(System.in);
		
		int row = in.nextInt();
		int column = in.nextInt();
		
		double[][] a = new double [row][column];
		
		System.out.println("Enter the array: ");

		for (int i=0; i<row; i++)
			for (int j=0; j<column; j++)
				a[i][j] = in.nextDouble();
		
		Location b = locateLargest(a);
		
		System.out.println("The location of the largest element is "+b.maxValue+" at ("+b.row+", "+b.column+")");
	}

	public static Location locateLargest(double[][] a) {
		Location l = new Location();
		for (int i=0; i<a.length; i++)
		{
			for (int j=0; j<a[i].length; j++)
			{
				if (a[i][j]>l.maxValue)
				{
					l.row = i;
					l.column = j;
					l.maxValue = a[i][j];
				}
			}
		}
		return l;
	}
}
