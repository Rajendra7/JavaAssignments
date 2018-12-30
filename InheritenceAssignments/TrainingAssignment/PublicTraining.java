package com.Inheritence;

public class PublicTraining extends Training {

	private int participantNumber;

	public PublicTraining(String subject, int fees,int participantNumber) {
		super(subject, fees);
		this.participantNumber=participantNumber;
		
	}

	@Override
	public int getOrderValue() {
		int charges=participantNumber*getFees();
		return charges;
	}

}
