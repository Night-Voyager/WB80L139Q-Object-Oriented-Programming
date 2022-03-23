import java.util.Scanner;

public class MinuteToYearAndDay {

	public static void main(String[] args) {
		System.out.print("Enter the number of minutes: ");
		Scanner input = new Scanner(System.in);
		int minute = input.nextInt();
		int day = minute/(24*60);
		int year = (int)day/365;
		day %= 365;
		System.out.println(minute+" minutes is approximately "+year+" year(s) and "+day+" day(s).");
	}

}
