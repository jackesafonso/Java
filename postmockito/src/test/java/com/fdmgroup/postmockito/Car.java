package com.fdmgroup.postmockito;

public class Car {
                          // Must import org.mockito.Mockito -- get 
	                      // (marven dependency Mockitocopy) dependency from google
	                       // and past within  <dependency> </dependency> on pom file
	
	private Wheel Wheel; //Member variable must be created

	public void drive() {
		
		Wheel.spin();
		Wheel.spin(1);
		Wheel.spin("a");
		Wheel.spin(1,"Adrian");
		Wheel.spin(1,"A" , "B" , "C", "D");
		
		
	}

	public void setWheel(Wheel wheel) {
		
		this.Wheel = wheel;
		
	}

	public void accelarate() {
		Wheel.spinFaster();
		
	}

}
