package com.fdm.mockito.bankaccount;

import org.junit.Test;

import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;



public class BankAccountControllerTest {
	
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
	  verify(account,times(0)).getBalance();
	}
	
	
	@Test
	public void whenICallGetBalancesOnBankAccountControllerTwiceThenCheckItReturnsTheSameValue()
	{
	  BankAccountController controller = new BankAccountController();
	  BankAccount account = Mockito.mock(BankAccount.class);
	  controller.setBankAccount(account);
	  double totalMoney = controller.getBalances();
	  double totalMoneySecond = controller.getBalances();
	  //verify(account,times(2)).getBalance();
	  Mockito.when(account.getBalance()).thenReturn(50.0);
	  assertEquals(totalMoney, totalMoneySecond,0.01);
	}

	




}
