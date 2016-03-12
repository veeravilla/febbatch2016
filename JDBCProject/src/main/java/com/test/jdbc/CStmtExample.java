package com.test.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

public class CStmtExample {

	public static void main(String[] args)  throws Exception {
		
		Connection connection = DbUtil.getDBConnection();
		CallableStatement cstmt = connection.prepareCall("{call  addStudent}"); //("? = {call  addStudent(?,?)}");
		//cstmt.registerOutParameter(1, Types.FLOAT);
		cstmt.execute();
		//cstmt.getInt(1);
		connection.close();
	}

}
