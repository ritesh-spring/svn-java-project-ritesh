package org.spire.ritesh;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.ritesh.jdbctemplate.dao.EmployeeDao;
import org.ritesh.jdbctemplate.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:contextJdbc-Template-Test.xml" })
public class EmployeeDaoTest {
	@Autowired
	ApplicationContext context;

	@Test
	public void testSaveEmployee() {
		EmployeeDao empDao = (EmployeeDao) context.getBean("empDao");
		Employee employee = new Employee();
		employee.setEmp_designation("SSE");
		employee.setEmp_name("Amit Kumar");
		employee.setSalary(92999.99);
		System.out.println("Inserting.... in to Employee Table");
		empDao.saveEmployee(employee);
		System.out.println("Inserted..... in to Employee Table");
	}

	@Test
	public void testGetEmployee() {
		EmployeeDao empDao = (EmployeeDao) context.getBean("empDao");
		System.out.println("Getting Employee Information from Data Base");
		Employee employee = (Employee) empDao.getEmployee(1000);
		System.out.println(employee);
		System.out.println("Employee Info printed");
	}

	@Test
	public void testUpdateEmployee() {
		EmployeeDao empDao = (EmployeeDao) context.getBean("empDao");
		System.out.println("Getting Employee for given Employee ID");
		System.out.println(empDao.getEmployee(1001));
		Employee employee = new Employee();
		System.out.println("Updating.... Employee Table");
		employee.setSalary(5555.67);
		empDao.updateEmployee(1001, employee);
		System.out.println(empDao.getEmployee(1001));
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testDeleteEmployee()
	{
		EmployeeDao empDao = (EmployeeDao) context.getBean("empDao");
		System.out.println("Getting Employee for given Employee ID");
		System.out.println(empDao.getEmployee(1005));
		System.out.println("Deleting from Data Base");
		empDao.deleteEmployee(1005);
		System.out.println(empDao.getEmployee(1005));
	}
}
