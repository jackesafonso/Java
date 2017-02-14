package com.fdmgroup1.firstproject;

public class Vehicle {

	private int engineSize;
	private int numberOfWheels;

	Vehicle(int engineSize, int numberOfWheels) {

		this.engineSize = engineSize;
		this.numberOfWheels = numberOfWheels;
	}

	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public void drive() {

		System.out.println("I am in the vehicle");

	}
}
