package com.itheima.mybatis.junit;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//��Ϊ���򹤳�ֻ�����Զ� ����pojo(���Ǳ��Ӧ��ʵ����װ��,�Լ����Ӧ�Ľӿں���ӿ�ͬ���ı�.xml)


public class JunitTest {
/*//���򹤳��Զ����ɵ�sql��ɾ�Ĳ����ֻ�Ե����ѯ��Ч,����ѯ��Ч
//���򹤳�ͨ����ȡ�����ļ�,���Զ����ɱ��Ӧ�ķ�װjavaBean���,�ӿ�,�Լ��ͽӿ���һ���ı�xml�ļ�,�Լ�������ɾ�Ĳ�sql���
	@Test
	public void testMapper(){	
		//����·����(src)��ȡ������Ӧ��(ͨ��Ӧ�������������ļ�).�������� ���� ӳ��
		ClassPathXmlApplicationContext CXAC = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserMapper usermapper = CXAC.getBean(UserMapper.class);
		
		//����һ��Userʵ������,����������ɾ�Ĳ鷽��
		UserExample userExample = new UserExample();
		
		//��ʵ�������׼,�������sql��ѯ���,���Ա�sex����"1"
		userExample.createCriteria().andSexEqualTo("1");
		
		//��ӳ�䶯̬����ͨ���ӿ��ֽ���������ȡ�Ĳ������ݿ����,ִ�в�ѯ
									//��ѯ��¼����,����ʵ��
		int countByExample = usermapper.countByExample(userExample);
		System.out.println(countByExample);
	}*/
}
