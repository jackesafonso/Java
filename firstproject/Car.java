package com.fdmgroup1.firstproject;

public class Car extends Vehicle {

	private int mpg;

	public Car(int mpg, int numberOfWheels,int engineSize) {
		super(engineSize, numberOfWheels);
		this.mpg = mpg;
	}

	public int getMpg() {
		return mpg;
	}

	public void setMpg(int mpg) {
		this.mpg = mpg;
	}

}
