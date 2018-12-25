package com.cg.file;
/**
 * @author rajendra
 */

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FileExistsTest {
	private FileExists file;
	
	@Before
	public void setup() {
		
		file=new FileExists();
	}

	@Test
	public void testForFileExists() {
		boolean flag=file.fileExists(true);
		assertFalse(flag);
	}

}
