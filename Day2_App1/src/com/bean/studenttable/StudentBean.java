/**
 * 
 */
package com.bean.studenttable;

import java.io.Serializable;

/**
 * @author Robert Joasilus
 *
 * @date: Oct 12, 2022
 */
public class StudentBean implements Serializable {
	private int studint;
	private String studname;
	private String email;
	public StudentBean(int studint, String studname, String email) {
		super();
		this.studint = studint;
		this.studname = studname;
		this.email = email;
	}
	/**
	 * @return the studint
	 */
	public int getStudint() {
		return studint;
	}
	/**
	 * @param studint the studint to set
	 */
	public void setStudint(int studint) {
		this.studint = studint;
	}
	/**
	 * @return the studname
	 */
	public String getStudname() {
		return studname;
	}
	/**
	 * @param studname the studname to set
	 */
	public void setStudname(String studname) {
		this.studname = studname;
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
		return "studint=" + studint + ", studname=" + studname + ", email=" + email + "";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + studint;
		result = prime * result + ((studname == null) ? 0 : studname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentBean other = (StudentBean) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (studint != other.studint)
			return false;
		if (studname == null) {
			if (other.studname != null)
				return false;
		} else if (!studname.equals(other.studname))
			return false;
		return true;
	}
	/**
	 * @param studint
	 * @param studname
	 * @param email
	 */
	
	
	
	
	

}
