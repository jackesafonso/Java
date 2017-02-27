package com.fdmgroup.mytesting;

import java.awt.print.Book;
import java.util.ArrayList;

public class Baskett {

	private ArrayList<Book> list = new ArrayList<Book>();
	private Book Book;
	private Book dada;
	private ArrayList<Book> twoBooks;
	
	public void addBook(ArrayList<Book> arrayList) {
		list.add(dada);
		

	}

	public ArrayList<Book> getBooksInBasket() {

		return list;

	}

	

	public void addTwoBook(ArrayList<Book> book2) {
		list.add(dada);
		list.add(Book);
		
	}
	
	public ArrayList<Book> getTwoBooksInBasket() {
		ArrayList<Book> twoBooks = list;
		return twoBooks;
	}

	

}
