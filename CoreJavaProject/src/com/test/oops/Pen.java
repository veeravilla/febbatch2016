package com.test.oops;

public class Pen {
	
	String inkColor; //Default
	
	public void write(){
		System.out.println(" Pen color : " + inkColor); 
	}
	
	public Pen(){
		//B.L
		System.out.println(" Creating New Pen Object ...");
	}
	
	public Pen(String inkColor){
		this.inkColor = inkColor;
		System.out.println(" Creating New Pen Object ...");
	}

}
