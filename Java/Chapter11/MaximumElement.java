import java.util.ArrayList;
import java.util.Scanner;

public class MaximumElement {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter integers (input ends with 0):");
		int value = in.nextInt();
		
		while (value!=0)
		{
			list.add(value);
			value = in.nextInt();
		}
		
		System.out.println("The largest number in the input is "+max(list));
	}
	
	public static Integer max(ArrayList<Integer> list) {
		if (list.isEmpty()||list.size()==0)
			return null;
		else
			return java.util.Collections.max(list);
	}

}
