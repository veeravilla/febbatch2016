package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConnectionTest {
	
	public static void main(String args[]) throws Exception{
		
		//Load Driver Class
		//Class.forName("com.mysql.jdbc.Driver");
		
		//Connection
		Connection connection = DbUtil.getDBConnection();//DriverManager.
								//getConnection("jdbc:mysql://localhost:3306/mar2016db", "root", "root");
		
		
		Connection connection1 = DbUtil.getDBConnection();
		
		Connection connection2 = DbUtil.getDBConnection();
		
		//Perform DB Operations
		Statement stmt = connection.createStatement();
		
		//Create DB Table - DDL Commands
		//stmt.execute("CREATE TABLE Sample(col1 varchar(10),col2 varchar(10))");
		
		//Insert
		//int result = stmt.executeUpdate("Insert into Sample Values('Rama','Krishna');");
		
		//Update
		//int result = stmt.executeUpdate("Update Sample Set Col1 = 'New Data'");
		
		//Delete
		int result = stmt.executeUpdate("Delete From Sample");
		
		System.out.println(" Affected Records : " + result);
		
		
		//Close DB Connection
		connection.close();
	}

}
