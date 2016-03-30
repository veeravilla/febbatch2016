package com.test;

import net.webservicex.Currency;
import net.webservicex.CurrencyConvertor;
import net.webservicex.CurrencyConvertorSoap;

public class CurrencyClient {
	
	public static void main(String args[]){
		CurrencyConvertor convertorClient = new CurrencyConvertor(); //client Class
		CurrencyConvertorSoap convertorSoap= convertorClient.getCurrencyConvertorSoap(); //Interface Ref  //Proxy Object
		double rate = convertorSoap.conversionRate(Currency.USD, Currency.INR);
		System.out.println(" Rate : " + rate);
	}

}
