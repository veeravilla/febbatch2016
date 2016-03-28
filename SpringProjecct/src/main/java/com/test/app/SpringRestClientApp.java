package com.test.app;

import org.hibernate.id.CompositeNestedGeneratedValueGenerator.GenerationContextLocator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.client.RestTemplate;

import com.test.google.jaxb.GeoCodeResponse;
import com.test.jaxb.PersonResponse;

public class SpringRestClientApp {
	
	public static void main(String s[]){
		//Spring Container
		ApplicationContext springContainer = new ClassPathXmlApplicationContext("restContext.xml");
				
		RestTemplate restTemplate = springContainer.getBean(RestTemplate.class);
		
		GeoCodeResponse response = restTemplate.getForObject("https://maps.googleapis.com/maps/api/geocode/json?address=1600+Amphitheatre+Parkway,+Mountain+View,+CA", GeoCodeResponse.class);
		
		System.out.println(response);
		
		//PersonResponse personResponse = restTemplate.getForObject("http://localhost:8080/RestWebApp/api/person/999", PersonResponse.class);
		
		//System.out.println(personResponse);
		
		/*//Student student = restTemplate.getForObject("http://localhost:8080/WebAppProject/mvc/student/{sno}", Student.class,102);
				
		//System.out.println(student);
		
		IPDetails ipDetails = restTemplate.getForObject("http://freegeoip.net/json/", IPDetails.class);
		
		System.out.println(ipDetails);*/
		
	}
	
}
