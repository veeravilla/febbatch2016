package com.test.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TransactionMgmt {

	public static void main(String[] args) {
		Connection connection = DbUtil.getDBConnection();
		
		try{
			connection.setAutoCommit(false);
			
			PreparedStatement pstmt = connection.prepareStatement("Insert into Student Values (?,?,?,?,?)");
			
			//Step1
			pstmt.setInt(1, 55555);
			pstmt.setString(2, "Junk");
			pstmt.setString(3, "Mock");
			pstmt.setInt(4, 3456);
			pstmt.setString(5,"11111");
			pstmt.executeUpdate();
			
			//Step2
			pstmt.setInt(1, 900091);
			pstmt.setString(2, "Junk");
			pstmt.setString(3, "Mock");
			pstmt.setInt(4, 3456);
			pstmt.setString(5,"11111");
			pstmt.executeUpdate();
			
			connection.commit();
		}catch(Exception ex){
			ex.printStackTrace();
			try{
				connection.rollback();
			}catch(Exception ex1){
				ex1.printStackTrace();
			}
			
		}finally {
			try{
				connection.close();
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}

	}

}
