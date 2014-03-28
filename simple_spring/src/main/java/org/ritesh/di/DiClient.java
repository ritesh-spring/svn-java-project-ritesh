/**
 * 
 */
package org.ritesh.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ritesh Kumar
 * 
 */
public class DiClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext-DI.xml");
		Bar bar = (Bar) context.getBean("bar");
		bar.processFooName();
		System.out.println(bar);
		Foo foo = (Foo) context.getBean(Foo.class);
		System.out.println(foo.getName());
		((AbstractApplicationContext) context).close();
	}

}
