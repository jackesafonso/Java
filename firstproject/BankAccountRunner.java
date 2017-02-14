package com.fdmgroup1.firstproject;

public class BankAccountRunner {

	public static void main(String[] args) {
		
		
		BankAccount adrianAccount = new BankAccount(123456,1000.00,"Adrian");
		//adrianAccount.setAccountname("Adrian");
		//System.out.println(adrianAccount.getAccountName());
		//adrianAccount.setAccountname("Adrian new name");
		System.out.println(adrianAccount.getAccountId());
		System.out.println(adrianAccount.getAccountBalance());
		System.out.println(adrianAccount.getAccountName());
		
		
		//BankAccount jackesAccount = new BankAccount();
		//jackesAccount.setAccountname("Jackes");
		//System.out.println(jackesAccount.getAccountName());
		//jackesAccount.setAccountname("Jackes has renamed himself");
		//System.out.println(jackesAccount.getAccountName());
		
	}

}
