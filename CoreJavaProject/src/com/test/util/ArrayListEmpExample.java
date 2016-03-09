package com.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListEmpExample {

	public static void main(String[] args) {
		
		List<Employee> empList = new Vector<Employee>();//new LinkedList<>();//new ArrayList<Employee>();
		empList.add( new Employee(101, "Rama", 4500));
		empList.add( new Employee(98, "Jhon", 123));
		empList.add( new Employee(123, "Tim", 6767));
		empList.add( new Employee(12, "Ken", 345));
		empList.add( new Employee(101, "Rama", 4500));
		empList.add( new Employee(98, "Jhon", 123));
		empList.add( new Employee(101, "Rama", 4500));
		
		System.out.println(empList);
		
	if(	empList.contains(new Employee(101, "Rama", 4500))){
		System.out.println("Found");
	}else
		System.out.println("Not Found");
	
	System.out.println(" Before Sort  : " + empList);
	
	//Collections.sort(empList);
	//Collections.sort(empList,new NameSort());
	Collections.sort(empList,new SalSort());
	
	System.out.println(" Afrer Sort : " + empList);
		

	}

}
