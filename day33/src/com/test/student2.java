package com.test;

public class student2 {
		public String name;
		public int age;
		public student2() {
			super();
			
		}
		public void study(String name , int age) {
			System.out.println("学生姓名:" + name + "学习很好"  + "年龄只有:" + age + "岁" );
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

