package com.jbk;

import java.util.List;

public class Library2 {

	List<Book> bookList;

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	@Override
	public String toString() {
		return "Library2 [bookList=" + bookList + "]";
	}
	
	
	
}
