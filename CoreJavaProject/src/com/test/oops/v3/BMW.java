package com.test.oops.v3;

public class BMW extends Car{
	
	public void start(){
		System.out.println("BMW Start ...");
	}
	public void moonRoof(){
		System.out.println(" BMW MoonRoof ...");
	}
	@Override
	public void move() {
		System.out.println("BMW Move ...");
		
	}

}
