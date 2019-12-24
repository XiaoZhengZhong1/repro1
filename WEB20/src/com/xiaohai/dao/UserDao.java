package com.xiaohai.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.xiaohai.utils.c3p0Utils;

public class UserDao {

	public Long checkUsername(String username) throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "select count(*) from user where username=?;";
		//因为查询是经过是一个Object因为商品中有不同的属性,所以需要强转成查询本身返回的Long
		Long query = (Long) runner.query(sql, new ScalarHandler(),username);
		//因为返回值是int,所以需要转换
		return query;
		
	}

}
