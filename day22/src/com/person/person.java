package com.person;

import java.io.Serializable;	//此接口是开启功能.

public class person implements Serializable {	//因为只要实现了Serializable这个接口,才能启用序列化功能.
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;/*ID号是区别每次的序列的,不写系统也会自动生成.1是编号.L是long.
	不加ID号也不会报错.如果加了.如果要修改下面变量,改后,ID号也要改.*/
	private String name;
	private int age;
	public person() {
		super();
		
	}
	public person(String name, int age) {
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
		return "person [name=" + name + ", age=" + age + "]";
	}	
	
	
	

}
