import java.util.*;

public class Array_Index_Out_Of_Bounds_Exception {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean continueInput = true;
		
		int[] array = new int[100];
		Random random = new Random();
		for (int i=0; i<100; i++)
			array[i] = random.nextInt();
		
		try {
			System.out.print("Enter an index of the array: ");
			int i = in.nextInt();
			
			System.out.println("The corresponding element value is "+array[i]);
			
			continueInput = false;
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds.");
		}
	}

}
