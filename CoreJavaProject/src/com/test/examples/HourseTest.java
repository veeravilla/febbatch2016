package com.test.examples;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HourseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(solution("10:00", "13:21"));
		
		System.out.println(solution("09:42", "11:42"));

	}
	
	public static int solution(String E, String L) {
		try{
			
			long second = 1000l;
	        long minute = 60l * second;
	        long hour = 60l * minute;
	        
			DateFormat format = new SimpleDateFormat("HH:mm");
			Date startTime = format.parse(E);
			Date endTime = format.parse(L);
			long diff = endTime.getTime() - startTime.getTime();
			
			double hours = diff / hour;
			double min = (diff % hour) / minute;
			
			int fee = 2 + ((hours >= 1) ? 3 : 0) + (int)((hours > 1) ? ((hours-1)) * 4 : 0) + (int)((min > 0) ?  4 : 0); 
			
			return fee;
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		return 0;
    }
	
	

}
