package com.test;
/*	
6.����һ����׼��JavaBean������Person����������name��age��
	ʹ�÷���ķ�ʽ����һ��ʵ�������ù��캯����ʼ��name��age��ʹ�÷��䷽ʽ����setName���������ƽ������ã�
	��ʹ��setAge����ֱ��ʹ�÷��䷽ʽ��age��ֵ��*/
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
		System.out.println("���ڳԷ�");
	}
		public void run() {
			System.out.println("��ϰ��ȡ�����ļ�");
		}
	

	
	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + "]";
	}
	
}
