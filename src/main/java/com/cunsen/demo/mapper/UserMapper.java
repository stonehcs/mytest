package com.cunsen.demo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.cunsen.demo.testcontroller.User;

@Mapper
public interface UserMapper  {

	@Select("select * from t_user where name = #{name}")
	User findByName(@Param("name") String name);
	
	@Insert("insert into t_user(name,password) values(#{name},#{password})")
	int insertUser(@Param("name") String name,@Param("password") String password);
}
