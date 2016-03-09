package com.test.oops.v2;

public class CarApp {

	public static void main(String[] args) {
		Car car = new Honda();
		car.start();
		car.move();
		car.stop();
		if( car instanceof Sports){
			System.out.println("Sports Car B.L");
		}
	}

}
