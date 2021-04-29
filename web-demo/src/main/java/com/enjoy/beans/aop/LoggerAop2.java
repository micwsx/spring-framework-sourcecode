package com.enjoy.beans.aop;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author wu
 * @Date 4/11/2021 3:33 PM
 * @Version 1.0
 */
//@Aspect
//@Component
public class LoggerAop2 {

	private Logger logger= LoggerFactory.getLogger(getClass());

	// 定义环绕切面. buy方法或者有EnhanceAnnotation注解
//	@Pointcut(value = "execution(* com.enjoy.beans.aop.Shopping.buy(..)) && args(productName)")
//	public void myPointcut(String productName) {
//	}
	@Pointcut(value = "execution(* com.enjoy.beans.aop.Shopping.buy(..))")
	public void myPointcut() {
	}

	// 方法执行之前
	@Before(value = "myPointcut(productName)", argNames = "productName")
	public void beforeLogging(String productName) {
		logger.trace("beforeLogging--->"+productName);
	}

	// 方法执行之后
	@After(value = "myPointcut(productName)", argNames = "productName")
	public void afterLogging(String productName) {
		logger.trace("afterLogging--->"+productName);
	}

	// 方法环绕
	@Around(value = "myPointcut(productName)", argNames = "proceedingJoinPoint,productName")
	public void aroundLogging(ProceedingJoinPoint proceedingJoinPoint, String productName) throws Throwable {
		logger.trace("aroundLogging---start>"+proceedingJoinPoint+","+productName);
		proceedingJoinPoint.proceed();
		logger.trace("aroundLogging---end>"+proceedingJoinPoint+","+productName);
	}


	// 方法抛出异常后执行
	@AfterThrowing(value = "myPointcut(productName)",
			pointcut = "myPointcut(productName)",
			throwing = "ex",
			argNames = "ex"
	)
	public void afterThrowing(Throwable ex) {
		logger.trace("afterThrowing--->"+ex.getMessage());
	}

	// 方法返回之后执行
	@AfterReturning(value = "myPointcut(productName)", pointcut = "myPointcut(productName)",
			returning = "result", argNames = "result")
	public void afterReturningLogging(Object result) {
		logger.trace("afterReturningLogging--->"+result);
	}
}
