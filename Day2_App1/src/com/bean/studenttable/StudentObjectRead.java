/**
 * 
 */
package com.bean.studenttable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Robert Joasilus
 *
 * @date: Oct 12, 2022
 */
public class StudentObjectRead {
	public static void main(String[] args) {
    File file=new File("text.txt");
		
		try {
		
			FileInputStream fis= new FileInputStream(file);
			ObjectInputStream ois= new ObjectInputStream(fis);
			Object obj= ois.readObject();
			List<StudentBean> list=(List<StudentBean>)obj;
			
			
			for (StudentBean studentBean : list) {
				System.out.println(studentBean);
			}
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
