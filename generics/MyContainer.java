package com.fdmgroup.generics;

import java.util.ArrayList;

//this class container handle both string and integer 
public class MyContainer<T extends Number> {
	                                 
	private ArrayList<T> myList; //= new ArrayList<T>(); --> this create a blank array list of string, thats why we removed it 
	
	//Constructor 
	MyContainer(ArrayList<T> myList){ // T refers to the generic type we are going to use
		this.myList = myList;
		
	}
	
	public void addItem(T theItem){
		myList.add(theItem);
	}
	
	
	public T getItem(int index){
		
		T item = myList.get(index);
		
		return item;
	}
	
	
	public void removeItem(int index){
		
		myList.remove(index);
	}
	
	

	public static void main(String[] args) {
		
		//this array list is feeding the constructor with info
		ArrayList<Integer> listInteger = new ArrayList<Integer>();
		listInteger.add(1);
		listInteger.add(2);
		listInteger.add(3);
		
		//missing type as Integer
		MyContainer<Integer> mc = new MyContainer<Integer>(listInteger);
		
		//missing type as integer 
		//MyContainer<Integer> mc1 = new MyContainer<Integer>();
		
	}

}
