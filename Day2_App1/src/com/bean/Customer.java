/**
 * 
 */
package com.bean;

/**
 * @author Robert Joasilus
 *
 * @date: Sep 23, 2022
 */
public class Customer {
	private int custID;
	private String custName;
	private String custLoc;
	private int custPhno;
	/**
	 * @param custID
	 * @param custName
	 * @param custLoc
	 * @param custPhno
	 */
	public Customer(int custID, String custName, String custLoc, int custPhno) {
		super();
		this.custID = custID;
		this.custName = custName;
		this.custLoc = custLoc;
		this.custPhno = custPhno;
	}
	
	public String display() {
		return "Customer [custID=" + custID + ", custName=" + custName + ", custLoc=" + custLoc + ", custPhno="
				+ custPhno + "]";
	}
	
	
	
	
	
}
