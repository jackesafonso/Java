package com.fdmgroup.abstractExamples;

public abstract class Vehicle {
	
	private int engineSize;
	
	public Vehicle(int engineSize){
		this.engineSize = engineSize;
	} 
		
		public abstract int numberOfWheels();
	

}
