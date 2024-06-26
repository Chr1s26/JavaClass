package OOP;

public class TestBook {
	
	public static void main(String[] args) {
		
		Author teck = new Author("Tan Ah Teck", "teck@somewhere.com", 'm');
		System.out.println(teck);
		
		Book dummyBook = new Book("Java for dummies", teck, 9.99,88);
		System.out.println(dummyBook);
		
		Author peter = new Author("Peter Lee", "peter@nowhere.com", 'm');
		Book moreDummyBook = new Book("Java for more dummies", peter, 19.99);
		
		System.out.println(moreDummyBook);
		
		System.out.println(dummyBook.getAuthor());

	}


}
