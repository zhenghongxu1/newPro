package com.chinasofti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinasofti.server.UserDaoServer;

@Controller
@RequestMapping("/user")
public class controllerimple {
//这里是测试以下冲突的表�111��1
	@Autowired
	UserDaoServer dao;
	@RequestMapping("/register")
	@ResponseBody
	public String register(){
		dao.register();
		return "Text Success";
	}
	
}
