package com.enjoy;

import com.enjoy.beans.SimpleBean;
import com.enjoy.beans.aop.Activity;
import com.enjoy.beans.aop.Shopping;
import com.enjoy.beans.transaction.PayService;
import org.junit.Test;
import org.springframework.aop.framework.AopContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author wu
 * @Date 4/11/2021 10:54 AM
 * @Version 1.0
 */
public class AppTest {

	@Test
	public void testTransaction() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("com.enjoy.beans.transaction");
		PayService bean = ctx.getBean(PayService.class);
		System.out.println(bean.getClass().getName());
		bean.pay();
	}


	@Test
	public void startAopJDK() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("com.enjoy.beans");
		Activity bean = ctx.getBean(Activity.class);
		System.out.println(bean.getClass().getName());
		String book = bean.doSomething("Window shopping");
	}


	@Test
	public void startAop() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("com.enjoy.beans");
		Shopping bean = ctx.getBean(Shopping.class);
		System.out.println(bean);
		String book = bean.buy("Book");

	}


	@Test
	public void startIOC() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("com.enjoy.beans");
		SimpleBean bean = ctx.getBean(SimpleBean.class);
		System.out.println(bean);
	}

	@Test
	public void startIOC2() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);
		SimpleBean bean = ctx.getBean(SimpleBean.class);
		System.out.println(bean);
	}
}
