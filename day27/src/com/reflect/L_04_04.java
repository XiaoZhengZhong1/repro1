package com.reflect;

public class L_04_04 {//����������ʾL_04�������ù�������÷�.

	public static void main(String[] args) throws Exception {
		student s = new student("xzz",31);	//ͨ���вι���,��������,����ֵ.
		System.out.println(s);
		L_04 L = new L_04();				//�������ù��������.ע�⹤�����еķ���.�ǿ��Ա�����ȡ�ֶ�,���ҳ�ȥȨ�޵�.
		L.setProperty(s, "name", "xh");		//���ù��������������еķ���,����s�����еĳ�Ա����name,����Ϊxh
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
