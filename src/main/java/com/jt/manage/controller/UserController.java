package com.jt.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jt.manage.pojo.User;
import com.jt.manage.service.UserService;

@Controller
public class UserController {
	
	@Autowired UserService userService;
	
	@RequestMapping("/findAll")
	public String findAll(ModelMap map){
		System.out.println("controller");
		List<User> list = userService.findAll();
		map.addAttribute("userList", list);
		
		return "userList";
	}
}
