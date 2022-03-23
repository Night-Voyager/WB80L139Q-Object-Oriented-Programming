package octagon;

public class TestOctagon {

	public static void main(String[] args) {
		Octagon o1 = new Octagon(5);
		
		System.out.println("The area is "+o1.getArea()+
				" and the perimeter is "+o1.getPerimeter());
		
		try {
			Octagon o2 = (Octagon)o1.clone();
			System.out.println(o1.compareTo(o2));
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
