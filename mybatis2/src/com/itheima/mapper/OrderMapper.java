package com.itheima.mapper;

import java.util.List;

import com.itheima.mybatis.pojo.User;
import com.itheima.mybatis.pojo.orders;

public interface OrderMapper {
	//演示解决数据库中表是列字段和pojo封装实例字段不一样时,怎么用手动映射
	//查询orders订单表所有记录
	public List<orders> selectOrder();
	
	//演示多表查询所有订单和对应的用户名 ,一对一查询,以订单为中心,一个订单对一个用户  返回值是订单,在订单类中封装用户对象
	public List<orders> selectOrdersList();
	
	
	//演示一对多,一个用户多个表单
	public List<User> selectOrderListByUser();
	
}
