/**
 * 
 */
package org.ritesh.jdbctemplate.dao;

import org.ritesh.jdbctemplate.pojo.Employee;

/**
 * This Interface defines operations to be performed in to DataBase
 * 
 * @author Ritesh Kumar
 * @version 1.0.1
 * @since Feb 24,2014
 */
public interface EmployeeDao {
	/**
	 * @param employee
	 */
	public void saveEmployee(final Employee employee);

	/**
	 * @param emp_id
	 * @return Employee Object
	 */
	public Employee getEmployee(final int emp_id);

	/**
	 * @param employee
	 * @return Employee Object
	 */
	public Employee updateEmployee(final int emp_id,final Employee employee);

	/**
	 * @param emp_id
	 * @return True if record deleted, else False
	 */
	public void deleteEmployee(final int emp_id);

}
