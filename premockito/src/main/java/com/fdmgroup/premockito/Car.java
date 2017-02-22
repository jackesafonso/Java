package com.fdmgroup.premockito;

public class Car {
	
	//class name Wheel and member variable wheel
	private Wheel wheel;

    public void setWheel(Wheel wheel) {
          this.wheel = wheel;
    }

    public void drive() {
          wheel.spin();
    }

    public static void main(String args[]) {
          Car car = new Car(); // class Car was instantiated in order to get the drive() method 
          Wheel wheel = new Wheel(); //class Wheel was instantiated in order to get the setWheel() method 
          car.setWheel(wheel);
          car.drive();
    }


}
