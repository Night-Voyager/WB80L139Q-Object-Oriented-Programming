
public class DisplayCharacters {

	public static void main(String[] args) {
		printChars('1', 'Z', 10);
	}
	
	public static void printChars(char ch1, char ch2, int numberPerLine) {
		char ch;
		for (int i=(int)ch1, j=1; i<=(int)ch2; i++, j++)
		{
			ch = (char)i;
			System.out.print(ch+" ");
			if (j==numberPerLine)
			{
				System.out.println();
				j=0;
			}
		}
	}

}
