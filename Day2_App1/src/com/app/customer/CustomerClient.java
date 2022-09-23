/**
 * 
 */
package com.app.customer;
import com.bean.Customer;

/**
 * @author Robert Joasilus
 *
 * @date: Sep 23, 2022
 */
public class CustomerClient {
	
	public static void main(String[] args) {
		Customer c1=new Customer(11, "Ron Johnson", "New York", 91453679);
		System.out.println(c1.display());
		Customer custarray[]=new Customer[10];
		Customer c2=new Customer(11, "Ron Johnson", "New York", 91453679);
		Customer c3=new Customer(11, "Ron Johnson", "New York", 91453679);
		Customer c4=new Customer(11, "Ron Johnson", "New York", 91453679);
		Customer c5=new Customer(11, "Ron Johnson", "New York", 91453679);
		Customer c6=new Customer(11, "Ron Johnson", "New York", 91453679);
		Customer c7=new Customer(11, "Ron Johnson", "New York", 91453679);
		Customer c8=new Customer(11, "Ron Johnson", "New York", 91453679);
		Customer c9=new Customer(11, "Ron Johnson", "New York", 91453679);
		Customer c10=new Customer(11, "Ron Johnson", "New York", 91453679);
		custarray[0]=c1;
		custarray[1]=c2;
		custarray[2]=c3;
		custarray[3]=c4;
		custarray[4]=c5;
		custarray[5]=c6;
		custarray[6]=c7;
		custarray[7]=c8;
		custarray[8]=c9;
		custarray[9]=c10;
		for (Customer customer : custarray) {
			customer.display();
			
		}
		
	}

}
