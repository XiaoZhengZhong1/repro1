package com.itheima.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.itheima.mybatis.pojo.User;

public class userDaoImp implements UserDao {
	//定义私有的工厂类型,提供构造方法方法
	private SqlSessionFactory sqlSessionFactory;

	public userDaoImp(SqlSessionFactory  sqlSessionFactory) {
		super();
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	
	//根据用户id查询
	public User selectUserById(Integer id){
		SqlSession openSession = sqlSessionFactory.openSession();
		 return openSession.selectOne("test1.findUserById", id);
	 
	}
}
