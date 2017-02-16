package com.fdmgroup.pensions.task3;

public class View {

	public void printEligible(Person individualPerson) {
		System.out.println(individualPerson.getFirstName() + " " + individualPerson.getLastName() + " may qualify");

	}

	public void printIneligible(Person individualPerson) {
		System.out.println(individualPerson.getFirstName() + " " + individualPerson.getLastName() + " may not qualify");

	}

}
