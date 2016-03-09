package com.test.oops.v3;

public abstract class Car {
	
	public void start(){
		System.out.println(" Start () ..");
	}

	
	public void stop(){
		System.out.println(" Stop () ..");
	}
	
	//public abstract void move(); //Blank
	
	public void move(){
		System.out.println(" Error , Sub CLass should provide the B.L");
	}
}
