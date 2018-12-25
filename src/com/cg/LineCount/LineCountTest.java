package com.cg.LineCount;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class LineCountTest {
	private LineCount count;
	
	@Before
	public void setup() {
		count=new LineCount();
	}

	@Test
	public void test()  {
		try {
			int answer=count.lineCount("C:/Users/kaprajen/Desktop/123.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
