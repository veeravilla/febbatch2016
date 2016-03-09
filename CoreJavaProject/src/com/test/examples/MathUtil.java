package com.test.examples;

public class MathUtil {
	
	public static void add(int a,int b){
		int result = a + b;
		System.out.println(" Result " + result);
	}
	
	public static void interestCal(int months,int amount,int rate){
		int output = (months*amount*rate)/100;
		System.out.println(" Result " + output);
	}
	
	public static int inCal(int months,int amount,int rate){
		int output = (months*amount*rate)/100;
		return output;
	}

}
