package com.fdmgroupmockitoexercises;

import static org.junit.Assert.assertEquals;

import java.awt.print.Book;
import java.util.ArrayList;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class CatalogueTest {
	
	
	
	@Mock
	private ArrayList<Book> arrayOfBooks;
	@Mock
	private ReadItemCommandObject readItemCommandObject;
	
	
	@Test
	public void test_GetAllBooks_ReturnsEmptyBookList_IfNoBooksAreInTheCatalogue(){
		 
		//arrange
		Catalogue catalogue = new Catalogue();
		arrayOfBooks = (ArrayList<Book>)Mockito.mock(ArrayList.class);
		
		//action
		ArrayList<Book> arrayOfBooks = catalogue.getAllBooks();
		
		//assert
		assertEquals(0, arrayOfBooks.size());
		
	}
	

	
	@Test
	public void test_GetAllBooks_CallsReadAllMethodOfReadItemCommand_WhenCalled(){
		
		//arrange
		Catalogue catalogue = new Catalogue();
		readItemCommandObject = Mockito.mock(ReadItemCommandObject.class);
		catalogue.setReadItemCommandObject(readItemCommandObject);
		
		//action
		catalogue.getAllBooks();
		
		//assert
		Mockito.verify(readItemCommandObject).readAll();
		
	}
	
	@Test
	public void test_GetAllBooks_ReturnsListOfBooksItReceivesFromReadAllMethodOfReadItemCommand_WhenCalled(){
		
	}



}
