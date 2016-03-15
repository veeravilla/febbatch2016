package com.test.jpa;

import java.util.List;

import com.test.dao.StudentDAO;
import com.test.pojo.Student;

public class JAPDAOApp {

	public static void main(String[] args) {
		StudentDAO studentDAO = new StudentDAO();
		
		//Insert
		//studentDAO.save(new Student(4442, "YYYY", "MS", 9009));
		
		//Update
		//studentDAO.update(new Student(102, "ABC", "MN", 7777));
		
		//Delete
		//studentDAO.delete(999);
		
		//Find / Read
		Student student = studentDAO.findBySno(104);
		
		System.out.println(student);
		
		List<Student> stuList =  studentDAO.getAllStudentsByFee(7000); //studentDAO.getAllStudentsByName("Ti%");//
		for(Student stu : stuList){
			System.out.println(" ############# " + stu);
		}
		//System.out.println(" student  ########### "+studentDAO.getAllStudents());

	}

}
