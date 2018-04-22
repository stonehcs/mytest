package com.cunsen.demo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.validation.constraints.Min;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;


//@Component
//@ConfigurationProperties(prefix="girl")
//@Entity
@Data
public class Girl implements Serializable{

	
	private static final long serialVersionUID = 4339818104919790459L;
	
	private String name;
	
	@Min(value=18,message="weichengnian")
	private int age;
	
	private String address;

	


	@Override
	public String toString() {
		return "Girl [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
	
	
	
}
