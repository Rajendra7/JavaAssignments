package com.cg.WordCount;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class WordCountTest {
	private WordCount count;
	
	@Before
	public void setup() {
		count= new WordCount();
	}

	@Test
	public void testForWords() {
		try {
			int answer=count.wordCount("C:/Users/kaprajen/Desktop/123.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
