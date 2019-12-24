package cn.demo1;

public class classdemo {

	public static void main(String[] args) throws ClassNotFoundException {
	//演示获取一个类的字节码文件对象的3种方式
		//1:对象获取
		student s = new student();
		Class c = s.getClass();
		System.out.println(c);

		//2:类名获取(任何一个类都有一个静态的类名class)
		Class c2 = student.class;
		System.out.println(c2);
	
		//3:调用Class类中的静态方法,forName(String name);注意参数中的字符串类名必须是 包名.类名  必须是全名,
		 Class c3 = Class.forName("cn.demo1.student");
		 System.out.println(c3);
	}


}
