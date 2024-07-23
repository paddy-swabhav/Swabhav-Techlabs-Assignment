package com.techlabs.assignment.model;

import java.util.Comparator;

public class BookComparators {
	
		public static class BookNameComparator implements Comparator<Book>{

			@Override
			public int compare(Book book1, Book book2) {
				
				return book1.getBook_name().compareToIgnoreCase(book2.getBook_name());
			}
			
		}
		
		public static class BookAuthorComparator implements Comparator<Book>{

			@Override
			public int compare(Book book1, Book book2) {
				
				return book1.getAuthor().compareToIgnoreCase(book2.getAuthor());
			}
			
		}
		
		public static class BookPriceComparator implements Comparator<Book>{

			@Override
			public int compare(Book book1, Book book2) {
				
				return (int) (book1.getPrice()-book2.getPrice());
			}
			
		}
		
		public static class BookPublicationYearComparator implements Comparator<Book>{

			@Override
			public int compare(Book book1, Book book2) {
				
				return (int) (book1.getPublication_year()-book2.getPublication_year());
			}
			
		}
		
}
