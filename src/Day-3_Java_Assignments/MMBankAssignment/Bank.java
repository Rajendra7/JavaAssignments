/**
 * 
 * @author Rajendra
 *
 */
public class Bank {
	private String name;
	private int intialBalance;
	private static long accountNumber;
	private static long accountNumberGenerator;
	static {
		accountNumberGenerator=12340;
		accountNumber=++accountNumberGenerator;
	}
	
	public Bank(String name, int intialBalance) {
		super();
		this.name = name;
		this.intialBalance = intialBalance;
	}
	
	@Override
	public String toString() {
		return "Bank [name=" + name + ", intialBalance=" + intialBalance + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static long getAccountNumber() {
		return accountNumber;
	}

	public static void setAccountNumber(int accountNumber) {
		Bank.accountNumber = accountNumber;
	}

	public int getIntialBalance() {
		return intialBalance;
	}
	public void setIntialBalance(int intialBalance) {
		this.intialBalance = intialBalance;
	}
	public int balance(Bank bank)
	{
		
		int balance=bank.getIntialBalance();
		return balance;	
	}
	
	public static long accountNumber()
	{
		accountNumber=100;
		
		return accountNumber;
	}
	public static long getNextAccountNumber()
	{
		
		return (long) accountNumberGenerator;
	}
	public double deposit(double depositAmount)
	{
		double balance=getIntialBalance()+depositAmount;
		return balance;
		
	}

	public double withdraw(double withdrawAmount) {
		double balance=getIntialBalance()-withdrawAmount;
		return balance;
	}

	public double zeroBalance(Bank bank) {
		if(getIntialBalance()==0)
			return 0;
		else
			return intialBalance;
	}
	
	


}
