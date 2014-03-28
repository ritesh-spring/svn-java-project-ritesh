/**
 * 
 */
package org.spire.ritesh.hellospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * @author Ritesh Kumar
 *
 */
public class HelloApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Spring Container
		/*File file=new File("./src/main/resources/applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource(file.getAbsolutePath()));*/
		
		ApplicationContext factory=new ClassPathXmlApplicationContext("applicationContext.xml");
		GreetingService service2=(GreetingService)factory.getBean("gs2");
		GreetingService service1=(GreetingService)factory.getBean("gs1");
		service1.sayGreetings();
		service2.sayGreetings();
		((AbstractApplicationContext) factory).close();
	}

}
