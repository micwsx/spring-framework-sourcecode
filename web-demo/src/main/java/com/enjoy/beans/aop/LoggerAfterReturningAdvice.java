package com.enjoy.beans.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @Author wu
 * @Date 4/11/2021 3:53 PM
 * @Version 1.0
 */

public class LoggerAfterReturningAdvice implements AfterReturningAdvice {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		logger.info("LoggerAfterReturningAdvice.afterReturning--->" + returnValue);
	}
}
