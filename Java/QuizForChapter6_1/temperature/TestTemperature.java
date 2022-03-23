package temperature;

public class TestTemperature {

	public static void main(String[] args) {
		System.out.println("Celsius    Fahrenheit");
		for (double i=40.0; i>=31.0; i--)
			System.out.println(i+"       "+((int)(10*Temperature.celsiusToFahrenheit(i)))/10.0);
	}

}
