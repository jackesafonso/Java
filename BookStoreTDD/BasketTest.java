package com.fdmgroup.BookStoreTDD;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class BasketTest {
	
	   Basket basket = null; //Refactoring
	
	@Before
	public void setUp(){
		
		basket = new Basket(); //Refactoring
			
	}

	@Test
	public void test_GetBooksInBasket_ReturnsEmptyBookList_IfNoBooksHaveBeenAdded() {
		

		//Basket basket = new Basket(); //we can remove this as it has been Refactoring
		ArrayList<Book> al = basket.getBooksInBasket();
		assertEquals(0, al.size());

	}
	
	
	
	
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithOneBook(){
		
		Book book = new Book();
		Basket basket = new Basket();
		
		basket.addBook(book);
		
		ArrayList<Book> al = basket.getBooksInBasket();
		assertEquals(2, al.size());

		System.out.println(al.size());

	}
	
	

}
