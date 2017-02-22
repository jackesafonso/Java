package com.fdmgroupmockitoexercises;

import java.awt.print.Book;
import java.util.ArrayList;

public class Catalogue {

	
	private ReadItemCommandObject readItemCommandObject=new ReadItemCommandObject();
		
	public ArrayList<Book> getAllBooks() {
		ArrayList<Book> arrayOfBooks = readItemCommandObject.readAll();
		return arrayOfBooks;
	}

	public void setReadItemCommandObject(ReadItemCommandObject readItemCommandObject) {
		this.readItemCommandObject = readItemCommandObject;
		
	}

}
