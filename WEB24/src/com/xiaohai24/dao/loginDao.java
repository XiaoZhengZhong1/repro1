package com.xiaohai24.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.xiaohai24.domain.User;
import com.xiaohai24.utils.c3p0Utils;

public class loginDao {

	public User chenkLingon(String username, String password) throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "select * from user where username=? and password=?";
		User user = runner.query(sql, new BeanHandler<User>(User.class), username,password);
		
		return user;
	}
}
