package com.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class test2 {
/*	
2.�÷���ȥ����һ��������2�ַ�ʽ�������ô���ȥ����*/
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("com.test.student2"); 
		Object obj = c.newInstance();
		
		
		//�����ȡ���췽��,�ղκ��в�
		Constructor con = c.getConstructor();
		Constructor con2 = c.getConstructor(String.class ,int.class);
		Object obj2 = con2.newInstance("xiaohai",31);//�����вι���.
		System.out.println(obj2);
		
		//�����ȡ�ֶ�,�������ֶ�ֵ
		Field fi = c.getField("name");
		Field fi2 = c.getField("age");
		fi.set(obj,"Ф��");
		fi2.set(obj, 3);
		System.out.println(obj);
	
		
		//�����ȡ����.����������ֵ
		Method md = c.getMethod("study",String.class,int.class);
		md.invoke(obj, "xiaolei",2);
		
		
		
	
	
	}

}
