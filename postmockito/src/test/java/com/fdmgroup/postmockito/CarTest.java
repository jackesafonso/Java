package com.fdmgroup.postmockito;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class CarTest {

	@Mock
	private Wheel wheel;

	@Test
	public void testThatWhenIDriveTheCarTheWheelSpins() {

		Car car = new Car();
		wheel = Mockito.mock(Wheel.class);
		car.setWheel(wheel);
		// Wheel wheel = new Wheel(); //can not be used on mockito because we
		// need a mock
		car.drive();
		// verify is a static method in mockito class
		Mockito.verify(wheel).spin();
		Mockito.verify(wheel).spin(Mockito.anyInt());
		Mockito.verify(wheel).spin(Mockito.anyString());

	}

	@Test
	public void testThatWhenIAccelerateThatTheMethodSpinFasterIsCalledonTheWheel() {
		// Arrange
		Car car = new Car();
		wheel = Mockito.mock(Wheel.class);
		car.setWheel(wheel);

		// Act
		car.accelarate();

		// Assert
		Mockito.verify(wheel).spinFaster();
		
		System.out.println("Mock size " +wheel.getSize());
		Mockito.when(wheel.getSize()).thenReturn(200000); // example of stubbing - when I call the
                                                           //mock object I want this value to be 
		                                                   //returned
		
		System.out.println("Mock size after stubbing " +wheel.getSize());
		
		Wheel realWheel = new Wheel();
		System.out.println("The real size "+realWheel.getSize());
		
	}

}
