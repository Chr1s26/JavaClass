package OOP;



public class MyPoint {
	
	private int x ;
	private int y ;
	
	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "(" + this.x + "," +this.y +")";
	}
	
	public double distance(int x, int y) {
		return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
	}

	
	public double distance(MyPoint another) {
		return Math.sqrt(Math.pow(this.x - another.x, 2) + Math.pow(this.y - another.y, 2));
	}
	//this.x nk another.x nk br kwr
	//this.x ka current pointer new object yae x .another ka ll another object yae x. 
	//distance parameter nha khu yae usage ka br so lo tr ll. which one is better.

}
