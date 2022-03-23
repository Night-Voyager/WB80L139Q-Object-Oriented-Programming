import java.util.*;

public class UseGregorianCalendarClass {

	public static void main(String[] args) {
		
		GregorianCalendar x = new GregorianCalendar();
		
		System.out.println("The current date is "
				+x.get(GregorianCalendar.YEAR)+", "
				+(x.get(GregorianCalendar.MONTH)+1)+", "
				+x.get(GregorianCalendar.DAY_OF_MONTH)+".");
		
		x.setTimeInMillis(1234567898765L);
		System.out.println("The setted date is "
				+x.get(GregorianCalendar.YEAR)+", "
				+x.get(GregorianCalendar.MONTH)+", "
				+x.get(GregorianCalendar.DAY_OF_MONTH)+".");
		
	}

}
