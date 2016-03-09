package com.test.oops.v2;

public class CarAppV1 {

	public static void main(String[] args) {
		Car car = null;
		if(args[0].equals("Honda")){
			car = new Honda();
		}else if(args[0].equals("Nissan")){
			car = new Nissan();
		}else if(args[0].equals("BMW")){
			car = new BMW();
		}else{
			System.out.println(" Invalid Car");
			System.exit(0);
		}
		
		car.start();
		car.move();
		car.stop();
		if( car instanceof Sports){
			System.out.println("Sports Car B.L");
		}
	}

}
