/*Write a program that prints how many days you have been alive.
*/
package com.cg.DateTime;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

public class DaysAliveTest {
	private DaysAlive daysAlive;

	@Test
	public void daysAlivetest() {
		daysAlive=new DaysAlive();
		LocalDate dateBefore = LocalDate.of(1996, Month.JANUARY, 9);
	
		long numberOfDays=daysAlive.numberOfDaysAlive(dateBefore);
		assertEquals(8387,numberOfDays);
		
		
	}

}