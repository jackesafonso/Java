package com.fdmgroupmockitoexercises;

import java.awt.print.Book;
import java.util.ArrayList;

public class ReadItemCommandObject {

	private ArrayList<Book> arrayOfBooks = new ArrayList<Book>();
	
	public ArrayList<Book> readAll() {
		return arrayOfBooks;
		
	}

}
