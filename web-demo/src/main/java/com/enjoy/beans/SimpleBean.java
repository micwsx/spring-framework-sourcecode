package com.enjoy.beans;

import org.springframework.aop.framework.AopContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * @Author wu
 * @Date 4/11/2021 10:57 AM
 * @Version 1.0
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SimpleBean {

	public void sayHi(){
		Object o = AopContext.currentProxy();
		System.out.println("SimpleBean-->>AopContext.currentProxy: " + o.getClass().getName());
	}

}
