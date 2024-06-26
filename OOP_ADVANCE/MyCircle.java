package OOP;

public class MyCircle {
	private MyPoint center;
	private double radius;
	
	public MyCircle() {
		
		this.center = new MyPoint(0,0);
		this.radius = 1.0;	
	}
	
	public MyCircle(int xCenter,int yCenter,double radius) {
		this.center = new MyPoint(xCenter, yCenter);
		this.radius = radius;
	}
	
	public MyCircle(MyPoint center,double radius) {
		this.center = center;
		this.radius = radius;
	}

	public MyPoint getCenter() {
		return center;
	}

	public void setCenter(MyPoint center) {
		this.center = center;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public int getCenterX() {
		return center.getX();
	}
	
	public void setCenterX(int x) {
		center.setX(x);
	}
	
	public int getCenterY() {
		return center.getY();
	}
	
	public void setCenterY(int y) {
		center.setY(y);
	}
	
	public void setCenterXY(int x, int y) {
		center.setXY(x, y);
	}
	public String toString() {
		return "center=(" + center.getX() + "," + center.getY() + ") radius=" + this.radius;
	}
	
	public double getArea() {
	     return Math.PI * Math.pow(this.radius, 2);
	}

	// Method to calculate the perimeter (circumference) of the circle
	public double getPerimeter() {
	     return 2 * Math.PI * this.radius;
	}

	
	public double distance(MyCircle another) {
		return this.center.distance(another.getCenter());
	}
	
	
}
