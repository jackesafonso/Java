package com.fdm.mockito.bankaccount;

public class BankAccountController {

	private BankAccount account;
	private Object account2;

	public void setBankAccount(BankAccount account) {
		this.account = account;
		
	}

	public void displayAllAccounts() {
	
		account.display();
		account.getBalance();
		
		
		
	}

	
		
	

	public double getBalances() {
		
		return 50.0;
	}

}
