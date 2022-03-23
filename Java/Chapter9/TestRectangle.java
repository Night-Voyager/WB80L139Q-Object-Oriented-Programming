
public class TestRectangle {

	public static void main(String[] args) {
		
		Rectangle rectangle1 = new Rectangle(4, 40);
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		
		System.out.println("The area and perimeter of the rectangle of width "+rectangle1.width
				+" and height "+rectangle1.height+" are "
				+rectangle1.getArea()+" and "+rectangle1.getPerrmeter());
		
		System.out.println("The area and perimeter of the rectangle of width "+rectangle2.width
				+" and height "+rectangle2.height+" are "
				+rectangle2.getArea()+" and "+rectangle2.getPerrmeter());
	}

}

class Rectangle {
	
	double width = 1;
	double height = 1;
	
	Rectangle() {
	}
	
	Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}
	
	double getArea() {
		return width*height;
	}
	
	double getPerrmeter() {
		return 2*(width+height);
	}
}