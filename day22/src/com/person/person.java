package com.person;

import java.io.Serializable;	//�˽ӿ��ǿ�������.

public class person implements Serializable {	//��ΪֻҪʵ����Serializable����ӿ�,�����������л�����.
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;/*ID��������ÿ�ε����е�,��дϵͳҲ���Զ�����.1�Ǳ��.L��long.
	����ID��Ҳ���ᱨ��.�������.���Ҫ�޸��������,�ĺ�,ID��ҲҪ��.*/
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
