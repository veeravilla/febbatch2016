package com.test.util;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapExample2 {

	public static void main(String[] args) {
		Map<Employee,String> strMap = new HashMap<Employee,String>();
		
		strMap.put(new Employee(101,"Rama",4566), "Rama");
		strMap.put(new Employee(101,"Rama",4566), null);
		strMap.put(new Employee(102,"Tim",23), "Giri");
		strMap.put(null, "Tim");
		
		System.out.println(" 101 --> " + strMap.get(new Employee(101,"Rama",4566)));

		Set<Employee> keys = strMap.keySet();
		for(Employee key: keys){
			System.out.println( key + " --> " + strMap.get(key));
		}
	}

}
