/*Write a Java application that displays today's date. You want the date to be displayed in the following format: week day, month, date, and year.

More specifically you want your Java application to display the date in the following manner:

Tuesday, October 12, 2010*/



package com.cg.DateTime;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;

import org.junit.Test;

public class DisplayTodayDateTest {

	private DisplayTodayDate todayDate;

	@Test
	public void currentDateTest() {
		todayDate=new DisplayTodayDate();
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
		String givenDateFormat=todayDate.toString(sdf);
		String expected="Tuesday, December 25, 2018";
		assertEquals(expected,givenDateFormat);
		
	}


}
