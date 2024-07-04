package LibraryManagementSystem;

public class Book {
	
	private String title;
	private String author;
	private String ISBN;
	private boolean isAvailable;
	
	
	
	public Book(String title,String author,String ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.isAvailable = true;

	}
	
	public String getTitle() {
		return this.title;
	}

	public boolean isAvailable() {
		return isAvailable;
	}
	
	public void borrow() {
		isAvailable = false;
	}
	
	public void returnBook() {
		isAvailable = true;
		
	}

	@Override
	public String toString() {
		return "Book title =" + title + ", author=" + author + ", ISBN=" + ISBN + ", isAvailable=" + isAvailable;
	}
	
	
}
