package com.cg.grepApplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GrepApplication {
	
	public String searchNumberAndline(FileReader filereader, String word) throws IOException {
		String lineNumberAndLine="";
		String line="";
		int lineNumber=0;
		BufferedReader bufferReader= new BufferedReader(filereader);
		while((line=bufferReader.readLine())!=null) {
			
			lineNumber++;
			String[] words=line.split(" ");
			for(int counter=0;counter<words.length;counter++)
			{
				if(words[counter].equals(words))
				{
					lineNumberAndLine=lineNumber+" "+bufferReader.readLine();
				}
			}
		}
		return line;
	}
}
