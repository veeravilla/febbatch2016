package com.test.api;

import java.io.FileInputStream;

public class ReadFile {

	public static void main(String[] args) throws Exception {
		FileInputStream stream = new FileInputStream("C:\\Feb2016\\CoreJavaProject\\src\\com\\test\\api\\readme.txt");
		
		int data;
		while((data=stream.read()) != -1){
			System.out.print((char)data);
		}
		stream.close();
	}

}
