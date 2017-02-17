package com.fdmgroup.accounts;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {
	
	@Test
	public void testThatTheAccountIsOpenedAndTheAccountNotNull(){
		
		BankAccount account = new BankAccount();
		assertNotNull(account);
	}
	
	@Test
	public void testThatWhenIDeposit50ThatTheBalanceIs50(){
		
		BankAccount account = new BankAccount();
		account.deposit(50.0);
		double balance = account.getBalance();
		assertEquals(50,balance,0.01);
	}

}
