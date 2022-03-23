
public class LoopCompute {

	public static void main(String[] args) {
		
		double x=100.0, y=1.0, sum=0.0;
		for ( ; x>0; x--, y++)
			sum+=x/y;
		System.out.println(sum);
		
	}

}
