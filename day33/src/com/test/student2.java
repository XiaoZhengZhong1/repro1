package com.test;

public class student2 {
		public String name;
		public int age;
		public student2() {
			super();
			
		}
		public void study(String name , int age) {
			System.out.println("ѧ������:" + name + "ѧϰ�ܺ�"  + "����ֻ��:" + age + "��" );
		}
		public student2(String name, int age) {
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
			return "student2 [name=" + name + ", age=" + age + "]";
		}
		
	}

