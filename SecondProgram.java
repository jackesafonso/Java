package com.fdmgroup.firstproject;

public class SecondProgram {

	// 1. a method with an argument and a return value
	public int doubleIt(int myValue) {
		myValue = myValue * 2;
		return myValue;

	}

	public static void main(String[] args) {

		// 2. if statements
		boolean check = true;
		int age = 21;

		if (check) {
			System.out.println(check);
		}
		if (age == 21) {

		}

		// 3. using a for loop
		int count = 0;
		for (count = 0; count < 10; count++) {
			System.out.println(count);
		}

		int factor = 10;
		int newAge = age * factor;

		System.out.println(newAge);

		// 4. calling a method with an argument and returning a value
		SecondProgram sp = new SecondProgram();
		int newNewAge= sp.doubleIt(newAge);
		System.out.println("New age: "+newNewAge);

	}

}
