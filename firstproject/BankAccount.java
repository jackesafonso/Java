package com.fdmgroup1.firstproject;

public class BankAccount {

	private int accountId;
	private double accountBalance;
    private String accountName;
	private final int overdraft = 100;
	
	static int numberOfAccounts = 0;
	
	BankAccount(int accountId, double accountBalance, String accountName){
		this.accountId=accountId;
		this.accountBalance = accountBalance;
		this.accountName = accountName;
		
	}
	
	
	
    
    public int getAccountId(){
    	return accountId;
    }
    
    public void setAccountId(int accountId){
    	this.accountId = accountId;
    	
    }
	
    public String getAccountName(){
    	return accountName;
    }
    
    public void setAccountname(String accountName){
    	this.accountName = accountName;
    }
    
    public double getAccountBalance(){
    	return accountBalance;
    }
    
    public void setAccountBalance(){
    	
    	this.accountBalance = accountBalance;
    }
    
	static int numberofAccounts = 0;

	
}
