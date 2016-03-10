package com.test.util;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class ReadFile {

	public static void main(String[] args)  throws Exception{
		
		String fileData = FileUtils.readFileToString(new File
				("C:\\Users\\Veeru\\git\\febbatch2016\\CoreJavaProject\\src\\com\\test\\examples\\DoWhileDemo.java"));
		
		System.out.println(fileData);

	}

}
