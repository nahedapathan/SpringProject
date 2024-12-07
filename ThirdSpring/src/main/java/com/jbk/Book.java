package com.jbk;

public class Book {
	String bookName;
	int price;
	Author auth;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Book(String bookName, int price, Author auth) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.auth = auth;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	public Author getAuth() {
		return auth;
	}
	public void setAuth(Author auth) {
		this.auth = auth;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", price=" + price + ", auth=" + auth + "]";
	}
	
	
	

}
