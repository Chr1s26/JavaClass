package OOP;

public class TestMyTime {

	public static void main(String[] args) {
		
		MyTime time = new MyTime(23, 59, 59);
		System.out.println(time);
		
		time.nextSecond();
		System.out.println(time);
		time.nextMinute();
		System.out.println(time);
		time.nextHour();
		System.out.println(time);
	}

}
