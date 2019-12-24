package com.itheima.mybatis.junit;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.mybatis.mapper.UserMapper;

public class JunitTest {
	@Test
	public void testMapper() throws Exception {
		//classPathXmlApplicationContext��ʾ:������Ŀ��xml��·������,�ɶ�ȡ��Ŀ�����е�xml�ļ�.
		//applicationContext.xml �ļ�������������Ŀ�����е�xml����
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//��Ϊ��������ж�ȡ�������ļ���,ע���й���,����new�����Ķ������й�������,��ͨ���������䶯̬ʵ�ֽӿ�
		//Ҳ��ֱgetBean("UserMapper")�ӻ�ȡapplicationContext.xml������id ������ֵҪǿת
		UserMapper mapper = classPathXmlApplicationContext.getBean(UserMapper.class);
		User selectUserById = mapper.selectUserById(10);
		System.out.println(selectUserById);
	}
}
