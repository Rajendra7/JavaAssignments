package com.BankAccount;

public class MMCurrentAccount extends CurrentAccount {

	
	public MMCurrentAccount(int accountNumber, String accountHolderName,
			double accountBalance, double creditLimit) {
		super(accountNumber, accountHolderName, accountBalance, creditLimit);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount<=getAccountBalance())
			depositAmount(-withdrawAmount);
		else if(withdrawAmount<= (getAccountBalance()+creditLimit) && !(creditLimit<=0))
			depositAmount(-withdrawAmount);

	}

	@Override
	public String toString() {
		return "MMCurrentAccount [creditLimit=" + creditLimit + ", toString()="
				+ super.toString() + ", getAccountNumber()="
				+ getAccountNumber() + ", getAccountHolderName()="
				+ getAccountHolderName() + ", getAccountBalance()="
				+ getAccountBalance() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	

}
