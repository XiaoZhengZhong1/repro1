package cn.demo1;
//���������ʾ,���似����ȡclass��������ַ���
public class student {
		public String name;//������Ȩ�޸ĳ�public��Ϊ�˲��Է������Filed���е�set(Object obj,Object value);����
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
			System.out.println("���緹");
		}
		public void eat(String name ,int in){
			System.out.println(name + "�Է�����" + in + "����");
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
