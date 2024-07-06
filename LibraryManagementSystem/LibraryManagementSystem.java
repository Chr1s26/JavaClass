package LibraryManagementSystem;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.graalvm.compiler.nodes.IfNode;

public class LibraryManagementSystem {
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Library library = new Library();
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		do {
		System.out.println("****Library Management System****");
		System.out.println("1 : Do you want to add Book");
		System.out.println("2 : Do you want to borrow Book");
		System.out.println("3 : Do you want to return Book");
		System.out.println("4 : Do you want to display Book");
		System.out.println("5 : Do you want to add Member");
		System.out.println("6 : Do you want to display Member");
		System.out.println("7 : Do you want to Exit");
		
		int number = Integer.parseInt(bReader.readLine());
		
		if (number == 1) {
			System.out.println("Please enter the book title");
			String title = bReader.readLine();
			System.out.println("Please enter the book author name");
			String author = bReader.readLine();
			System.out.println("Please enter the book ISBN");
			String ISBN = bReader.readLine();
			library.addBook(new Book(title, author, ISBN));
		}
		
		else if(number == 2) {
			System.out.println("Please enter the member id");
			int memberid = Integer.parseInt(bReader.readLine());
			Member member = library.findMember(memberid);
			System.out.println("Please enter the book title");
			String title = bReader.readLine();
			Book book = library.findBook(title);
			library.borrowBook(member, book);
		}
		
		else if(number == 3) {
			System.out.println("Please enter the member id");
			int memberid = Integer.parseInt(bReader.readLine());
			Member member = library.findMember(memberid);
			System.out.println("Please enter the book title");
			String title = bReader.readLine();
			Book book = library.findBook(title);
			library.returnBook(member, book);
			
		}
		else if(number == 4) {
			library.displayBooks();
		}
		else if(number == 5) {
			System.out.println("Please enter the member name: ");
			String name = bReader.readLine();
			System.out.println("Please enter the member id");
			int id = Integer.parseInt(bReader.readLine());
			Member member = new Member(name, id);
			library.addMember(member);
			
		}
		else if(number == 6) {
			library.displayMembers();
		}
		else if(number == 7) {
			System.out.println("Thank You");
		}
		else {
			System.out.println("User input is incorrect");
		}
		
		System.out.println("Do you want to continue? Write Y for Yes and N for No");
		
		} while(bReader.readLine().equals("Y"));
		
		
		
		
	}

}
