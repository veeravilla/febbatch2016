package com.test.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class SetExmaple2 {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		
		strList.add("Rama"); // Index 0
		strList.add("Rama");
		strList.add("Jhon");
		strList.add("Steve");
		strList.add("Krishna");
		strList.add("Tim");
		strList.add("Jhon");
		
		strList.add("Rama"); // Index 0
		strList.add("Rama");
		strList.add("Jhon");
		strList.add("Steve");
		strList.add("Krishna");
		strList.add("Tim");
		strList.add("Jhon");
		
		System.out.println("Size   " + strList.size());
		System.out.println(strList);
		
		Set<String> strSet =  new HashSet<String>(strList);
		System.out.println("Size   " + strSet.size());
		System.out.println(strSet);
		
		
	}

}
