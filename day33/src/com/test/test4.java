package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Properties;

/*(1)写一个Properties格式的配置文件，配置类的完整名称。
		(2) 写一个程序，读取这个Properties配置文件，获得类的完整名称并加载这个类，
		(3)用反射 的方式运行run方法。*/
public class test4 {
	public static void main(String[] args) throws Exception {
		
		//第一种读取配置文件的方式.
		FileInputStream fis = new FileInputStream("person.config");
		Properties pro = new Properties();
		pro.load(fis);
		String classname = (String)pro.get("className");//另一种get(Object obj)方法.要把结果强转成String
	  //String classname = pro.getProperty("className");和上行代码是一个意思.
		String methodname = pro.getProperty("methodName");//获取配置文件中=号左边键右边值,获取键对应的值
		Class c = Class.forName(classname);
		Object obj = c.newInstance();
		Method md = c.getDeclaredMethod(methodname);//暴力获取类中私有方法
		md.setAccessible(true);
		md.invoke(obj);
		
	
	}
}
