package com.test.examples;

public class HelloWorld {

	public static void main(String[] args) {
		
	//Logic
	System.out.println("Hello World");
	
	generatePayStub();

	add(10,20);
	
	add(99,1);
	
	add(3,4);

	}
	
	public static void generatePayStub(){
		System.out.println("Generated Pay Stub .....");
	}
	
	public static void add(int x, int y){
		int result = x + y;
		System.out.println("Result " + result);
	}

}
