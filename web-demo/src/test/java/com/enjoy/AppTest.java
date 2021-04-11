package com.enjoy;

import com.enjoy.beans.SimpleBean;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author wu
 * @Date 4/11/2021 10:54 AM
 * @Version 1.0
 */
public class AppTest {

	@Test
	public void startIOC(){
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext("com.enjoy.beans");
		SimpleBean bean = ctx.getBean(SimpleBean.class);
		System.out.println(bean);
	}
}
