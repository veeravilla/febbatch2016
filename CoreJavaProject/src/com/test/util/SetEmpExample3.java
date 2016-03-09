package com.test.util;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEmpExample3 {

	public static void main(String[] args) {
		
		Set<Employee> empSet = new TreeSet<Employee>(new SalSort());//new HashSet<Employee>();
		
		empSet.add( new Employee(101, "Rama", 4500));
		empSet.add( new Employee(98, "Jhon", 123));
		empSet.add( new Employee(123, "Tim", 6767));
		empSet.add( new Employee(12, "Ken", 345));
		empSet.add( new Employee(101, "Rama", 4500));
		empSet.add( new Employee(98, "Jhon", 123));
		empSet.add( new Employee(101, "Rama", 4500));
		
		empSet.add( new Employee(101, "Rama", 4500));
		empSet.add( new Employee(98, "Jhon", 123));
		empSet.add( new Employee(123, "Tim", 6767));
		empSet.add( new Employee(12, "Ken", 345));
		empSet.add( new Employee(101, "Rama", 4500));
		empSet.add( new Employee(98, "Jhon", 123));
		empSet.add( new Employee(101, "Rama", 4500));
		
		System.out.println("Size   " + empSet.size());
		

	}

}
