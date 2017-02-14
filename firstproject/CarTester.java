package com.fdmgroup1.firstproject;

public class CarTester {

	public static void main(String[] args) {
		
		Car car = new Car(50,4,1000);
		System.out.println("Engine Size: "+car.getEngineSize());
		System.out.println("Wheels: "+car.getNumberOfWheels());
		System.out.println("Mpg: "+car.getMpg());

	}

}
