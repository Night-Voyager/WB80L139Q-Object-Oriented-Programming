
public class NumbersDivisibleBy5or6ButNotBoth {

	public static void main(String[] args) {
		
		int line=1;
		
		for (int i=100; i<=200; i++)
		{
			if (i%5==0)
			{
				if (i%6!=0)
				{
					System.out.print(i+" ");
					line++;
				}
			}
			else if (i%6==0)
			{
				System.out.print(i+" ");
				line++;
			}
			
			if (line==11)
			{
				System.out.println();
				line=1;
			}
		}
	}

}
