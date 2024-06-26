package OOP;

public class TestMyPoint {

	public static void main(String[] args) {
		
		MyPoint p1 = new MyPoint();
		System.out.println(p1);
		
		p1.setXY(0,3);
		System.out.println(p1);
		
		MyPoint p2 = new MyPoint(4,0);
		System.out.println(p2);
		
		System.out.println(p1.distance(4,0));
		System.out.println(p1.distance(p2));
	}

}
