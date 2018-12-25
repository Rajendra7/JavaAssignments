package com.cg.BankAccount;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {
	private double accountBalance;
	private int acountId;
	private String accountHolderName;
	private boolean isSalaried;
	public BankAccount(double accountBalance, int acountId,
			String accountHolderName, boolean isSalaried) {
		super();
		this.accountBalance = accountBalance;
		this.acountId = acountId;
		this.accountHolderName = accountHolderName;
		this.isSalaried = isSalaried;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public int getAcountId() {
		return acountId;
	}
	public void setAcountId(int acountId) {
		this.acountId = acountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public boolean isSalaried() {
		return isSalaried;
	}
	public void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}
	@Override
	public String toString() {
		return "BankAccount [accountBalance=" + accountBalance + ", acountId="
				+ acountId + ", accountHolderName=" + accountHolderName
				+ ", isSalaried=" + isSalaried + "]";
	}

	public static File getCustomerList (
			List<BankAccount> customerList, File file) {
		FileOutputStream fileOutputStream=null;
		ObjectOutputStream objectOutputStream=null;
		
		try {
			fileOutputStream=new FileOutputStream(file);
			objectOutputStream =new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(customerList);
			objectOutputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return file;
	}
	public static List<BankAccount> getList(String filePath) throws ClassNotFoundException, IOException {
		List<BankAccount> list =new ArrayList<BankAccount>();
		FileInputStream fileInputStream =null;
		ObjectInputStream objectInputStream =null;
		
		try {
			fileInputStream=new FileInputStream(filePath);
			objectInputStream=new ObjectInputStream(fileInputStream);
			list=(ArrayList<BankAccount>)objectInputStream.readObject();
			objectInputStream.close();
			return list;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;	
	}
	
}
	
