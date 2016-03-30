package com.test.aop;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("empService")
public class EmployeeService {
	
	public Employee findEmployee(int eno){
		//TODO : JDBC Logic
		return new Employee(eno, "Ravi" + eno, 1000f);
	}
	
	public List<Employee> findAllEmployeeByName(String name){
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee(101, "Ravi", 567f));
		list.add(new Employee(102, "Murali", 342f));
		list.add(new Employee(103, "Krishna", 10000f));
		list.add(new Employee(104, "Raja", 4545f));
		list.add(new Employee(105, "Suman", 222f));
		list.add(new Employee(106, "Giri", 8989f));
		
		return list;
		
	}

}
