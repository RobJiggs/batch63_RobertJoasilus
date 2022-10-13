/**
 * 
 */
package com.bean.studenttable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 * @author Robert Joasilus
 *
 * @date: Oct 12, 2022
 */
public class StudentObjectWriter {

	public static void main(String[] args) {
		List<StudentBean> arr= new ArrayList<>();
		String file="text.txt";
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
		
			fos= new FileOutputStream(file);
			oos= new ObjectOutputStream(fos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/batch63?characterEncoding=utf8";
			Connection con = DriverManager.getConnection(url, "root",
					"Ghandi217!");
			System.out.println("connection started");
			PreparedStatement psmt = con.prepareStatement("select * from student");
			
			ResultSet rs=null; 
			rs=psmt.executeQuery();
		
			while(rs.next()) {
				StudentBean sb= new StudentBean(rs.getInt(1),rs.getString(2),rs.getString(3));
				arr.add(sb);
				System.out.println("record added");
	         }
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			oos.writeObject(arr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
