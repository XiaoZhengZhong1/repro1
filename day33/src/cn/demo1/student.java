package cn.demo1;
//本类配合演示,反射技术获取class对象的三种方法
public class student {
		public String name;//把修饰权限改成public是为了测试反射包下Filed类中的set(Object obj,Object value);方法
		public int age;
		public student() {
			super();
			
		}
		private student(String name) {
			this.name=name;
		}
		public student(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
		public void eat(){
			System.out.println("吃早饭");
		}
		public void eat(String name ,int in){
			System.out.println(name + "吃饭吃了" + in + "分钟");
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
			return "stuedent [name=" + name + ", age=" + age + "]";
		}
		
		
}
