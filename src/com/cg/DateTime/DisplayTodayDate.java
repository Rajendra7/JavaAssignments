package com.cg.DateTime;

import java.text.SimpleDateFormat;
import java.util.Date;

import java.time.LocalDate;
import java.time.Month;

public class DisplayTodayDate {
	String stringDate="";

	
	public String toString(SimpleDateFormat sdf) {
		String stringDate = sdf.format(new Date());
		
		return stringDate;
	
	}

}
