package com.test.ex;

import com.test.util.Employee;

public class ExceptionDemoV2 {

	public static void main(String[] args) {
		
		System.out.println(" $$$$$$$$$$$ Start $$$$$$$$$$");
		
		
		try{
			//Step1
			int result = 10/2;
			System.out.println(" Result " + result);
			
			//Step2
			String names[] = { "Jhon","Ravi","Steve" };
			System.out.println(" 4th Name : " + names[3]);
			
			//Step3
			Employee emp = new Employee(101, "Tim", 2000);
			System.out.println(" Emp Name : " + emp.getEname());
		}catch(ArithmeticException ae){
			ae.printStackTrace();
			//Fallback Logic
		}catch(ArrayIndexOutOfBoundsException ae){
			ae.printStackTrace();
		}catch(NullPointerException ne){
			ne.printStackTrace();
		}
		
		System.out.println(" $$$$$$$$$$$ End $$$$$$$$$$");
	}

}
