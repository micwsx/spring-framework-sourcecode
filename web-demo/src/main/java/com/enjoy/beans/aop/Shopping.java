package com.enjoy.beans.aop;

import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

/**
 * @Author wu
 * @Date 4/11/2021 4:19 PM
 * @Version 1.0
 */
@Component
public class Shopping implements Activity {

	public String buy(String productName) {
		String result = productName + "-" + LocalTime.now().toString();
		System.out.println(result);
		return result;
	}

	@EnhanceAnnotation(name = "Michael")
	public String leaving(String name) {
		return name + " is leaving!";
	}

	@Override
	public String doSomething(String name) {
		Object o = AopContext.currentProxy();
		System.out.println("AopContext.currentProxy: " + o.getClass().getName());
		return "doSomething: " + name;
	}
}
