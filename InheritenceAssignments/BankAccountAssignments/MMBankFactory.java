package com.BankAccount;

public abstract class MMBankFactory extends BankFactory {
	private SavingsAccount customerSavingAccount;
	private CurrentAccount customerCurrentAccount;
	

	public MMBankFactory() {
		super();
	}


	@Override
	public SavingsAccount getNewSavingAccount(int accountNumber, String accountHolderName,double accountBalance, boolean issalaried){
		customerSavingAccount= new MMSavingsAccount(accountNumber, accountHolderName, accountBalance, issalaried);
		return customerSavingAccount;
	}
	
	
	
	@Override
	public  CurrentAccount getNewCurrentAccount(int accountNumber, String accountHolderName,double accountBalance, double creditLimit){
		customerCurrentAccount=new MMCurrentAccount(accountNumber, accountHolderName, accountBalance, creditLimit);
		return customerCurrentAccount;
	}
	
 

}
