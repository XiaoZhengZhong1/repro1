package com.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.jar.Attributes.Name;

/*	
6.定义一个标准的JavaBean，名叫Person，包含属性name、age。
	使用反射的方式创建一个实例、调用构造函数初始化name、age，使用反射方式调用setName方法对名称进行设置，
	不使用setAge方法直接使用反射方式对age赋值。*/
public class test3 {
	public static void main(String[] args) throws Exception {
		
		//使用反射的方式创建一个实例、调用构造函数初始化name、age
		Class c = Class.forName("com.test.person");
		Constructor con = c.getConstructor(String.class,int.class);
		person p = (person)con.newInstance("肖磊",3);
		System.out.println(p);
	
		
		
		//使用反射方式调用setName方法对名称进行设置
		Method setmd = c.getMethod("setName", String.class);
		setmd.invoke(p, "磊哥");
		System.out.println(p);
				
		
		//不使用setAge方法直接使用反射方式对age赋值。
		Field f = c.getDeclaredField("age");
		f.setAccessible(true);
		f.set(p, 2);
		System.out.println(p);
	
	
	}
}
