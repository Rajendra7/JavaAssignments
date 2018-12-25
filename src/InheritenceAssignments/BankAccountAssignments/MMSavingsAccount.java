package com.BankAccount;
/**
 * 
 * @author rajendra
 *
 */

public class MMSavingsAccount extends SavingsAccount {
	private static final double minimumBalance=1000;
	public MMSavingsAccount(int accountNumber, String accountHolderName,
			double accountBalance, boolean isSalaried) {
		super(accountNumber, accountHolderName, accountBalance, isSalaried);
		
	}


	@Override
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount<=this.getAccountBalance() || withdrawAmount>=minimumBalance)
			super.depositAmount(-withdrawAmount);
		
	}


	@Override
	public String toString() {
		return "MMSavingsAccount [toString()=" + super.toString()
				+ ", getAccountNumber()=" + getAccountNumber()
				+ ", getAccountHolderName()=" + getAccountHolderName()
				+ ", getAccountBalance()=" + getAccountBalance()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
