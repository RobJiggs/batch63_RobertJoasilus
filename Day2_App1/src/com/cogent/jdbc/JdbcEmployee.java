/**
 * 
 */
package com.cogent.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Robert Joasilus
 *
 * @date: Oct 11, 2022
 */


public class JdbcEmployee {
	
	void insertEmployee(int id, String name,String email) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root",
					"Ghandi217!");
			
			
			
			PreparedStatement psmt = con.prepareStatement("insert into employee(empno,empname,email) values(?,?,?)");
			
		
			
			psmt.setInt(1, id);
			psmt.setString(2, name);
			psmt.setString(3, email);
			
			int i=psmt.executeUpdate();
			System.out.println(i+"records inserted");
			psmt.close();
			
			con.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e);
		}	
		
		
	}
	
	void updateEmployee(String name,int id) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root",
					"Ghandi217!");
			
			
			
			PreparedStatement psmt = con.prepareStatement("update employee set empname=? where empno=?;");
			
		
			
			psmt.setString(1, name);
			psmt.setInt(2, id);
		
			
			int i=psmt.executeUpdate();
			System.out.println(i+"records Updated");
			psmt.close();
			
			con.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e);
		}	
		
		
		
		
	}
	void deleteEmployee(int id) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root",
					"Ghandi217!");
			
			
			
			PreparedStatement psmt = con.prepareStatement("delete from employee where empno= ?;");
			
		
			
			psmt.setInt(1, id);
		
			
			int i=psmt.executeUpdate();
			System.out.println(i+"records Deleted");
			psmt.close();
			
			con.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e);
		}	
		
		
		
		
		
	}
	
	
	void findEmployeeById(int id) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root",
					"Ghandi217!");
			
			
			
			PreparedStatement psmt = con.prepareStatement("select empname,email from employee where empno= ?;");
			ResultSet rst=null;
			psmt.setInt(1, id);
			
			rst=psmt.executeQuery();
			
			System.out.println("Name   Email");
			 while(rst.next()) {
		            System.out.print(rst.getString(1));
		            System.out.print("    "+rst.getString(2));
		            System.out.println();
		         }
		
			
		
		
			
			
			
			psmt.close();
			
			con.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e);
		}	
		
		
		
		
		
	}
	
	void findEmployeeByName(String name) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root",
					"Ghandi217!");
			
			
			
			PreparedStatement psmt = con.prepareStatement("select empno,empname,email from employee where empname= ?;");
			ResultSet rst=null;
			psmt.setString(1,name);
		
			rst=psmt.executeQuery();
			
			System.out.println("Id     Name    Email");
			 while(rst.next()) {
				    System.out.print(rst.getInt(1));
		            System.out.print("      "+rst.getString(2));
		            System.out.print("      "+rst.getString(3));
		            System.out.println();
		         }
		
			
		
		
			
		
			
			psmt.close();
			
			con.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e);
		}	
		
		
		
		
		
	}
	
	void findEmployeeByEmail(String email) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/classicmodels?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root",
					"Ghandi217!");
			
			
			
			PreparedStatement psmt = con.prepareStatement("select empno,empname from employee where email= ?;");
			ResultSet rst=null;
			psmt.setString(1,email);
			
			rst=psmt.executeQuery();
			
			System.out.println("Id     Name");
			 while(rst.next()) {
				    System.out.print(rst.getInt(1));
		            System.out.print("      "+rst.getString(2));
		           
		            System.out.println();
		         }
		
			
		
		
			
		
			
			psmt.close();
			
			con.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e);
		}	
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		JdbcEmployee jdbcEmployee = new JdbcEmployee();
	
		jdbcEmployee.findEmployeeByEmail("@gmail");
		
		
		
	}
	

}
