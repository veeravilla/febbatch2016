package com.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExmaple1 {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		
		strList.add("Rama"); // Index 0
		strList.add("Rama");
		strList.add("Jhon");
		strList.add("Steve");
		strList.add("Krishna");
		strList.add("Tim");
		strList.add("Jhon");
		System.out.println(strList);
		
		if(strList.contains("Jhon")){
			System.out.println("Element found");
		}else
			System.out.println("Not Found");
		
		System.out.println("Before Sort " + strList);
		Collections.sort(strList);
		System.out.println("After Sort " + strList);
	}

}
