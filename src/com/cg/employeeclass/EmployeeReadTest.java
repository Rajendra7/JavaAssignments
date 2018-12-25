package com.cg.employeeclass;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class EmployeeReadTest {
	private EmployeeRead employeeRead;
	
	@Before
	public void setup() {
		employeeRead=new EmployeeRead();
	}

	@Test
	public void testForEmployeeRead() throws IOException {
		FileReader fileReader;
		try {
			fileReader = new FileReader("src/com/cg/employeeclass/123.txt");
			String employeeDetails=employeeRead.employeeRead(fileReader);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
