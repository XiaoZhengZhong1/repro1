package com.collection;

public class xt2{
	private String name;
	private int age;
	public xt2() {
		super();
		
	}
	public xt2(String name, int age) {
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
		return "xt2 [name=" + name + ", age=" + age + "]";
	}
	
}