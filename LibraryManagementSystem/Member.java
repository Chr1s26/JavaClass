package LibraryManagementSystem;

import java.util.ArrayList;

public class Member {
	
	private String name;
	private int memberId;
	private ArrayList<Book> borrowBooks;
	
	public Member(String name, int memberId) {
		this.name = name;
		this.memberId = memberId;
		this.borrowBooks = new ArrayList<>();
	}

	public String getName() {
		return name;
	}
	
	public void borrowBook(Book book) {
		if(book.isAvailable()) {
		    borrowBooks.add(book);
		    book.borrow();
		    }
		else {
			System.out.println("You can't borrow this book");
		}
	}
	
	public void returnBook(Book book) {
		
		if(borrowBooks.contains(book)) {
			book.returnBook();
		    borrowBooks.remove(book);
		    
		    }
		else {
		System.out.println("This member didn't borrow that book");
	}}
	
	public int getMemberId() {
		return memberId;
	}

	@Override
	public String toString() {
		return "Member name is "+this.name + " and member's id is "+this.memberId;
	}

	
	
	

}
