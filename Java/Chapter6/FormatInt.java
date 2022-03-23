import java.util.Scanner;

public class FormatInt {

	public static void main(String[] args) {
		System.out.print("Enter a number and its width: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int w = in.nextInt();
		System.out.println(format(n, w));
	}

	public static String format(int number, int width) {
		String s = ""+number;
		if(s.length()<width)
			for (int i=s.length(); i<width; i++)
				s = 0+s;
		return s;
	}
	
}
