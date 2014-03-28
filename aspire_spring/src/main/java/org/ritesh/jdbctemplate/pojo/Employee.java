/**
 * 
 */
package org.ritesh.jdbctemplate.pojo;

import java.io.Serializable;

/**
 * This is domain class defines fields which Synchronized with DataBase
 * 
 * @author Ritesh Kumar
 * @since Feb 24,2014
 * @version 1.0.0
 */
public class Employee implements Serializable {

	/**
	 * Generated version ID
	 */
	private static final long serialVersionUID = -930756834063022873L;
	private int emp_id;
	private String emp_name;
	private String emp_designation;
	private double salary;

	/**
	 * @return the emp_id
	 */
	public int getEmp_id() {
		return emp_id;
	}

	/**
	 * @param emp_id
	 *            the emp_id to set
	 */
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	/**
	 * @return the emp_name
	 */
	public String getEmp_name() {
		return emp_name;
	}

	/**
	 * @param emp_name
	 *            the emp_name to set
	 */
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	/**
	 * @return the emp_designation
	 */
	public String getEmp_designation() {
		return emp_designation;
	}

	/**
	 * @param emp_designation
	 *            the emp_designation to set
	 */
	public void setEmp_designation(String emp_designation) {
		this.emp_designation = emp_designation;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary
	 *            the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((emp_designation == null) ? 0 : emp_designation.hashCode());
		result = prime * result + emp_id;
		result = prime * result
				+ ((emp_name == null) ? 0 : emp_name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee other = (Employee) obj;
		if (emp_designation == null) {
			if (other.emp_designation != null) {
				return false;
			}
		} else if (!emp_designation.equals(other.emp_designation)) {
			return false;
		}
		if (emp_id != other.emp_id) {
			return false;
		}
		if (emp_name == null) {
			if (other.emp_name != null) {
				return false;
			}
		} else if (!emp_name.equals(other.emp_name)) {
			return false;
		}
		if (Double.doubleToLongBits(salary) != Double
				.doubleToLongBits(other.salary)) {
			return false;
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name
				+ ", emp_designation=" + emp_designation + ", salary=" + salary
				+ "]";
	}

}
