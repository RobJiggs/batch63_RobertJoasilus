/**
 * 
 */
package com.cogent.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Robert Joasilus
 *
 * @date: Oct 10, 2022
 */
public class JdbcExample {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root",
					"Ghandi217!");
			
			
			
			PreparedStatement psmt = con.prepareStatement("delete from student where stuno= ?;");
			
		
			
			psmt.setInt(1, 101);
			int i=psmt.executeUpdate();
			System.out.println(i+"records deleted");
			psmt.close();
			
			con.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}