
public class SumASeries {

	public static void main(String[] args) {
		double sum = 0.0;
		for (double d=1.0; d<98; d++)
			sum += d/(d+2);
		System.out.print(sum);
	}

}
