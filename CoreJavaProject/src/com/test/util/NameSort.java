package com.test.util;

import java.util.Comparator;

public class NameSort implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		System.out.println( emp1 + " vs " + emp2);
		return emp1.getEname().compareTo(emp2.getEname());
	}

}
