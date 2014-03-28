/**
 * 
 */
package org.ritesh.hibernate.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.ritesh.hibernate.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * This Class implements {@link org.ritesh.hibernate.dao.CustomerDao} interface
 * which possessing the business logic for Data Base operation on
 * customer_aspire Table
 * </p>
 * 
 * @author Ritesh Kumar
 * @version 1.0.0
 * @since March 2, 2014
 */
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	SessionFactory sessionFacory;
   private static final Logger log=Logger.getLogger(CustomerDaoImpl.class);
   
	@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		log.info("Executing saveCustomer(Customer customer) IN "+log.getName());
		sessionFacory.getCurrentSession().save(customer);
		log.info("Execution Finished saveCustomer(Customer customer) IN "+log.getName());
	}

	@Transactional
	@Override
	public void updateCustomer(Customer customer, int customer_id) {
		// TODO Auto-generated method stub
		Session session = sessionFacory.getCurrentSession();
		Customer customerToUpdate = (Customer) session.get(Customer.class,
				customer_id);
		customerToUpdate.setAddress(customer.getAddress());
		session.saveOrUpdate(customerToUpdate);
	}

	@Transactional
	@Override
	public void deleteCustomer(int customer_id) {
		// TODO Auto-generated method stub
		if(getCustomer(customer_id) != null)
		sessionFacory.getCurrentSession().delete(getCustomer(customer_id));
	}

	@Transactional
	@Override
	public Customer getCustomer(int customer_id) {
		// TODO Auto-generated method stub
		return (Customer) sessionFacory.getCurrentSession().get(Customer.class,
				customer_id);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return sessionFacory.getCurrentSession()
				.createQuery("from Customer").list();
	}

}
