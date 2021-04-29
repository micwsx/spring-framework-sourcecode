package com.enjoy.beans.aop;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author wu
 * @Date 4/11/2021 3:33 PM
 * @Version 1.0
 */
@Aspect
@Component
public class LoggerAop {

	private Logger logger = LoggerFactory.getLogger(getClass());

	// 定义环绕切面. buy方法或者有EnhanceAnnotation注解
//	@Pointcut(value = "execution(* com.enjoy.beans.aop.Shopping.buy(..)) && args(productName)")
//	public void myPointcut(String productName) {
//	}

	// 方法执行之前
	@Before(value = "myPointcut(productName)")
	public void beforeLogging(JoinPoint joinpoint,String productName) {
		logger.info("beforeLogging--->");
	}

	// 方法执行之后
	@After(value = "myPointcut(productName)")
	public void afterLogging(JoinPoint joinpoint) {
		logger.info("afterLogging--->");
	}

	// 方法抛出异常后执行
	@AfterThrowing(value = "myPointcut(productName)", throwing = "ex")
	public void afterThrowing(JoinPoint joinpoint, Throwable ex) {
		logger.info("afterThrowing--->");
	}

	// 方法返回之后执行
	@AfterReturning(value = "myPointcut(productName)", pointcut = "myPointcut(productName)",
			returning = "result", argNames = "result")
	public void afterReturningLogging(Object result) {
		logger.info("afterReturningLogging--->" + result);
	}

	// 方法环绕
	@Around(value = "myPointcut(productName)")
	public void aroundLogging(ProceedingJoinPoint proceedingJoinPoint,String productName) throws Throwable {
		logger.info("aroundLogging---start>" + proceedingJoinPoint);
		proceedingJoinPoint.proceed();
		logger.info("aroundLogging---end>" + proceedingJoinPoint);
	}


	@Pointcut(value = "execution(* com.enjoy.beans.aop.Shopping.buy(productName))",argNames = "productName")
	public void myPointcut(String productName) {

	}
}
