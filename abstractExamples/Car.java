package com.fdmgroup.abstractExamples;

public class Car extends Vehicle{
	
	private int mpg;
	Car(int mpg, int engineSize){
		super(engineSize);
		this.mpg = mpg;
	}
	
	public int numberOfWheels() {
		return 4;
	}

}
