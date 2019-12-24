package com.xiaohai.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.xiaohai.domain.User;
import com.xiaohai.utils.c3p0Utils;


public class UserDao {

	public int regist(User user) throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "insert into user values(?,?,?,?,?,?,?,?,?,?)";
		int update = runner.update(sql, user.getUid(),user.getUsername(),user.getPassword(),
				user.getName(),user.getEmail(),user.getTelephone(),user.getBirthday(),
				user.getSex(),user.getState(),user.getCode());
		return update;
	}

	//激活
	public void active(String activeCode) throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "update user set state=? where code=?";
		runner.update(sql, 1,activeCode);
	}

	//校验用户名是否存在
	public Long checkUsername(String username) throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "select count(*) from user where username=?";
		Long query = (Long) runner.query(sql, new ScalarHandler(), username);
		return query;
	}

	//用户登录的方法
	public User login(String username, String password) throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "select * from user where username=? and password=?";
		return runner.query(sql, new BeanHandler<User>(User.class), username,password);
	}

}
