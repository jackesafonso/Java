package com.fdmgroup.mytesting;

import static org.junit.Assert.*;

import java.awt.print.Book;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class BookBasketTest {
	
	private ArrayList<Book> Book;
	private ArrayList<Book> bookList;
	//private Baskett baskett;
	
	Baskett baskett = null; //refactoring
	ArrayList<Book> book = null;
	
	@Before
	public void setUp(){
		baskett = new Baskett(); //refactoring
		book = new ArrayList<Book>();
		
		
	}
	
	@Test
	public void test_GetBooksInBasket_ReturnsEmptyBookList_IfNoBooksHaveBeenAdded(){
		//arrange
		//Baskett baskett = new Baskett();
		//ArrayList<Book> book = new ArrayList<Book>();
		
		//Action
		ArrayList<Book> bookList = baskett.getBooksInBasket(); 
		
		//assert
		assertEquals(0,bookList.size());
	}
	
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithOneBook(){
		//assert
		
		//Baskett baskett = new Baskett();
		//ArrayList<Book> book = new ArrayList<Book>();
		
		//Action
		baskett.addBook(Book);
		 
		//assert
		ArrayList<Book> bookList = baskett.getBooksInBasket(); 
		assertEquals(1,bookList.size());
		
		
	}
	
	@Test
	public void test_addTwoBooksToTheBasketThenTheNumberOfBooksInTheBasketShouldBeEqualToTwo(){
		
		         //assert
		
				//Baskett baskett = new Baskett(); 
				//ArrayList<Book> book = new ArrayList<Book>();
				
				//Action
				baskett.addTwoBook(Book);
				ArrayList<Book> bookList = baskett.getTwoBooksInBasket();
				 
				//assert
				 
				assertEquals(2,bookList.size());
				
				
	
	}


}
