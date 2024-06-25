package OOP;

public class Car {
	private String brand;
	private String model;
	private int year;

	
	private static int carCount = 0;
	
	
	
	public Car(String brand,String model,int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		carCount ++;
	}
	public String toString() {
		return "The car brand is "+this.brand+" and model is "+this.model+" and the production year is "+this.year;
	}
	
	public static int getCarCount() {
		return carCount;
	}
	

}
