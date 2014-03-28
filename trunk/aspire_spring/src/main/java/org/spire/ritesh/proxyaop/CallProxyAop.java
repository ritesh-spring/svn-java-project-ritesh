/**
 * 
 */
package org.spire.ritesh.proxyaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ritesh Kumar
 *
 */
public class CallProxyAop {


	private static final String 
				BEAN_NAME = "proxybean";

	/**
	 * @param args
	 * @throws PerformanceException 
	 */
	public static void main(String[] args) throws PerformanceException {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
 Performer performer=(Performer) context.getBean(BEAN_NAME);
 performer.perform();
 
		((AbstractApplicationContext) context).close();
	}
}
