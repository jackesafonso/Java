package com.fdmgroup.generics;

import java.util.HashMap;

public class MyContainerMap<T extends Number,U> { // T and U refers to value of string  and integer 
	
	private HashMap<T,U> myMap;
	
	MyContainerMap(HashMap<T,U> myMap){
		this.myMap = myMap;
		
		
	}
	
	public HashMap<T,U> getHashMap(){
		return myMap;
		
		
	} 
	
	public static void main(String[] args){
		//Map is feeding constructor with information
		HashMap<Number,Integer> myMap = new HashMap<Number,Integer>();
		myMap.put(1,1);
		myMap.put(1.0, 2);
		myMap.put(1.0f, 3);
		
		HashMap<Number,Integer> mc= new HashMap<Number,Integer>(myMap);
	}

}
