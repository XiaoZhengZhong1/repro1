package com.itheima.mybatis.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;

//演示原始dao开发,手动创建接口,实现接口,创建pojo实体包,表配置中绑定接口,核心配置中指定包(接口和接口同名的表.xml所在包)

//继承SqlSessionDaoSupport类,就能从类中继承工厂,使用工厂对象
public class UserMapperImp extends SqlSessionDaoSupport implements UserMapper {
	//有了工厂就能直接使用对象调用接口中的增删改查方法只需sql语句操作
	@Override
	public Integer insertUser() {
	//	this.getSqlSession().insert(arg0, arg1)  参数中是表.xml中sql语句id值 和 参数占位符的值
		return null;
	}
}
