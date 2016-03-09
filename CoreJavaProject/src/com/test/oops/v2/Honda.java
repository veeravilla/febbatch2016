package com.test.oops.v2;

public  class Honda implements Car,Sports{
	
	public void navigation(){
		System.out.println(" Honda  Navigation ...");
	}

	@Override
	public void start() {
		System.out.println(" Honda  start ...");
		
	}

	@Override
	public void stop() {
		System.out.println(" Honda  stop ...");
	}

	@Override
	public void move() {
		System.out.println(" Honda  move ...");
	}

}
