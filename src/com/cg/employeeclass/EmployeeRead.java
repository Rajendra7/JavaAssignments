package com.cg.employeeclass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;

public class EmployeeRead implements Serializable {
	
	public String employeeRead(FileReader filereader) throws IOException {
		String line= "";
		String result=" ";
		BufferedReader bufferReader= new BufferedReader(filereader);
		while((line=bufferReader.readLine())!=null) {
			result +=line;
		}
		return result;
	}

}
