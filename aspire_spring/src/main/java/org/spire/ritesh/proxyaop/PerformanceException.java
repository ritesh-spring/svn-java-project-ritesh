/**
 * 
 */
package org.spire.ritesh.proxyaop;

/**
 * @author Ritesh Kumar
 *         <p>
 *         This Exception is thrown by AfterThrowing AOP
 *         </p>
 */
public class PerformanceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 509255368356466024L;

	/**
	 * 
	 */
	public PerformanceException() {
		// TODO Auto-generated constructor stub
		super();
	}

	public PerformanceException(String msg) {
		super(msg);
	}
}
