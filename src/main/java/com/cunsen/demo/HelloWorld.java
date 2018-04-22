package com.cunsen.demo;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
public class HelloWorld {

	@Value("${cupsize}")
	private String cupsize;
	
	@Value("${age}")
	private int age;
	
//	@Autowired
//	private Girl girl;
	
	
	@ApiOperation(value="测试" , notes="测试获取helloworld")
	@GetMapping(value="/hello")
	public String hello(){
//		return "hello world. this is my test ......";
//		return cupsize+"===:"+age;
		return "helloworld";
	}
	
	@ApiOperation(value="获取girl" , notes="没有参数的请求")
	@GetMapping(value={"/girl","mygirl"})
	public String getgirl(){
		
//		return girl.toString();
		return "===";
	}
	
	@ApiOperation(value="两个请求参数",notes="一个是用户的id，一个是用户的名称")
	@ApiImplicitParams({
		@ApiImplicitParam(name="id",value="用户的id",required=true,dataType="String"),
		@ApiImplicitParam(name="name",value="用户的名称",required=true,dataType="String")
	})
	@GetMapping(value="/user")
	public String getuser(@Valid Girl girl,BindingResult res ){
		if(res.hasErrors()){
			return res.getFieldError().getDefaultMessage().toString();
		}
		return girl.toString();
	}
	
	@ApiOperation(notes="一个请求参数，是给穿的参数",value="用户的名称")
	@ApiImplicitParam(name="name",value="用户的名称",required=true,dataType="String")
	@GetMapping(value="/getname")
	public String getname(String name){
		Girl girl = new Girl();
		
		return "this is my name:"+name;
	}
	
	@ApiOperation(notes="一个请求参数,是patvariable中的参数",value="用户的名称")
	@ApiImplicitParam(name="name",value="用户的名称",required=true,dataType="String")
	@GetMapping(value="/getname/{name}")
	public String getname2(@PathVariable String name){
		return "pathvariable name is :"+name;
	}
}
