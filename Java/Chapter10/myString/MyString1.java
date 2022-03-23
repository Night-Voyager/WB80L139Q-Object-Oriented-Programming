package myString;

public class MyString1 {

	private char[] c;
	
	public MyString1(char[] chars) {
		c = chars;
	}
	
	public char charAt(int index) {
		return c[index];
	}
	
	public int length() {
		return c.length;
	}
	
	public MyString1 substring(int begin, int end) {
		char[] newChar = new char[end-begin+1];
		for (int i=0, j=begin; j<=end; i++, j++)
			newChar[i] = this.charAt(j);
		MyString1 newMyString = new MyString1(newChar);
		return newMyString;
	}
	
	public MyString1 toLowerCase() {
		for (int i=0; i<c.length; i++)
			c[i] = Character.toLowerCase(c[i]);
		return this;
	}
	
	public boolean equals(MyString1 s) {
		if (c.length!=s.c.length)
			return false;
		else
			for (int i=0; i<c.length; i++)
				if (c[i]!=s.c[i])
					return false;
		return true;
	}
	
	public static MyString1 valueOf(int i) {
		String s = String.valueOf(i);
		MyString1 ms = new MyString1(s.toCharArray());
		return ms;
	}
}
