package com.test.jpa.service;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.dao.pojo.Student;
import com.test.jpa.dao.StudentDAO;

@Service
@Transactional
public class StudentService {

	@Autowired
	StudentDAO studentDAO;
	
	@Autowired
	DozerBeanMapper dozermapper;
	
	//Get Student
	public com.test.jaxb.Student getStudent(Integer sno){
		Student student = studentDAO.read(sno);  
		com.test.jaxb.Student studentJAXB = dozermapper.map(student, com.test.jaxb.Student.class);
		return studentJAXB;
	}
	
	//Save
	public com.test.jaxb.Student save(com.test.jaxb.Student student){
		Student studentJPA = dozermapper.map(student, Student.class);
		studentDAO.create(studentJPA);  
		return student;
	}
}
