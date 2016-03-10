package com.test.ex;

public class ThrowsDemo {

	public static void main(String[] args) {
		System.out.println(cal(9,10));
		System.out.println(cal(10,6));
	}
	
	public static int cal(int a, int b) throws ArithmeticException{
		return a/b;
	}

}
