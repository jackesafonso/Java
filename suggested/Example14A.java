package com.fdmgroup.exercise2.suggested;

// A sub-class constructor can call its super-class
// constructor using the super keyword. 
public class Example14A extends Example14 {

	// calls constructor of super class, with an age
	Example14A(int age){
		super(age);
	}
	
	public static void main(String[] args) {
		Example14A e = new Example14A(0);

	}

}
