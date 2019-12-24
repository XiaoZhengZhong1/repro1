package com.reflect;

import java.lang.reflect.Field;

public class L_04 {
	/*###27.09_反射(通过反射写一个通用的设置某个对象的某个属性为指定的值)
	* A:案例演示
	* Property是所有的意思
		* public void setProperty(Object obj, String propertyName, Object value){}，此方法可将obj对象中名为
		* propertyName的属性的值设置为value。就是创建一个设置类,然后创建一个自定义类,再在其它的测试类分别new设置类对象和自定义对象
		* 再用设置类对象,设置自定义类的成员变量*/

	//此方法可将obj对象中名为,propertyName的属性的值设置为value.
	public void setProperty (Object obj, String propertyName, Object value) throws Exception  {
		Class<? extends Object> class5 = obj.getClass();	//获取字节码对象.
			Field f = class5.getDeclaredField(propertyName);//暴力反射获取字段.
				f.setAccessible(true);	//去除权限.
				f.set(obj, value);      //设置传入对象的值(当作一个设置方法,在别的测试类调用)
	}

}
