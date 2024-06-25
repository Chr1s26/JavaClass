package OOP;

public class TestCar {
	public static void main(String[] args) {
		Car car = new Car("BMW", "SUV",2017 );
		Car car2 = new Car("Honda", "Civic",2019 );
		Car car3 = new Car("Tesla", "Cybertruck",2022 );
		System.out.println(car);
		System.out.println(car2);
		System.out.println(car3);
		
		System.out.println("Total cars : "+Car.getCarCount());
		
		
		
	}
}

// Instance members belongs to the instance of the class. They can be accessed by creating objects.
// Static members belongs to the class. They can be accessed by calling class names. One static variable can be used by sharing among all instance of class.