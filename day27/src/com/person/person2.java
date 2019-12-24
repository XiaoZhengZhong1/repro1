package com.person;
public class person2 {
	private String name;
	private int age;
	/*public person2() {
		super();
		}*/
	public person2(String name, int age) {
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
		return "person2 [name=" + name + ", age=" + age + "]";
	}
	public void eat(){
		System.out.println("今天吃了一顿板栗");
	}
	public void eat(int num){
		System.out.println("今天吃了" + num  + "顿板栗");
	}
}

