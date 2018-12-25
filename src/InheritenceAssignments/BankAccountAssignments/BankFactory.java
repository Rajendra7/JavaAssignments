package com.BankAccount;

/**
 * 
 * @author rajendra
 *
 */
public abstract class BankFactory  {
	public abstract SavingsAccount getNewSavingAccount(int accountNumber, String accountHolderName,double accountBalance, boolean issalaried);
	public abstract CurrentAccount getNewCurrentAccount(int accountNumber, String accountHolderName,double accountBalance, double creditLimit);
	

}
