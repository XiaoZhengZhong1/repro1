package com.itheima.mybatis.dao;
//演示原始dao开发,手动创建接口,实现接口,创建pojo实体包,表配置中绑定接口,核心配置中指定包(接口和接口同名的表.xml所在包)
public interface UserMapper {
	public Integer insertUser();
}
