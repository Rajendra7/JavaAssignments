package com.Inheritence;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrainingTest {
	private Training publicTraining,corporateTraining;
	public void setup() {
		publicTraining=new PublicTraining("Java",5000,50);
		corporateTraining=new CorporateTraining("BigData",35000,4);
		
	}

	@Test
	public void publicTrainingCharges() {
		int answer = publicTraining.getOrderValue();
		assertEquals(25000,answer);
	}
	@Test
	public void corporateTrainingCharges() {
		int answer = corporateTraining.getOrderValue();
		assertEquals(140000,answer);
	}

}
