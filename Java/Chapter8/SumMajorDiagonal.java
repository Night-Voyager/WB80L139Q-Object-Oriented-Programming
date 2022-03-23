import java.util.Scanner;

public class SumMajorDiagonal {

	public static void main(String[] args) {
		System.out.println("Enter a 4-by-4 matrix row by row: ");
		Scanner in = new Scanner(System.in);
		double [][] matrix = new double [4][4];
		for (int i=0; i<4; i++)
			for (int j=0; j<4; j++)
				matrix[i][j] = in.nextDouble();
		
		System.out.println("Sum of the elements in the major diagonal is "+sumMajorDiagonal(matrix));
	}
	
	public static double sumMajorDiagonal(double [][] m) {
		return (m[0][0]+m[1][1]+m[2][2]+m[3][3]);
	}

}
