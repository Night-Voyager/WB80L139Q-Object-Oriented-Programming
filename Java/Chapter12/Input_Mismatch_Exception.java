import java.util.*;

public class Input_Mismatch_Exception {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean continueInput = true;
		
		do {
			try {
				System.out.print("Enter two integers: ");
				int a = in.nextInt();
				int b = in.nextInt();
				
				System.out.println("The sum of them is "+(a+b));
				
				continueInput = false;
			}
			catch (InputMismatchException ex) {
				System.out.println("Please try again. "
						+"(Incorrect input: two integers are required)");
				in.nextLine();
			}
		} while (continueInput);
	}

}
