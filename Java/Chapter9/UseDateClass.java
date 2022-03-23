import java.util.Date;

public class UseDateClass {

	public static void main(String[] args) {
		int elapsedTime = 10000;
		Date d = new Date(elapsedTime);
		for (int i=1; i<=8; i++)
		{
			System.out.println(d.toString());
			elapsedTime*=10;
			d.setTime(elapsedTime);
		}
	}

}
