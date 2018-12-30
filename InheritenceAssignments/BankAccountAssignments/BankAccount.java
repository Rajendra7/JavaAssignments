package com.BankAccount;

abstract class BankAccount {
	private int accountNumber;
	private String accountHolderName;
	private double accountBalance;
	public BankAccount(int accountNumber, String accountHolderName,
			double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public abstract void withdrawAmount(double withdrawAmount);
	public void depositAmount(double depositAmount)
	 {
		 if(depositAmount>0)
			 accountBalance+=depositAmount;
	 }
	
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber
				+ ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + "]";
	}
	
	

}
