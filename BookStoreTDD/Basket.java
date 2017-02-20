package com.fdmgroup.BookStoreTDD;

import java.util.ArrayList;

public class Basket<book> {

	
	private ArrayList<Book> booklist= new ArrayList<Book>();
	
	public ArrayList<Book> getBooksInBasket() {
		return booklist;
	}

	
	
	
	public void addBook(Book book) {
		
		booklist.add(book);
		booklist.add(book);
		
		
		
	}

	
	


	

}
