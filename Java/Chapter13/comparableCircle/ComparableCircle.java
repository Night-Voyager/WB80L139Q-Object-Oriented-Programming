package comparableCircle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

	@Override
	public int compareTo(ComparableCircle C) {
		if (this.getArea()>C.getArea())
			return 1;
		else if (this.getArea()==C.getArea())
			return 0;
		else
			return -1;
	}

}
