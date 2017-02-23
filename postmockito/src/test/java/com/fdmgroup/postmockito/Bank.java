package com.fdmgroup.postmockito;

public class Bank {
	
	private BankAccount bankAccount;

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
		
	}

	public void displayAllAccounts() {
		
		bankAccount.displayAccount();
		
	}
	

}
