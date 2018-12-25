import static org.junit.Assert.*;

import java.sql.Savepoint;

import org.junit.Before;
import org.junit.Test;


public class BankTest {
	private Bank bank1;
	private Bank bank2;
	
	@Before
	public void setup()
	{
		 bank1=new Bank("Raj",10000);
		 bank2=new Bank("Taj",20000);
	}

	@Test
	public void testForBalance() {
		int result=bank1.balance(bank1);
		assertEquals(10000,result);
	}
	@Test
	public void testForAccountNumber() {
		long result=bank1.accountNumber();
		assertEquals(100,result);
	}
	@Test
	public void testForDeposit() {
		double result=bank1.deposit(1000);
		assertEquals(11000,result,2);
	}
	@Test
	public void testForWithdraw() {
		double result=bank1.withdraw(1000);
		assertEquals(9000,result,2);
	}
	@Test
	public void testForZeroBalance() {
		double result=bank1.zeroBalance(bank1);
		assertEquals(10000,result,2);
	}
	@Test
	public void testForGetNextAccountNumber() {
		long result=bank1.getNextAccountNumber();
		assertEquals(12341,result,2);
	}
	@Test
	public void testForTrasferFunds() {
		boolean flag=PaymentGateway.trasfer(bank1,bank2,1000);
		assertTrue(flag);
	}
	
	
	

}
