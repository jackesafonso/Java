package com.fdmgroup.accounts;

public class BankAccount {
	
	private double balance =0; //Member variable - do not need to be initialised 

	public void deposit(double amount) {
		balance+=amount;
		
	}

	public double getBalance() {
		
		return balance;
	}

}
