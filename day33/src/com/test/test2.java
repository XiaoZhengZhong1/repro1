package com.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class test2 {
/*	
2.用反射去创建一个对象，有2种方式，尽量用代码去体现*/
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("com.test.student2"); 
		Object obj = c.newInstance();
		
		
		//反射获取构造方法,空参和有参
		Constructor con = c.getConstructor();
		Constructor con2 = c.getConstructor(String.class ,int.class);
		Object obj2 = con2.newInstance("xiaohai",31);//运行有参构造.
		System.out.println(obj2);
		
		//反射获取字段,并设置字段值
		Field fi = c.getField("name");
		Field fi2 = c.getField("age");
		fi.set(obj,"肖磊");
		fi2.set(obj, 3);
		System.out.println(obj);
	
		
		//反射获取方法.并给参数赋值
		Method md = c.getMethod("study",String.class,int.class);
		md.invoke(obj, "xiaolei",2);
		
		
		
	
	
	}

}
