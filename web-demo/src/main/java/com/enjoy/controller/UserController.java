package com.enjoy.controller;

import com.enjoy.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

	@ResponseBody
	@RequestMapping("/info/{id}")
	public User show(@PathVariable(name = "id") Integer id){
		User user=new User(id,"Michael","Shanghai");
		System.out.println(user);
		return user;
	}

}
