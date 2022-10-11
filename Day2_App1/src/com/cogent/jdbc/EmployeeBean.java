/**
 * 
 */
package com.cogent.jdbc;

/**
 * @author Robert Joasilus
 *
 * @date: Oct 11, 2022
 */
public class EmployeeBean {

	private int empId;
	private String empName;
	private String email;
	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return " [empId=" + empId + ", empName=" + empName + ", email=" + email + "]";
	}
	
    	
	
	
}
