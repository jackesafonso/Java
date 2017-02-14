package com.fdmgroup1.firstproject;

public class LorryTester {

	public static void main(String[] args) {
		Lorry lorry = new Lorry(2000,8,5000);
		System.out.println("Engine Size: "+lorry.getEngineSize());
		System.out.println("Wheels: "+lorry.getNumberOfWheels());
		System.out.println("Weight: "+lorry.getWeight());


	}

}
