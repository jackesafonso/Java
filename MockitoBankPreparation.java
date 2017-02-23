package com.fdmgroup.mockitotest;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mock.*;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

public class MockitoBankPreparation {
	
	@Mock
	private BankAccount BankAccount;

	
	@Test
	public void whenICallDisplayAllAccountsMethodOnBankAccountControllerCheckDisplayMethodCalledForOneAccount()
	{
	  BankAccountController controller = new BankAccountController();
	  BankAccount account = Mockito.mock(BankAccount.class);
	  controller.setBankAccount(account); // error will be fixed shortly
	  controller.displayAllAccounts();
	  verify(account,times(1)).display();
	}
	
	@Test
	public void whenICallGetBalancesOnBankAccountControllerCheckGetBalanceMethodCalledForOneAccount()
	{
	  BankAccountController controller = new BankAccountController();
	  BankAccount account = Mockito.mock(BankAccount.class);
	  controller.setBankAccount(account);
	  double totalMoney = controller.getBalances();
	  //verify(account,times(1)).getBalance();
	  Mockito.when(account.getBalance()).thenReturn(50.0);
	}
	
	
	
	
	
	@Test
	public void whenICallGetBalancesOnBankAccountControllerTwiceThenCheckItReturnsTheSameValue()
	{
	  BankAccountController controller = new BankAccountController();
	  BankAccount account = Mockito.mock(BankAccount.class);
	  controller.setBankAccount(account);
	  double totalMoney = controller.getBalances();
	  double totalMoneySecond = controller.getBalances();
	 // verify(account,times(2)).getBalance();
	  //Mockito.when(account.getBalance()).thenReturn(50.0);
	  assertEquals(totalMoney, totalMoneySecond,0.01);
	}
	
	
	@Test
	public void whenICallGetAccountOnBankAccountControllerTwiceWithSameAccountNumberThenCheckItReturnsTheSameValue()
	{
	  BankAccountController controller = new BankAccountController();
	  BankAccount account = Mockito.mock(BankAccount.class);
	  controller.setBankAccount(account);
	  ArrayList<Account> accountOne = controller.getAccount(12345);
	  ArrayList<Account> accountTwo = controller.getAccount(12345);
	  
	  assertArrayEquals(accountOne, accountTwo);
	}



}
