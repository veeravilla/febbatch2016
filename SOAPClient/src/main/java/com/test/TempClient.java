package com.test;

import net.webservicex.ConvertTemperature;
import net.webservicex.ConvertTemperatureSoap;
import net.webservicex.TemperatureUnit;

public class TempClient {

	public static void main(String[] args) {
		ConvertTemperature temperature = new ConvertTemperature();
		ConvertTemperatureSoap service = temperature.getConvertTemperatureSoap();
		double temp = service.convertTemp(90d, TemperatureUnit.DEGREE_FAHRENHEIT,TemperatureUnit.DEGREE_CELSIUS);
		System.out.println("Temp :::: " + temp);

	}

}
