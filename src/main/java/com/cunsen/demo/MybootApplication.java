package com.cunsen.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

//@ComponentScan(basePackages={})
//@ServletComponentScan
@SpringBootApplication
@EnableScheduling
//@MapperScan(basePackages="com.cuncen.demo.mapper") //mapper的注入需要去落实下
public class MybootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybootApplication.class, args);
	}
}
