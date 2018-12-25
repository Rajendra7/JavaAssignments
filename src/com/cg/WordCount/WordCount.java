package com.cg.WordCount;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {

	public int wordCount(String string) throws IOException {
		File file=new File(string);
		FileReader filereader = new FileReader(file);
		BufferedReader bufferReader =new BufferedReader(filereader);
		int count=0;
		String line=bufferReader.readLine();
		while(line!=null)
		{
			String []parts = line.split(" ");
	          for( String w : parts)
	          {
	            count++;        
	          }
	          line = bufferReader.readLine();
		}
		System.out.println(count);
		return count;
	}

}
