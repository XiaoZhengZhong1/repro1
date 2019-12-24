package com.itheima.mybatis.junit;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.mybatis.mapper.UserMapper;

public class JunitTest {
	@Test
	public void testMapper() throws Exception {
		//classPathXmlApplicationContext表示:整个项目的xml类路径对象,可读取项目中所有的xml文件.
		//applicationContext.xml 文件配置了整个项目中所有的xml配置
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//因为上面参数中读取的配置文件中,注入有工厂,所以new出来的对象中有工厂对象,可通过参数反射动态实现接口
		//也可直getBean("UserMapper")接获取applicationContext.xml配置中id 但返回值要强转
		UserMapper mapper = classPathXmlApplicationContext.getBean(UserMapper.class);
		User selectUserById = mapper.selectUserById(10);
		System.out.println(selectUserById);
	}
}
