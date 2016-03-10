package com.test.ex;

import com.test.util.Employee;

public class ExceptionDemoV1 {

	public static void main(String[] args) {
		
		System.out.println(" $$$$$$$$$$$ Start $$$$$$$$$$");
		//Step1
		try{
			int result = 10/0;
			System.out.println(" Result " + result);
		}catch(ArithmeticException ae){
			ae.printStackTrace();
			//Fallback Logic
		}
		
		
		//Step2
		try{
			String names[] = { "Jhon","Ravi","Steve" };
			System.out.println(" 4th Name : " + names[3]);
		}catch(ArrayIndexOutOfBoundsException ae){
			ae.printStackTrace();
		}
		
		//Step3
		try{
			Employee emp = new Employee(101, "Tim", 2000);
			System.out.println(" Emp Name : " + emp.getEname());
		}catch(NullPointerException ne){
			ne.printStackTrace();
		}
		
		System.out.println(" $$$$$$$$$$$ End $$$$$$$$$$");
	}

}
