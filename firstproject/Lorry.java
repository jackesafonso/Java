package com.fdmgroup1.firstproject;

public class Lorry extends Vehicle {
	
	private int weight;
	
	
	public Lorry(int engineSize, int numberOfWheels, int weight){
		super(engineSize, numberOfWheels);
		this.weight = weight;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	

}
