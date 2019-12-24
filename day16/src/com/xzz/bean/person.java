package com.xzz.bean;

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
	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + "]";
	}
	@Override
	public boolean equals(Object obj) {	//表示参入比较的是顶级父类的对象.
		person p = (person)obj;			//需要向下转型,转成同一类型才能获取getName和getAge进行比较是否一样.
		return this.name.equals(p.name) && this.age == p.age;//表示如果本对象姓名,并且年龄都和顶级父类中的相同就返回true
//因为年龄是是引用类型要比较值所以用equals,年龄是int基本数据类型,比较的是地址值所以用==号.
	}
	
	

}
