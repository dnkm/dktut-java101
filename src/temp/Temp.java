package temp;

public class Temp {
	public static void main(String[] args) {
		Point p = new Point();
		p.x = 10;
		
		System.out.println(p.x);
	}
}

class Point {
	int x;
	int y;
}