package com.test.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.test.pojo.Course;
import com.test.pojo.Student;
import com.test.pojo.User;

public class JPAExample {
	
	public static void main(String s[]){
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("jpa-example");
		
		EntityManager emManager = emFactory.createEntityManager();
		
		EntityTransaction transaction = emManager.getTransaction();
		
		transaction.begin();
		
		Student stuObj = emManager.find(Student.class, 9999);
		
		stuObj.setSname("Gopal");
		stuObj.setFee(78888);
		System.out.println(stuObj);
		
		transaction.commit();
		emManager.close();
		
		//Insert
		//Student student = new Student(87777,"Tao","MS",2345);
		//emManager.persist(student);
		
		
		
		//emManager.remove(stuObj); //Delete
		
		//stuObj.setSname("UpXXX");
		
		//Student student1 = emManager.find(Student.class, 5432);
		
		//Student student2 = emManager.find(Student.class, 5432);
		
		
	//	System.out.println("Student ############ " + student);
		
		
		//System.out.println("Student ############ " + student1);
		//System.out.println("Student ############ " + student2);
		
		//emManager.close();
		/*EntityTransaction transaction = emManager.getTransaction();
		//Begin --> Insert/Create , Update , Delete
		transaction.begin();
		
		//DB Oeprations
	
		//Insert
		Student student = new Student(5432,"Tao","MS",2345);
		emManager.persist(student);
		transaction.commit();
		emManager.close();*/
	}

}
