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
	public boolean equals(Object obj) {	//��ʾ����Ƚϵ��Ƕ�������Ķ���.
		person p = (person)obj;			//��Ҫ����ת��,ת��ͬһ���Ͳ��ܻ�ȡgetName��getAge���бȽ��Ƿ�һ��.
		return this.name.equals(p.name) && this.age == p.age;//��ʾ�������������,�������䶼�Ͷ��������е���ͬ�ͷ���true
//��Ϊ����������������Ҫ�Ƚ�ֵ������equals,������int������������,�Ƚϵ��ǵ�ֵַ������==��.
	}
	
	

}
