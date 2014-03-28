/**
 * 
 */
package org.ritesh.hibernate.dao;

import java.util.List;

import org.ritesh.hibernate.domain.Customer;

/**
 * <p>
 * This Interface declares Data Base Operations performed on Customer Table
 * </p>
 * 
 * @author Ritesh Kumar
 * @version 1.0.0
 * @since March 2, 2014
 */
public interface CustomerDao {
	public void saveCustomer(Customer customer);

	public void updateCustomer(Customer customer,int customer_id);

	public void deleteCustomer(int customer_id);

	public Customer getCustomer(int customer_id);
	
	/**
	 * @return List of Customers... 
	 */
	public List<Customer> getCustomers();
}
