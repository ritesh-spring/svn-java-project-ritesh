/**
 * 
 */
package org.ritesh.springdao.jdbc.dao;

import org.ritesh.springdao.jdbc.pojo.Account;

/**
 * Declaring operation to be performed on Accont_Aspire table in DB
 * 
 * @author Ritesh Kumar
 * @version 1.0.0
 * @since Feb 23,2014
 */
public interface AccountDao {

	public void saveAccount(Account account);

	public void updateAccount(Account account);

	public void removeAccount(int acc_no);

	public Account getAccountDetails(int acc_no,Account account);
}
