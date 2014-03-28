/**
 * 
 */
package org.spire.ritesh;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.ritesh.springdao.jdbc.dao.AccountDao;
import org.ritesh.springdao.jdbc.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Ritesh Kumar
 * @version 1.0.0
 * @since Feb 23, 2014
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext-Jdbc-Test.xml" })
public class AccountDaoTest {
	@Autowired
	ApplicationContext context;

	@Test
	public void testAccountDao() {
		AccountDao accDao = (AccountDao) context.getBean("accountDao");
		Account account = new Account();
		account.setAcc_holder_name("Aspire Technology");
		account.setAcc_type("SB_DEMAT");
		account.setAcc_bal(128833);
		//accDao.saveAccount(account);
		System.out.println("Data Inserted Successfully in DB");
		accDao.removeAccount(11001023);
		System.out.println("Removed Account...");
		Account account1=new Account();
		account1.setAcc_type("Curr_Ac");
		account1.setAcc_no(11001025);
		System.out.println("Update Account");
		accDao.updateAccount(account1);
		System.out.println("Account updated...");
		System.out.println(accDao.getAccountDetails(11001000, new Account()));
	}
}
