package com.test.jdbc;

public class DBApp {

	public static void main(String[] args) {
		StudentDAO studentDAO = new StudentDAO();
		//studentDAO.add(999, "Rama", "MBBS", 3456, "56564");
		StudentDTO studentDTO = new StudentDTO(8765, "Tao",  3456,"MJ", "56521464");
		studentDAO.add(studentDTO);
	}

}
