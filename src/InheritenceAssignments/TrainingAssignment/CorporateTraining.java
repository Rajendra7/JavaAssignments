package com.Inheritence;

public class CorporateTraining extends Training {

	private int days;

	public CorporateTraining(String subject, int fee,int days) {
		super(subject, fee);
		this.days=days;
	}

	@Override
	public int getOrderValue() {
		
		int charges=days*getFees();
		return charges;
	}

}
