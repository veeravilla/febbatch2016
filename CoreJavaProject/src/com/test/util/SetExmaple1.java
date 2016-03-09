package com.test.util;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExmaple1 {

	public static void main(String[] args) {
		Set<String> strSet = new TreeSet<String>();//new HashSet<String>();
		
		strSet.add("Rama"); // Index 0
		strSet.add("Rama");
		strSet.add("Jhon");
		strSet.add("Steve");
		strSet.add("Krishna");
		strSet.add("Tim");
		strSet.add("Jhon");
		
		strSet.add("Rama"); // Index 0
		strSet.add("Rama");
		strSet.add("Jhon");
		strSet.add("Steve");
		strSet.add("Krishna");
		strSet.add("Tim");
		strSet.add("Jhon");
		System.out.println(" Size  " + strSet.size());
		System.out.println(strSet);
		
		
	}

}
