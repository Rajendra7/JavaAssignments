package com.BankAccount;

public abstract class SavingsAccount extends BankAccount {
	

	private boolean isSalaried;
	private final static double minimumBalance=1000;
	

	public SavingsAccount(int accountNumber, String accountHolderName,
			double accountBalance, boolean isSalaried) {
		super(accountNumber, accountHolderName, accountBalance);
		this.isSalaried = isSalaried;
	}

	@Override
	public abstract double withdrawAmount(double withdrawAmount);

	@Override
	public String toString() {
		return "savingsAccount [isSalaried=" + isSalaried
				+ ", getAccountNumber()=" + getAccountNumber()
				+ ", getAccountHolderName()=" + getAccountHolderName()
				+ ", getAccountBalance()=" + getAccountBalance()
				+ ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	

}
