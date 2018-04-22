package com.cunsen.demo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class HttpAspect {
	
//	@Pointcut(value = "excution(public * com.cunsen.domen..*(..))")
	public void log(){
		
	}
	
	@Before(value = "log()")
	public void httpAspect(){
		
	}
	
	@After(value = "log()")
	public void httpAspectAfter(){
		
		
	}
	
	@AfterReturning(pointcut="log()",returning="object")
	public void doreturning(Object object){
		
	}
}
