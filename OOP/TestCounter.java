package OOP;

public class TestCounter {
	public static void main(String[] args) {
		Counter count1 = new Counter();
		count1.incrementCount();
		System.out.println(count1.getCount());
		System.out.println("Static count "+Counter.getstaticCount());
		
		
		Counter count2 = new Counter();
		count2.incrementCount();
		System.out.println(count2.getCount());
		System.out.println("Static count "+Counter.getstaticCount());
		
		
		Counter count3 = new Counter();
		count3.incrementCount();
		System.out.println(count3.getCount());
		System.out.println("Static count "+Counter.getstaticCount());
		
		
		Counter count4 = new Counter();
		count4.incrementCount();
		System.out.println(count4.getCount());
		System.out.println("Static count"+Counter.getstaticCount());
		
		
		System.out.println("Total Static count "+Counter.getstaticCount());

	}


}
