package com.cunsen.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cunsen.demo.mapper.UserMapper;
import com.cunsen.demo.testcontroller.User;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MybootApplication.class)
public class AppTestForUser {

	
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void finduserbyname(){
		
		userMapper.insertUser("cunsen", "123456");
		//User u = userMapper.findByName("cuncen");
		
		System.out.println("hello world");
	}
	
}
