package com.test.oops;

public class CarApp {

	public static void main(String[] args) {
		Car car = new BMW();
		car.start();
		car.move();
		car.stop();
		if(car instanceof BMW){
			BMW bmw = (BMW) car;
			bmw.moonRoof();
		}else if(car instanceof Nissan){
			Nissan nissan = (Nissan) car;
			nissan.backupCamera();
		}else if(car instanceof Honda){
			Honda honda =(Honda) car;
			honda.navigation();
		}
			
		

	}

}
