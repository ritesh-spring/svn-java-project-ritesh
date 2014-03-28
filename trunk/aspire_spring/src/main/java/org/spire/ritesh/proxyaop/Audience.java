package org.spire.ritesh.proxyaop;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

/**
 * @author Ritesh Kumar 
 * <p>This class shows how to use proxy based AOP in Spring</P>
 */
public class Audience implements MethodBeforeAdvice, AfterReturningAdvice,
		ThrowsAdvice, MethodInterceptor {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.aopalliance.intercept.MethodInterceptor#invoke(org.aopalliance.intercept
	 * .MethodInvocation)
	 */
	@Override
	public Object invoke(MethodInvocation joinPoint) throws Throwable {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		Object obj = joinPoint.proceed();
		long end = System.currentTimeMillis();
		System.out.println("The Performance Took.." + (end - start)
				+ "  Mili Seconds..");
		return obj;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.aop.AfterReturningAdvice#afterReturning(java.lang
	 * .Object, java.lang.reflect.Method, java.lang.Object[], java.lang.Object)
	 */
	@Override
	public void afterReturning(Object returnValue, Method method,
			Object[] data, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("CLAP CLAP CLAP CLAP....");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.aop.MethodBeforeAdvice#before(java.lang.reflect.Method
	 * , java.lang.Object[], java.lang.Object)
	 */
	@Override
	public void before(Method method, Object[] data, Object target)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("The Audience is taking their Seats...");
	}

	/**
	 * @param method
	 *            method being invoked
	 * @param data
	 *            Object Array
	 * @param target
	 *            target of the method invocation.
	 * @param e
	 *            Thrown Exception
	 */
	public void afterThrowing(Method method, Object[] data, Object target,
			PerformanceException e) {
		System.out.println("We want our money Back...");
	}
}
