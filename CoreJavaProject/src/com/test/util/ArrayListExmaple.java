package com.test.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExmaple {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		
		strList.add("Rama"); // Index 0
		strList.add("Rama");
		strList.add("Jhon");
		strList.add("Steve");
		strList.add("Krishna");
		strList.add("Tim");
		strList.add("Jhon");
		
		//strList.remove("Rama");
		
		System.out.println(strList);
		
		//Read The Elements
		for(int i =0;i<strList.size() ;i++ ){
			System.out.println(strList.get(i).toUpperCase());
		}
		
		System.out.println("################");
		
		for(String str :strList){
			System.out.println(str.toUpperCase());
			/*if(str.equals("Rama"))
				strList.remove("Rama");*/
		}
		
		System.out.println("################");
		
		Iterator<String> iterator = strList.iterator();
		while(iterator.hasNext()){
			String str = iterator.next();
			System.out.println(str.toUpperCase());
			if(str.equals("Rama"))
				iterator.remove();
		}
		
		System.out.println(strList);
		
		System.out.println("FWD --> ################");
		ListIterator<String> listIterator = strList.listIterator();
		while(listIterator.hasNext()){
			String str = listIterator.next();
			System.out.println(str.toUpperCase());
			if(str.equals("Jhon")){
				listIterator.remove();
				listIterator.add("New Element...");
			}
		}
		System.out.println(strList);
		
		System.out.println("PREVIOUS --> ################");
		while(listIterator.hasPrevious()){
			String str = listIterator.previous();
			System.out.println(str.toUpperCase());
			if(str.equals("New Element...")){
				listIterator.remove();
				listIterator.add("New Element Jhon...");
			}
		}
		System.out.println(strList);
		
	}

}
