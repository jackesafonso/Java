package com.fdmgroup.postmockito;

public class Wheel {
	
	private int size = 20; 
	
	public int getSize(){
		return size;
		
		
	}

	public void spin() {
		System.out.println("Spin");
		
	}

	public void spinFaster() {
		
		System.out.println("Spinsfaster");
	}

	public void spin(int i) { // This method was created in order to pass integers
		                      // in the method drive() of the class Car
		
		
		
	}

	public void spin(String string) { // This method was created in order to pass Strings
		                              //in the method drive() of the class Car
		
		
	}

}
