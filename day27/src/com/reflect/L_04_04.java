package com.reflect;

public class L_04_04 {//此类用来演示L_04类中设置工具类的用法.

	public static void main(String[] args) throws Exception {
		student s = new student("xzz",31);	//通过有参构造,创建对象,并赋值.
		System.out.println(s);
		L_04 L = new L_04();				//创建设置工具类对象.注意工具类中的方法.是可以暴力获取字段,并且除去权限的.
		L.setProperty(s, "name", "xh");		//调用工具类能设置所有的方法,设置s对象中的成员变量name,设置为xh
		System.out.println(s);				
	}

}
class student{
	private String name;
	private int age;
	public student() {
		super();
		
	}
	public student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", age=" + age + "]";
	}
	

}
