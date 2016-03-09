package com.test.oops.v2;

public class Nissan implements Car{
	
	public void backupCamera(){
		System.out.println(" Nissan bkpCamera ...");
	}
	
	@Override
	public void move() {
		System.out.println(" Nissan Move ()  ...");
	}

	@Override
	public void start() {
		System.out.println(" Nissan Start ()  ...");
		
	}

	@Override
	public void stop() {
		System.out.println(" Nissan Stop ()  ...");
	}
}
