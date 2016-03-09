package com.test.oops.v2;

public class BMW implements Car,Sports{
	
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
	public void stop(){
		System.out.println("BMW Stop ...");
	}

}
