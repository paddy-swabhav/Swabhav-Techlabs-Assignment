package com.techlabs.assignment.test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import com.techlabs.assignment.model.Book;
import com.techlabs.assignment.model.BookComparators;
import com.techlabs.list.model.BankApp;

public class BookTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		List<Book> books= new ArrayList<Book>();
		//Read books From User
		readBooks(books,scanner);
		
//		books.add(new Book("Harry","hogwarts",1000,2004));
//		books.add(new Book("Harry","hogwarts",1200,2004));
//		books.add(new Book("Harry","hogwarts",900,2004));
//		books.add(new Book("Potter","hagrit",1678,2005));
//		books.add(new Book("Prion of askaban","hagrit",1678,2005));
//		books.add(new Book("Rich Dad Poor Dad","IdontKNow",800,2012));
//		books.add(new Book("chamber of Secrets","potter",1000,1980));
//		books.add(new Book("Swami","Ranjit Desai",1000,1980));
//		books.add(new Book("Shriman Yogi","Ranjit Desai",3000,2006));
//		books.add(new Book("The Fourth Peshwa","Ranjit Desai",1000,2010));
		
		
		System.out.println("LIST OF BOOKS");
		displayBooks(books);
		
		System.out.println("\n\nLIST OF BOOKS BY ALHABETICAL ORDER OF NAMES:");
		Collections.sort(books, new BookComparators.BookNameComparator());
		displayBooks(books);
		
		System.out.println("\n\nLIST OF BOOKS BY PRICE");
		Collections.sort(books, new BookComparators.BookPriceComparator());
		displayBooks(books);
		
		System.out.println("\n\nLIST OF BOOKS BY DESCENDING ORDER OF PUBLICATION YEAR:");
		Collections.sort(books, new BookComparators.BookPublicationYearComparator().reversed());
		displayBooks(books);
		
		System.out.println("\n\nSorting the books first by author, then by title, and finally by price.");
		Collections.sort(books, new BookComparators.BookAuthorComparator().thenComparing(new BookComparators.BookNameComparator().thenComparing(new BookComparators.BookPriceComparator())));
		displayBooks(books);
		
		System.out.println("\n\nSorting the books first by publication year, then by price, and finally by author:");
		Collections.sort(books, new BookComparators.BookPublicationYearComparator().thenComparing(new BookComparators.BookPriceComparator().thenComparing(new BookComparators.BookAuthorComparator())));
		displayBooks(books);
		
	}
	
	private static void displayBooks(List<Book> books)
	{
		for(Book book : books)
		{
			System.out.println(book);
		}
	}
	
	private static void readBooks(List<Book> books, Scanner scanner)
	{
		int flag =0;
		while(flag!=1)
		{
			System.out.println("Select your option: \n\t1. Enter Book Details. \n\t2. Exit");
			int choice=scanner.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("ENTER BOOK NAME: ");
				String name=scanner.next();
				System.out.println("ENTER BOOK AUTHOR: ");
				String author=scanner.next();
				System.out.println("ENTER BOOK PUBLICATION YEAR (in YYYY): ");
				int publication_year=scanner.nextInt();
				System.out.println("ENTER BOOK PRICE: ");
				double price = scanner.nextDouble();
				books.add(new Book(name,author,price,publication_year));
				break;
			case 2:
				flag=1;
				break;
			default:
				System.out.println("INVALID INPUT !!!!!!!");
				break;
			}
		}
	}
}
