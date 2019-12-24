package com.itheima.mybatis.junit;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//因为逆向工程只用来自动 生成pojo(就是表对应的实例封装类,以及表对应的接口和与接口同名的表.xml)


public class JunitTest {
/*//逆向工程自动生成的sql增删改查语句只对单表查询有效,多表查询无效
//逆向工程通过读取配置文件,可自动生成表对应的封装javaBean类和,接口,以及和接口名一样的表xml文件,以及所有增删改查sql语句
	@Test
	public void testMapper(){	
		//从类路径中(src)获取上下文应用(通过应用上下文配置文件).包括连接 池子 映射
		ClassPathXmlApplicationContext CXAC = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserMapper usermapper = CXAC.getBean(UserMapper.class);
		
		//创建一个User实例对象,方法调用增删改查方法
		UserExample userExample = new UserExample();
		
		//给实例定义标准,并且添加sql查询语句,按性别sex等于"1"
		userExample.createCriteria().andSexEqualTo("1");
		
		//用映射动态代理通过接口字节码对象反射获取的操作数据库对象,执行查询
									//查询记录条数,根据实例
		int countByExample = usermapper.countByExample(userExample);
		System.out.println(countByExample);
	}*/
}
