package com.fdmgroup.pensions.task3;

public class PensionLogic {

	public boolean isPensionable(Person person, String year) {
		// this method (parseInt) converts String dateOfBirth into Integer
		int yearAsInt = Integer.parseInt(year);

		if (yearAsInt < 1952) {
			return true;
		} else {
			return false;
		}

		// converting int into string
		// int age = 21;
		// String strAge=""+age;
		// System.out.println(strAge);

	}

}
