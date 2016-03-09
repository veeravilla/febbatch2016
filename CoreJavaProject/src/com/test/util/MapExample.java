package com.test.util;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String,String> strMap = new Hashtable<String,String>();
		
		strMap.put("101", "Rama");
		strMap.put("101", "Ravi");
		strMap.put("456", "Giri");
		strMap.put("56", "Tim");
		
		System.out.println(" 101 --> " + strMap.get("101"));

		Set<String> keys = strMap.keySet();
		for(String key: keys){
			System.out.println( key + " --> " + strMap.get(key));
		}
	}

}
