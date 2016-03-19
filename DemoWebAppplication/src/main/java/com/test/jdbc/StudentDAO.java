package com.test.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


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
	
	public StudentDTO getStudentBySno(int sno){
		try{
			//DB Connection
			Connection connection =  DbUtil.getDBConnection();
			
			String sql = "Select * from Student where sno = ?" ;
			
			System.out.println(sql);
			
			//Perform DB operations
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, sno);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()){
				StudentDTO stuDTO = mapDBRecord(rs);
				return stuDTO;
			}
			connection.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		return null;
	}
	
	public List<StudentDTO> getAllStudents(){
		List<StudentDTO> stuList = new ArrayList<StudentDTO>();
		
		try{
			//DB Connection
			Connection connection =  DbUtil.getDBConnection();
			
			String sql = "Select * from Student" ;
			
			//Perform DB operations
			PreparedStatement pstmt = connection.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				StudentDTO stuDTO = mapDBRecord(rs);
				stuList.add(stuDTO);
			}
			connection.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		return stuList;
	}
	
	private StudentDTO mapDBRecord(ResultSet rs) throws Exception{
		StudentDTO stuDTO = new StudentDTO();
		stuDTO.setSno(rs.getInt("Sno"));
		stuDTO.setSname(rs.getString("Sname"));
		stuDTO.setCourse(rs.getString("Course"));
		stuDTO.setFee(rs.getInt("Fee"));
		stuDTO.setZipCode(rs.getString("Zipcode"));
		return stuDTO;
	}
	
	public boolean update(StudentDTO studentDTO){
		try{
			//DB Connection
			Connection connection =  DbUtil.getDBConnection();
			
			String sql = "Update Student Set sname = ? , course = ? , fee =? ,zipcode = ? where sno = ?" ;
			
			System.out.println(sql);
			
			//Perform DB operations
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(5, studentDTO.getSno());
			pstmt.setString(1, studentDTO.getSname());
			pstmt.setString(2, studentDTO.getCourse());
			pstmt.setInt(3, studentDTO.getFee());
			pstmt.setString(4,studentDTO.getZipCode());
			pstmt.executeUpdate();
			connection.close();
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return false;
	}

	public boolean delete(int sno){
		try{
			//DB Connection
			Connection connection =  DbUtil.getDBConnection();
			
			String sql = "Delete from  Student where sno = ?" ;
			
			System.out.println(sql);
			
			//Perform DB operations
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, sno);
			pstmt.executeUpdate();
			connection.close();
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return false;
	}

}
