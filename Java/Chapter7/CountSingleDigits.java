
public class CountSingleDigits {

	public static void main(String[] args) {
		
		int [] counts = new int [10];
		
		for (int i=0; i<100; i++)
			counts[(int)(Math.random()*10)]++;
		
		for (int i=0; i<10; i++)
		{
			if (i==1)
				System.out.println(i+" occurs "+counts[i]+" time");
			else
				System.out.println(i+" occurs "+counts[i]+" times");
		}
	}

}
