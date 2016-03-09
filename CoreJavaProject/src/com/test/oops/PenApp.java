package com.test.oops;


public class PenApp {

	public static void main(String[] args) {
		
	//Create Object
	Pen p1 = new Pen();
	p1.inkColor = "Red";
	p1.write();
	
	Pen p2 = new Pen("Blue");
	//p2.inkColor = "Blue";
	p2.write();

	}

}
