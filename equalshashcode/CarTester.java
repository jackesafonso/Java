package com.fdmgroup.equalshashcode;



public class CarTester {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setCc(1000);
		Car c2 = new Car();
		c2.setCc(1000);
		
		System.out.println(c1.equals(c2) && c1.hashCode() == c2.hashCode() );
		
		
		
		
		
	}

}
