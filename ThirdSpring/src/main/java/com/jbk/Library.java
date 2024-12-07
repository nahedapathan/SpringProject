package com.jbk;

public class Library {

	String LabName;
	Book book;
	
	
	
	
	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Library(String labName, Book book) {
		super();
		LabName = labName;
		this.book = book;
	}
	public String getLabName() {
		return LabName;
	}
	public void setLabName(String labName) {
		LabName = labName;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "Library [LabName=" + LabName + ", book=" + book + "]";
	}
	
	
}
