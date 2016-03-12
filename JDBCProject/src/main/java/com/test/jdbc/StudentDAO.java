package com.test.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;


public class StudentDAO {
	
	public boolean add(int sno,String sname,String course,int fee,String zipCode){
		try{
			//DB Connection
			Connection connection =  DbUtil.getDBConnection();
			
			String sql = " Insert into Student Values ( " + 
					sno + " , '" +
					sname + " ' , '" +
					course + "'," + fee + ",'"+ zipCode + "')" ;
			
			System.out.println(sql);
			
			//Perform DB operations
			Statement stmt = connection.createStatement();
			
			stmt.executeUpdate(sql);
			
			connection.close();
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return false;
	}
	
	public boolean add(StudentDTO studentDTO){
		try{
			//DB Connection
			Connection connection =  DbUtil.getDBConnection();
			
			String sql = " Insert into Student Values (?,?,?,?,?)" ;
			
			System.out.println(sql);
			
			//Perform DB operations
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, studentDTO.getSno());
			pstmt.setString(2, studentDTO.getSname());
			pstmt.setString(3, studentDTO.getCourse());
			pstmt.setInt(4, studentDTO.getFee());
			pstmt.setString(5,studentDTO.getZipCode());
			pstmt.executeUpdate();
			connection.close();
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return false;
	}

}
