package com.cg.file;
/**
 * @author rajendra
 */

import java.io.File;

public class FileExists {

	public boolean fileExists(boolean b) {
		boolean flag = false;
		File f=new File("abc.txt");
		if(f.exists())
			flag= true;
		else
			flag= false;
		return flag;
	}

}
