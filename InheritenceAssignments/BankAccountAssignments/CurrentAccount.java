package com.BankAccount;

public abstract class CurrentAccount extends BankAccount {
	protected final double creditLimit;
	

	public CurrentAccount(int accountNumber, String accountHolderName,
			double accountBalance, double creditLimit) {
		super(accountNumber, accountHolderName, accountBalance);
		this.creditLimit = creditLimit;
	}
	@Override
	public abstract void withdrawAmount(double withdrawAmount);
	@Override
	public String toString() {
		return "currentAccount [creditLimit=" + creditLimit
				+ ", getAccountNumber()=" + getAccountNumber()
				+ ", getAccountHolderName()=" + getAccountHolderName()
				+ ", getAccountBalance()=" + getAccountBalance()
				+ ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}
