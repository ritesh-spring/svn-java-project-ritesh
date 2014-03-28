/**
 * 
 */
package org.spire.ritesh;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.ritesh.hibernate.dao.CustomerDao;
import org.ritesh.hibernate.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Ritesh Kumar
 * 
 */
@ContextConfiguration(locations = { "classpath:context-Hibernate.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class HibernateSpringTest {
	@Autowired
	ApplicationContext context;
   private static final Logger log=Logger.getLogger(HibernateSpringTest.class);
	@Test
	public void testSaveEmployee() {
		CustomerDao customerDao = (CustomerDao) context.getBean("customerDao");
		Customer customer = new Customer();
		customer.setName("Ritesh Kumar");
		customer.setPhoneNo(9911223344L);
		customer.setAddress("Indore,MP");
		log.info("Saving Customer in to Data Base...");
		customerDao.saveCustomer(customer);
		log.info("Inserted in to database");
		log.info("Updating in to Data Base");
		customer.setAddress("New Indore1,New MP1");
		customerDao.updateCustomer(customer, 1007);
		System.out.println(customer);
		log.info("Updated in to Data Base");
		log.info("Deleting Customer...");
		customerDao.deleteCustomer(0);
		log.info("Customer Deleted...");
		log.info("Getting list of Customers....");
		List<Customer> customers = customerDao.getCustomers();
		for (Customer customer1 : customers)
			System.out.println(customer1);
		System.out.println("Total Rows Returns is:  "+customers.size());
		log.info("List of Customers fetched from Data Base...");
	}
}
