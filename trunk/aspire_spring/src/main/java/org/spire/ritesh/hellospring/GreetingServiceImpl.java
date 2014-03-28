/**
 * 
 */
package org.spire.ritesh.hellospring;

/**
 * @author Ritesh Kumar
 * 
 */
public class GreetingServiceImpl implements GreetingService {

	public String greeting;

	public GreetingServiceImpl() {

	}

	public GreetingServiceImpl(String greeting) {
		this.greeting = greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.spire.ritesh.hellospring.GreetingService#sayGreetings()
	 */
	@Override
	public void sayGreetings() {
		// TODO Auto-generated method stub
		System.out.println("Hai--" + greeting);
	}

}
