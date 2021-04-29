package com.enjoy.beans.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author wu
 * @Date 4/11/2021 3:55 PM
 * @Version 1.0
 */
public class LoggerAroundAdvice implements MethodInterceptor {
	private Logger logger= LoggerFactory.getLogger(getClass());

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		logger.info("LoggerAroundAdvice---start>"+invocation);
		Object result = invocation.proceed();
		logger.info("LoggerAroundAdvice---end>");
		return result;
	}
}
