package com.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.jar.Attributes.Name;

/*	
6.����һ����׼��JavaBean������Person����������name��age��
	ʹ�÷���ķ�ʽ����һ��ʵ�������ù��캯����ʼ��name��age��ʹ�÷��䷽ʽ����setName���������ƽ������ã�
	��ʹ��setAge����ֱ��ʹ�÷��䷽ʽ��age��ֵ��*/
public class test3 {
	public static void main(String[] args) throws Exception {
		
		//ʹ�÷���ķ�ʽ����һ��ʵ�������ù��캯����ʼ��name��age
		Class c = Class.forName("com.test.person");
		Constructor con = c.getConstructor(String.class,int.class);
		person p = (person)con.newInstance("Ф��",3);
		System.out.println(p);
	
		
		
		//ʹ�÷��䷽ʽ����setName���������ƽ�������
		Method setmd = c.getMethod("setName", String.class);
		setmd.invoke(p, "�ڸ�");
		System.out.println(p);
				
		
		//��ʹ��setAge����ֱ��ʹ�÷��䷽ʽ��age��ֵ��
		Field f = c.getDeclaredField("age");
		f.setAccessible(true);
		f.set(p, 2);
		System.out.println(p);
	
	
	}
}
