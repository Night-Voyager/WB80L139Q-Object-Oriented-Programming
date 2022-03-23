package myString;

public class TestMyString1 {

	public static void main(String[] args) {
		String str = "Hello World!!!";
		MyString1 s = new MyString1(str.toCharArray());
		MyString1 sub = s.substring(5, 10);
		MyString1 valueOf1234 = MyString1.valueOf(1234);
		System.out.println(valueOf1234.charAt(3));
	}

}
