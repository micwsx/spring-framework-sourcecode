package com.enjoy.beans.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Author wu
 * @Date 4/11/2021 3:53 PM
 * @Version 1.0
 */

public class LoggerBeforeAdvice implements MethodBeforeAdvice {

	private Logger logger= LoggerFactory.getLogger(getClass());

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		logger.info("LoggerBeforeAdvice.before--->");
		method.invoke(target,args);
	}
}
