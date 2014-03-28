/**
 * 
 */
package org.ritesh.springdao.jdbc.dbutils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

/**
 * This Class Defines the logic to obtain database connection from <br>
 * multiple Data Bases
 * 
 * @author Ritesh Kumar
 * @version 1.0.0
 * @since Feb 23, 2014
 */
public class DBConnectionUtils {

	private static DataSource dataSource;

	public DBConnectionUtils() {

	}

	public DBConnectionUtils(DataSource dataSource) {
		DBConnectionUtils.dataSource = dataSource;
	}

	/**
	 * @return the dataSource
	 */
	public DataSource getDataSource() {
		return dataSource;
	}

	/**
	 * @param dataSource
	 *            the dataSource to set
	 */
	public void setDataSource(DataSource dataSource) {
		DBConnectionUtils.dataSource = dataSource;
	}

	public static Connection getOracleConnection() {
		// TODO Auto-generated method stub
		Connection con = null;
		try {
			con = dataSource.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	public static Connection getMySqlConnection() {
		// TODO Auto-generated method stub
		return null;
	}

}
