package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Properties;

/*(1)дһ��Properties��ʽ�������ļ�����������������ơ�
		(2) дһ�����򣬶�ȡ���Properties�����ļ����������������Ʋ���������࣬
		(3)�÷��� �ķ�ʽ����run������*/
public class test4 {
	public static void main(String[] args) throws Exception {
		
		//��һ�ֶ�ȡ�����ļ��ķ�ʽ.
		FileInputStream fis = new FileInputStream("person.config");
		Properties pro = new Properties();
		pro.load(fis);
		String classname = (String)pro.get("className");//��һ��get(Object obj)����.Ҫ�ѽ��ǿת��String
	  //String classname = pro.getProperty("className");�����д�����һ����˼.
		String methodname = pro.getProperty("methodName");//��ȡ�����ļ���=����߼��ұ�ֵ,��ȡ����Ӧ��ֵ
		Class c = Class.forName(classname);
		Object obj = c.newInstance();
		Method md = c.getDeclaredMethod(methodname);//������ȡ����˽�з���
		md.setAccessible(true);
		md.invoke(obj);
		
	
	}
}
