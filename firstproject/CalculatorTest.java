package com.fdmgroup.firstproject;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testThatWhenIAddOnePlusOneItReturnsTwo() {

		Calculator calc = new Calculator();
		double result = calc.add(1, 1);
		assertEquals(2, result, 0.01);

	}
	
	@Test
	public void testThatWhenISubstractTwoFromFiveItReturnsThree(){
		
		Calculator calc = new Calculator();
		double result = calc.subtract(5,2);
		assertEquals(3,result,0.01);
		
	}
		
	@Test
	public void testThatWhenIMultiplyTwoByTwoItReturnsFour(){
		
		Calculator calc = new Calculator();
		double result = calc.multiply(2,2);
		assertEquals(4,result,0.01);
	}
	
	
	@Test
	public void testThatWhenIDevideTenByTwoItReturnsFive(){
		
		Calculator calc = new Calculator();
		double result = calc.devide(10,2);
		assertEquals(5,result,0.01);
	}
		
	
}
