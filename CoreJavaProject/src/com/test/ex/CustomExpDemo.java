package com.test.ex;

public class CustomExpDemo {

	public static void main(String[] args) {

		try{
			validate(890);
		}catch(CustomException ce){
			System.out.println(" Error Code " + ce.getExpCode() + " Msg  : " + ce.getExpMsg());
			ce.printStackTrace();
		}
		
	}
	
	public static void validate(int eno) throws CustomException{
		if(eno < 0 || eno > 500)
		{
			CustomException cEx= new CustomException("C100", "Eno Can't be < 0 or > 500");
			throw cEx;
		}
	}

}
