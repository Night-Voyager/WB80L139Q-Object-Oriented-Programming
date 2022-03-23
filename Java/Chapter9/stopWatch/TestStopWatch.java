package stopWatch;

import java.util.Arrays;

public class TestStopWatch {

	public static void main(String[] args) {
		
		StopWatch watch = new StopWatch();
		double [] array = new double [100000];
		
		for(int i=0; i<array.length; i++)
			array[i] = Math.random();
		
		watch.start();
		array = selectionSort(array);
		watch.stop();
		
		System.out.println("The execution time of sorting 100,000 random numbers using selection sort is "+watch.getElapsedTime()+" milliseconds.");
	}
	
	public static double [] selectionSort(double [] array) {
		for (int i=0; i<array.length-1; i++)
		{
			int k = i;
			
			for (int j=i+1; j<array.length; j++)
			{
				if (array[j]<array[i])
					k = j;
			}
			
			if (k!=i)
			{
				double temp = array[i];
				array[i] = array[k];
				array[k] = temp;
			}
		}
		return array;
	}

}
