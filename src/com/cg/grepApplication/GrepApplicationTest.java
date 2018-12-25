package com.cg.grepApplication;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class GrepApplicationTest {
	private GrepApplication search;
	
	@Before
	

	@Test
	public void testForSearchWord() {
		search=new GrepApplication();
		String searchWord="rajendra";
		try {
			FileReader fileReader=new FileReader("C:/Users/kaprajen/Desktop/123.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*String actual=search.searchNumberAndline(fileReader, searchWord);
		String expected="hii rajendra";
		assertEquals(expected, actual);*/
		
	}

}
