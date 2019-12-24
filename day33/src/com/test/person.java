package com.test;
/*	
6.定义一个标准的JavaBean，名叫Person，包含属性name、age。
	使用反射的方式创建一个实例、调用构造函数初始化name、age，使用反射方式调用setName方法对名称进行设置，
	不使用setAge方法直接使用反射方式对age赋值。*/
public class person {
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
	private void eat() {
		System.out.println("我在吃饭");
	}
		public void run() {
			System.out.println("练习读取配置文件");
		}
	

	
	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + "]";
	}
	
}
