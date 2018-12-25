package com.BankAccount;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
	private BankAccount bankAccount;
	private SavingsAccount savingsAccount;
	private CurrentAccount currentAccount;
	
	@Before
	public void setup() {
		
		savingsAccount=new MMSavingsAccount(101,"Raj",10000,true);
		currentAccount=new MMCurrentAccount(102,"Tej",15000,100);
		
	}
	@Test
	public void testForSavingAccountWithdraw() {
		 savingsAccount.withdrawAmount(1000);
		
		System.out.println(savingsAccount.getAccountBalance());
	}

}
