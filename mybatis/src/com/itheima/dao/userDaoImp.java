package com.itheima.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.itheima.mybatis.pojo.User;

public class userDaoImp implements UserDao {
	//����˽�еĹ�������,�ṩ���췽������
	private SqlSessionFactory sqlSessionFactory;

	public userDaoImp(SqlSessionFactory  sqlSessionFactory) {
		super();
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	
	//�����û�id��ѯ
	public User selectUserById(Integer id){
		SqlSession openSession = sqlSessionFactory.openSession();
		 return openSession.selectOne("test1.findUserById", id);
	 
	}
}
