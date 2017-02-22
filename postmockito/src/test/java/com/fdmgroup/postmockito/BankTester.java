package com.fdmgroup.postmockito;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class BankTester {
	
	@Mock
	private BankAccount bankAccount;
	
	@Test
	public void testThatWhenWeDisplayAllAccountThatWeCallDispayMethodForSingleAccount()
	{
		//arrange
		Bank bank = new Bank();
		bankAccount = Mockito.mock(BankAccount.class);
		bank.setBankAccount(bankAccount);
		
		//action
		bank.displayAllAccounts();
		
		//assert
		Mockito.verify(bankAccount).displayAccount(); 
		//Mockito.verify(bankAccount,Mockito.times(1)).displayAccount(); // Mockito.times(1)) check 
		                                                               //how many times displayAccount
		                                                               //was called. if the number is correct 
		                                                                //the test pass otherwise the test fails
	}

}
