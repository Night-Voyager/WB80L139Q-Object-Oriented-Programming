
public class LicensePlateNumber {

	public static void main(String[] args) {
		//Method 1
		System.out.println(""+
	(char)(Math.random()*27+65)+
	(char)(Math.random()*27+65)+
	(char)(Math.random()*27+65)+
	(int)(Math.random()*10)+
	(int)(Math.random()*10)+
	(int)(Math.random()*10)+
	(int)(Math.random()*10));
		
		//Method 2
		int i;
		for (i=1; i<=3; i++) {
			char a = (char)(Math.random()*27+65);
			System.out.print(a);
		}
		for (i=1; i<=4; i++) {
			int b = (int)(Math.random()*10);
			System.out.print(b);
		}
	}

}
