package com.test.jaxb;

import java.awt.font.GlyphJustificationInfo;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.google.gson.Gson;
import com.test.xproject.Address;
import com.test.xproject.Person;

public class XMLTest {

	public static void main(String[] args) throws Exception {
		Person person = new Person();
		person.setPid(789);
		person.setPname("Jhon");
		person.setAddress(new Address("Plymoth", "MN", "55447"));
		
		Gson gson = new Gson();
		String jsonData = gson.toJson(person);
		System.out.println(" Json " +jsonData);
		
		Person person2 = gson.fromJson(jsonData, Person.class);
		System.out.println("From Json" + person2);
		
		JAXBContext jc = JAXBContext.newInstance("com.test.xproject");
		Marshaller marshaller = jc.createMarshaller();
		marshaller.marshal(person,System.out);
		
		String xmlData = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><person xmlns=\"http://www.test.com/xproject\"><pid>789</pid><pname>Jhon</pname><address><city>Plymoth</city><state>MN</state><zipcode>55447</zipcode></address></person>";
		Unmarshaller unmarshaller = jc.createUnmarshaller();
		Person person1 = (Person)unmarshaller.unmarshal(new StringReader(xmlData));
		System.out.println(person1);
	}

}
