package com.Inheritence;
/**
 * 
 * @author rajendra
 *
 */
public abstract class Training {
	protected int id;
	private String Subject;
	private int fees;
	static int increment=0;
	
	{
		id=100;
		increment=increment++;
		id=id+increment;
	}
	public Training(String subject, int fees) {
		this.Subject = subject;
		this.fees = fees;
	}

	public String getSubject() {
		return Subject;
	}


	public void setSubject(String subject) {
		Subject = subject;
	}


	public int getFees() {
		return fees;
	}


	public void setFee(int fees) {
		this.fees = fees;
	}

	public abstract int getOrderValue();
	
	

}