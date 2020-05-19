package com.enjoy;


import com.enjoy.controller.UserController;
import com.enjoy.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.enjoy")
public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(App.class);
		UserController userController= ctx.getBean(UserController.class);
		System.out.println(userController);
	}
}
