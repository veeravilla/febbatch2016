package com.test.jdbc;

import java.sql.Connection;
import java.sql.Statement;

class BatchExample {

	public static void main(String[] args) throws Exception {
		
		Connection connection = DbUtil.getDBConnection();
		Statement stmt = connection.createStatement();
		
		stmt.addBatch("Update Sample Set Col1 = 'New Data'");
		stmt.addBatch("Delete From Sample");
		stmt.addBatch("Insert into Sample Values('Rama','Krishna');");
		
		stmt.executeBatch();

	}

}
