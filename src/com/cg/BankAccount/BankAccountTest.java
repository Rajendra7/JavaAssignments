	/*Create a Class SavingAccount with field’s acc_balance, acc_ID, accountHoldername, isSalaryAccount. Also add setter and getter methods with business method like withdraw and deposit.
a.	Create 5 different object of SavingAccount and add them into ArrayList, now interate the arraylist and display all SavingAccount’s object one by one.
b.	Now save the ArrayList which contains SavingAccount’s object into a file and read the file and display all savingAccount Object one by one.
c.	Create class BankAccountList which will maintain SavingAccount objects. Ensure that this class should not allow duplicates as well as data should be displayed in sorted order. (as per acc_ID)  

*/
package com.cg.BankAccount;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
	private BankAccount customerOne;
	private BankAccount customerTwo;
	private BankAccount customerThree;
	private BankAccount customerFour;
	private BankAccount customerFive;
	private List<BankAccount> savingAccountList =new ArrayList<BankAccount>();
	
	@Before
	public void setup() {
		customerOne=new BankAccount(10000, 101, "Rajendra", true);
		customerTwo=new BankAccount(20000, 102, "Bhanu", false);
		customerThree=new BankAccount(25000, 105, "Prasath", true);
		customerFour=new BankAccount(12000, 120, "Hema", false);
		customerFive=new BankAccount(50000, 123, "Srivani", true);
		
		savingAccountList.add(customerOne);
		savingAccountList.add(customerTwo);
		savingAccountList.add(customerThree);
		savingAccountList.add(customerFour);
		savingAccountList.add(customerFive);
	}

	@Test
	public void testForCustomerDetails() {
		System.out.println("The Customers are");
		Iterator<BankAccount> iterator=savingAccountList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	@Test
	public void testForWhetherFileExistsOrNot() {
		File file=new File("C:/Users/kaprajen/Desktop/123.txt");
		File file1=BankAccount.getCustomerList(savingAccountList, file);
		System.out.println(file1.exists());
	}
	
	@Test
	public void testForWritingAndReadingCustomerDetails() {
		String filePath ="C:/Users/kaprajen/Desktop/123.txt";
		
		
		try {
			List<BankAccount> list = BankAccount.getList(filePath);
			
			Iterator<BankAccount> iterator = list.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
				
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	
}
