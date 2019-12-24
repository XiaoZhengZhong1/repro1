package com.xiaohai.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.xiaohai.utils.c3p0Utils;

public class UserDao {

	public Long checkUsername(String username) throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "select count(*) from user where username=?;";
		//��Ϊ��ѯ�Ǿ�����һ��Object��Ϊ��Ʒ���в�ͬ������,������Ҫǿת�ɲ�ѯ�����ص�Long
		Long query = (Long) runner.query(sql, new ScalarHandler(),username);
		//��Ϊ����ֵ��int,������Ҫת��
		return query;
		
	}

}
