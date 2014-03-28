/**
 * 
 */
package org.ritesh.springdao.jdbc.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.ritesh.springdao.jdbc.dao.AccountDao;
import org.ritesh.springdao.jdbc.dbutils.DBConnectionUtils;
import org.ritesh.springdao.jdbc.pojo.Account;

/**
 * Implementation Class of AccountDao
 * 
 * @author Ritesh Kumar
 * @version 1.0.0
 * @since Feb 23, 2014
 */
public class AccountDaoImpl implements AccountDao {

	private static final String INSERT_QUERY = "insert into account_aspire values(account_aspire_seq.nextval,?,?,?)";
	private static final String DELETE_QUERY = "delete from account_aspire where acc_no=?";
	private static final String SELECT_QUERY = "select * from  account_aspire where acc_no=?";
	private static final String UPDATE_QUERY = "update account_aspire set acc_type=? where acc_no=?";

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ritesh.springdao.jdbc.dao.AccountDao#saveAccount()
	 */
	@Override
	public void saveAccount(Account account) {
		// TODO Auto-generated method stub
		PreparedStatement pstm = null;
		Connection con = null;

		try {
			con = DBConnectionUtils.getOracleConnection();
			pstm = con.prepareStatement(INSERT_QUERY);
			pstm.setString(1, account.getAcc_holder_name());
			pstm.setString(2, account.getAcc_type());
			pstm.setDouble(3, account.getAcc_bal());
			pstm.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstm.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ritesh.springdao.jdbc.dao.AccountDao#updateAccount()
	 */
	@Override
	public void updateAccount(Account account) {
		// TODO Auto-generated method stub
		PreparedStatement pstm = null;
		Connection con = null;

		try {
			con = DBConnectionUtils.getOracleConnection();
			pstm = con.prepareStatement(UPDATE_QUERY);
			pstm.setString(1, account.getAcc_type());
			pstm.setDouble(2, account.getAcc_no());
			pstm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstm.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ritesh.springdao.jdbc.dao.AccountDao#removeAccount()
	 */
	@Override
	public void removeAccount(int acc_no) {
		// TODO Auto-generated method stub

		PreparedStatement pstm = null;
		Connection con = null;

		try {
			con = DBConnectionUtils.getOracleConnection();
			pstm = con.prepareStatement(DELETE_QUERY);
			pstm.setInt(1, acc_no);
			pstm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstm.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.ritesh.springdao.jdbc.dao.AccountDao#getAccountDetails(org.ritesh
	 * .springdao.jdbc.pojo.Account)
	 */
	@Override
	public Account getAccountDetails(int acc_no, Account account) {

		PreparedStatement pstm = null;
		Connection con = null;

		try {
			con = DBConnectionUtils.getOracleConnection();
			pstm = con.prepareStatement(SELECT_QUERY);
			pstm.setInt(1, acc_no);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				account.setAcc_no(rs.getInt(1));
				account.setAcc_holder_name(rs.getString(2));
				account.setAcc_type(rs.getString(3));
				account.setAcc_bal(rs.getDouble(4));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstm.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return account;
	}

}
