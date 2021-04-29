package com.enjoy.beans.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * @Author wu
 * @Date 4/11/2021 4:09 PM
 * @Version 1.0
 */
public class LoggerAfterThrowing  implements ThrowsAdvice {

	private Logger logger= LoggerFactory.getLogger(getClass());

	// 根据接口描述，必须定义符合格式的方法
	public void afterThrowing(Method method, Object[] args, Object target, Exception ex){
		logger.info("LoggerAfterThrowing.afterThrowing--->"+ex.getMessage());

	}

}
