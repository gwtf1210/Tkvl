package com.ssafy;

public class Book {
	String isbn;
	String title;
	String author;
	String publisher;
	int price;
	String desc;
	
	public Book(String isbn, String title, String author, String publisher, int price, String desc) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.desc = desc;
	}
	
	public String toString() {
		return isbn + " | " + title + " | " +  author + " | " +  publisher + " | " +  price + " | " +  desc;
	}
}
