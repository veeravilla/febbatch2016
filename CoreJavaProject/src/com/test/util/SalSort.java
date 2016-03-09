package com.test.util;

import java.util.Comparator;

public class SalSort implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		System.out.println( emp1 + " vs " + emp2);
		if(emp1.getSal() > emp2.getSal()){
			return 1;
		}else if(emp1.getSal() < emp2.getSal()){
			return -1;
		}else
			return 0;
	}

}
