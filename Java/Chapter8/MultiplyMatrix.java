import java.util.Scanner;

public class MultiplyMatrix {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double [][] a = new double [3][3];
		double [][] b = new double [3][3];
		double [][] c;
		
		System.out.print("Enter matrix1: ");
		for (int i=0; i<3; i++)
			for (int j=0; j<3; j++)
				a[i][j] = in.nextDouble();
		
		System.out.print("Enter matrix2: ");
		for (int i=0; i<3; i++)
			for (int j=0; j<3; j++)
				b[i][j] = in.nextDouble();
		
		c = multiplyMatrix(a, b);
				
		System.out.println("The multiplication of the matrices is");
		
		printResult(a, b, c);
	}
	
	public static double[][] multiplyMatrix (double[][] a, double[][] b) {
		double[][] c = new double [3][3];
		for (int i=0; i<3; i++)
			for (int j=0; j<3; j++)
				c[i][j] = a[i][0]*b[0][j]+a[i][1]*b[1][j]+a[i][2]*b[2][j];
		return c;
	}
	
	public static void printResult(double[][] a, double[][] b, double[][] c) {
		for (int i=0; i<3; i++)
			System.out.print(a[0][i]+" ");
		System.out.print("    ");
		for (int i=0; i<3; i++)
			System.out.print(b[0][i]+" ");
		System.out.print("    ");
		for (int i=0; i<3; i++)
			System.out.print(c[0][i]+" ");
		System.out.println();
		
		for (int i=0; i<3; i++)
			System.out.print(a[1][i]+" ");
		System.out.print(" *  ");
		for (int i=0; i<3; i++)
			System.out.print(b[1][i]+" ");
		System.out.print(" =  ");
		for (int i=0; i<3; i++)
			System.out.print(c[1][i]+" ");
		System.out.println();
		
		for (int i=0; i<3; i++)
			System.out.print(a[2][i]+" ");
		System.out.print("    ");
		for (int i=0; i<3; i++)
			System.out.print(b[2][i]+" ");
		System.out.print("    ");
		for (int i=0; i<3; i++)
			System.out.print(c[2][i]+" ");
		System.out.println();
	}

}
