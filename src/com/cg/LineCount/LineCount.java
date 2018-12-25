package com.cg.LineCount;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineCount {

	public int lineCount(String string) throws IOException {
		File file=new File(string);
		FileReader filereader = new FileReader(file);
		BufferedReader bufferReader =new BufferedReader(filereader);
		int lines=0;
		while(bufferReader.readLine()!=null) {
			lines++;
		}
		System.out.println(lines);
		return lines;
		
	}

}
