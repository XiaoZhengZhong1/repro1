package com.itheima.dao;

import com.itheima.mybatis.pojo.User;

public interface UserDao {
	
	
	public User selectUserById(Integer id);
}
