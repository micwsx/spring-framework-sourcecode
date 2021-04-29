package com.enjoy.beans.aop;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.aopalliance.aop.Advice;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.aop.Advisor;
import org.springframework.stereotype.Component;

/**
 * @Author wu
 * @Date 4/11/2021 3:33 PM
 * @Version 1.0
 */

//@Component
public class LoggerAop3  implements Advisor {

	@Override
	public Advice getAdvice() {

		return null;
	}

	@Override
	public boolean isPerInstance() {
		return false;
	}
}
