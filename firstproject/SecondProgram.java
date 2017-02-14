package com.fdmgroup1.firstproject;

public class SecondProgram {

	public int doubleIt(int myValue){
		myValue = myValue * 2;
		return myValue;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean check = true;
		int age = 21;

		if (check == true) {
			System.out.println(check);
		}
		if (age == 21) {

		}

		int count = 0;
		for (count = 0; count < 10; count++) {
			System.out.println(count);
		}

		int factor = 10;
		int newAge = age * factor;

		System.out.println(newAge);
		
		
		SecondProgram sp = new SecondProgram();
		int newNewAge = sp.doubleIt(newAge);
		System.out.println("New age " +newAge);

	}

}
