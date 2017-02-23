package com.fdmgroup.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.fdmgroup1.firstproject.Car;

public class ExceptionsExamples {

	// ALARM could go off
	public void openFile(String filename) throws FileNotFoundException {

		if (!filename.equals("Adrian")) {
			throw new FileNotFoundException("The file doesnt exist");
			// ALARM goes off
		}

	}

	public void validate(int number) throws CustomException {
		if (number < 0 || number > 100) {
			throw new CustomException("Number of out of range");
		}
	}

	public static void main(String[] args) {

		ExceptionsExamples ee = new ExceptionsExamples();

		try {
			ee.openFile("Jackes");
			ee.validate(1);

//		} catch (FileNotFoundException fnf) {
//			fnf.printStackTrace();
//		
		}catch(IOException ioe){
			ioe.printStackTrace();
		
		

		} catch (CustomException e) {
			e.printStackTrace();
		

	}
	}

	// Object obj = null;
	// obj.hashCode();
	// Car c=null;
	// c.drive();
	//
	// int divisor = 0;
	// int result = 1/divisor;

	// int divisor = 0;
	// int result = 0;
	//
	// try {
	// result = 1 / 0;
	// } catch (ArithmeticException e) {
	// e.printStackTrace();
	// } catch( ArrayIndexOutOfBoundsException i){
	//
	// } finally{
	//
	// }
	//
	//
	// System.out.println("Im here");

}
