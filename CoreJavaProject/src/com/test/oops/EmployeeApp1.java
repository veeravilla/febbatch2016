package com.test.oops;

public class EmployeeApp1 {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setEno(1234);
		emp1.setEname("Jhon");
		emp1.setSalary(4500);
		
		
		Employee emp2 = new Employee();
		emp2.setEno(2323);
		emp2.setEname("Tim");
		emp2.setSalary(9098);
		
		
		Employee emp3 = new Employee();
		emp3.setEno(1234);
		emp3.setEname("Jhon");
		emp3.setSalary(4500);
		
		if(emp1.equals(new Pen())){
			System.out.println(" Both Objects are Equal");
		}else
			System.out.println(" Not Equal");

	}

}
