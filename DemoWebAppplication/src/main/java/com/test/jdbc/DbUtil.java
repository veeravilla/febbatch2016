package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;

import sun.awt.windows.WPrinterJob;

public class DbUtil {
	
	private static Properties dbProperties = new Properties();
	
	private static BasicDataSource datasource = new BasicDataSource();
	
	static{
		try{
			System.out.println( " Loading Db Properties ....");
			
			//dbProperties.load(DbUtil.class.getResourceAsStream("dev-db.properties"));

			//JVM Argument
			dbProperties.load(DbUtil.class.getResourceAsStream("db.properties"));
			
			System.out.println(dbProperties);
			
			System.out.println(" Configuring DB Connection Pooilng");
			
			datasource.setDriverClassName(dbProperties.getProperty("db.driverclass"));
			datasource.setUrl(dbProperties.getProperty("db.url"));
			datasource.setUsername(dbProperties.getProperty("db.username"));
			datasource.setPassword(dbProperties.getProperty("db.password"));
			datasource.setInitialSize(20);
			
		}catch(Exception ex){
			ex.printStackTrace();
			System.out.println("Failed to Load DB Properties !!!!");
		}
	}
	
	/*public static Connection getDBConnection(){
		try{
			//Load Driver Class
			Class.forName(dbProperties.getProperty("db.driverclass"));
					
			//Connection
			Connection connection = DriverManager.
									getConnection(dbProperties.getProperty("db.url"), 
											dbProperties.getProperty("db.username"), dbProperties.getProperty("db.password"));
			return connection;
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return null;//
	}*/
	
	public static Connection getDBConnection(){
		try{
			return datasource.getConnection();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return null;//
	}
	
	

}
