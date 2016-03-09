package com.test.oops;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		/*emp1.ename="Jhon";
		emp1.salary=4500;
		emp1.eno=1234;*/
		emp1.setEno(1234);
		emp1.setEname("Jhon");
		emp1.setSalary(4500);
		
		
		Employee emp2 = new Employee();
		/*emp2.ename="Tim";
		emp2.salary=5600;
		emp2.eno=100;*/
		emp2.setEno(2323);
		emp2.setEname("Tim");
		emp2.setSalary(9098);
		
		
		Employee emp3 = new Employee();
		/*emp3.ename="Steve";
		emp3.salary=900;
		emp3.eno=234;*/
		emp3.setEno(909);
		emp3.setEname("Steve");
		emp3.setSalary(12);
		
		emp1.printPayStub();
		emp2.printPayStub();
		emp3.printPayStub();

	}

}
