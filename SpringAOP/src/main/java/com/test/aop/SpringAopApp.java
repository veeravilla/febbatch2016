package com.test.aop;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAopApp {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		EmployeeService service = applicationContext.getBean("empService",EmployeeService.class);
		
		List<Employee> empList = service.findAllEmployeeByName("Rama");
		
		Employee emp =service.findEmployee(234);
		
		//emp.setEno(565656);
		
		Employee emp1 = applicationContext.getBean("employee",Employee.class);

		emp1.setEno(666);
		
		emp1.setSalary(6777f);
		
	//	System.out.println(empList);
		System.out.println(emp);
	}

}
