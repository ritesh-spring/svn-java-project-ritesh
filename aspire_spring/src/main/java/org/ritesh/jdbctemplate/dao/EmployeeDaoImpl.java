/**
 * 
 */
package org.ritesh.jdbctemplate.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.ritesh.jdbctemplate.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 * This class describes business logic for different DB operations
 * 
 * @author Ritesh Kumar
 * @version 1.0.1
 * @since Feb 24,2014
 */
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final String INSERT_QUERY = "insert into employee_aspire values(null,?,?,?)";
	private static final String SELECT_QUERY = "select * from employee_aspire where emp_id=?";
	private static final String UPDATE_QUERY = "update employee_aspire set salary=? where emp_id=?";
	private static final String DELETE_QUERY="delete from employee_aspire where emp_id=?";

	public EmployeeDaoImpl() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.ritesh.jdbctemplate.dao.EmployeeDao#saveEmployee(org.ritesh.jdbctemplate
	 * .pojo.Employee)
	 */
	@Override
	public void saveEmployee(final Employee employee) {
		// TODO Auto-generated method stub

		/*
		 * jdbcTemplate.getJdbcOperations().update(new
		 * PreparedStatementCreator() {
		 * 
		 * @Override public PreparedStatement createPreparedStatement(Connection
		 * con) throws SQLException { // TODO Auto-generated method stub
		 * PreparedStatement psmt = con.prepareStatement(INSERT_QUERY);
		 * psmt.setString(1, employee.getEmp_name()); psmt.setString(2,
		 * employee.getEmp_designation()); psmt.setDouble(3,
		 * employee.getSalary()); return psmt; } });
		 */

		jdbcTemplate.update(
				INSERT_QUERY,
				new Object[] { employee.getEmp_name(),
						employee.getEmp_designation(), employee.getSalary() });
	}

	@Override
	public Employee getEmployee(final int emp_id) {
		// TODO Auto-generated method stub
		// @SuppressWarnings("deprecation")
		// Employee employee=jdbcTemplate.queryForObject(SELECT_QUERY,
		// Employee.class, new Object[]{emp_id});
		return (Employee) jdbcTemplate.query(SELECT_QUERY,
				new RowMapper<Employee>() {

					@Override
					public Employee mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						// TODO Auto-generated method stub
						Employee e = new Employee();
						e.setEmp_id(rs.getInt("emp_id"));
						e.setEmp_designation(rs.getString("emp_designation"));
						e.setEmp_name(rs.getString("emp_name"));
						e.setSalary(rs.getDouble("salary"));
						return e;
					}
				}, new Object[] { emp_id }).get(0);
	}

	@Override
	public Employee updateEmployee(int emp_id,Employee employee) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(UPDATE_QUERY, new Object[]{employee.getSalary(),emp_id});
		return employee;
	}

	@Override
	public void deleteEmployee(int emp_id) {
		// TODO Auto-generated method stub
		
		jdbcTemplate.update(DELETE_QUERY, new Object[]{emp_id});
		
	}

}
