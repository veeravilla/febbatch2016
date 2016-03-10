package com.test.ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ChkExpVsUnChkExp2 {

	public static void main(String[] args){
		
		//Step1
		int result = 10/5;
		System.out.println("Result " + result);
		
		try{
			//Step2
			FileInputStream fStream = new FileInputStream("unknown.txt");
			fStream.read();
		}catch(Exception ex){
			System.out.println(" Failed to read the file!!!");
		}
	/*catch(FileNotFoundException fe){
			System.out.println("File Not Found !!!!");
		}catch(IOException io){
			System.out.println("IOException !!!!1");
		}*/
		
	}
	

}
