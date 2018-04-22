package com.cunsen.demo.testcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cunsen.demo.exception.MyException;
import com.cunsen.demo.mapper.UserMapper;
import com.cunsen.demo.mapper.UserService;

@RestController
public class HelloController {

	@GetMapping("/json")
	public String json() throws MyException{
		throw new MyException("这是我自己的异常函数设计");
	}
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/insertuser")
	public String inserUser(String name,String password){
		
		userService.inserUser(name, password);
		
		return "get done";
		
	}
}
