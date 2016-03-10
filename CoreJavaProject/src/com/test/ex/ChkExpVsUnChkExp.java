package com.test.ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ChkExpVsUnChkExp {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		
		//Step1
		int result = 10/5;
		System.out.println("Result " + result);
		
		//Step2
		FileInputStream fStream = new FileInputStream("unknown.txt");
		fStream.read();
	}
	

}
