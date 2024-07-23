package com.techlabs.assignment.model;

public class Book {
	private String book_name,author;
	private double price;
	private int publication_year;
	public Book(String book_name, String author, double price, int publication_year) {
		super();
		this.book_name = book_name;
		this.author = author;
		this.price = price;
		this.publication_year = publication_year;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPublication_year() {
		return publication_year;
	}
	public void setPublication_year(int publication_year) {
		this.publication_year = publication_year;
	}
	
	
	@Override
	public String toString() {
		return "[ Book_name= " + book_name + ", Author= " + author + ", Price= " + price + ", Publication_year="
				+ publication_year+" ]";
	}
	
	
}
