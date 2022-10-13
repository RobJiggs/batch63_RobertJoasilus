/**
 * 
 */
package com.cogent.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author Robert Joasilus
 *
 * @date: Oct 12, 2022
 */
public class JdbcProp {
	public static void main(String[] args) {
	Properties prop=new Properties();
	File f= new File("jdbc.properties");
	String url=null;
	try {
		FileInputStream fis= new FileInputStream(f);
		prop=new Properties();
		prop.load(fis);
	}
	catch(FileNotFoundException fnfe) {
		
		fnfe.printStackTrace();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String username=prop.getProperty("User");
	String password =prop.getProperty("Password");
	String driver=prop.getProperty("driver");
		
	try {
			Class.forName(driver);
			 url=prop.getProperty("url");
			 
			Connection con = DriverManager.getConnection(url,username ,
					password);
		}
	catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
			
			
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
	
	
	
	}
}
