
public class StudentsVSLockers {

	public static void main(String[] args) {
		
		boolean [] locker = new boolean [100];
		int i, j;
		
		for (i=0; i<100; i++)
			locker[i] = false;
		
		for (i=0; i<100; i++)
			for (j=i; j<100; j+=(i+1))
			{
				if (locker[j]==true)
					locker[j]=false;
				else
					locker[j]=true;
			}
		
		for (i=0; i<100; i++)
			if (locker[i]==true)
				System.out.println("Locker "+(i+1)+" is open");
		
	}

}
