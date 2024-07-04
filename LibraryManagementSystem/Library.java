package LibraryManagementSystem;

import java.util.ArrayList;

public class Library {
	
	private ArrayList<Book> books;
	private ArrayList<Member> members;
	
	public Library() {
		this.books = new ArrayList<>();
		this.members = new ArrayList<>();
	}
	
	public void addBook(Book book) {
		System.out.println("Book's added successfully!!");
		books.add(book);
	}
	
	public void addMember(Member member) {
		if (members.contains(member)) {
			System.out.println("This member is already registered!!");
		}
		else {
			System.out.println("Registering member's success!");
			members.add(member) ;
		}
	}
	

	public void borrowBook(Member member,Book book) {
		if(books.contains(book)) {
		   System.out.println("Borrowing book's successful!!");
		   member.borrowBook(book);
		   books.remove(book);
		   }
		else {
			System.out.println("There is no book with that name in this library");
		}
	}
	
	public void returnBook(Member member,Book book) {
		if(books.contains(book)) {
			System.out.println("This book is not from this library");
		}
		else {
			System.out.println("Retruning book's successful!!");
			member.returnBook(book);
			books.add(book);
			}
			
	}
	

	public Book findBook(String title) {
		
		for(int index = 0; index < books.size();index++) {
			if(books.get(index).getTitle().equalsIgnoreCase(title)) {
				System.out.println("Book's found successfully!");
				return books.get(index);
			}
			else {
				System.out.println("There is no book with that title!!");
				return null;
			}
		}
		return null;
	}
	

	public Member findMember(int memberId) {
		
		for(int index = 0; index < books.size(); index++) {
			if(members.get(index).getMemberId() == memberId) {
				return members.get(index);
			}
			else {
				System.out.println("This member isn't registered at this library");
				return null;
			}
		}
		return null;
		
	}
	
	public void displayBooks() {
		for(int index = 0; index < books.size(); index++) {
			System.out.println(books.get(index));
		}
	}
	
	public void displayMembers() {
		for(int index = 0; index < members.size(); index++) {
		System.out.println(members.get(index));}
	}

}
