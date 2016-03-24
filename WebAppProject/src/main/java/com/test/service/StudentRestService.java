package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.jaxb.Student;
import com.test.jpa.service.StudentService;

@Controller
public class StudentRestService {
	
	@Autowired
	private StudentService stuBusinessService;

	@RequestMapping(method=RequestMethod.GET,value="/student/{sno}")
	public @ResponseBody Student getStudent(@PathVariable Integer sno){
//		Student student = new Student(sno,"Rama","MS",7800);
		return stuBusinessService.getStudent(sno);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/student")
	public @ResponseBody Student saveStudent(@RequestBody Student student){
		stuBusinessService.save(student);
		return student;
	}
}
