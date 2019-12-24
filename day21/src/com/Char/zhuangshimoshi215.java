package com.Char;

public class zhuangshimoshi215 {
/*###21.11_IO流(装饰设计模式)(就是定义一个接口,接口不够强.需要一个强大的类去实现这个接口,类中会有更强大的方法.这个强大的类就是装饰)
 * 装饰设计的好处是,降低了耦合性,因为装饰类heima是实现了被装饰类Coder.是实现关系,不会随Coder改变而改变.*/
	public static void main(String[] args) {
		student stu = new student();
				stu.cod();
		heima h = new heima(new student());	//表示传入一个学生对象.
			h.cod();
	}
}
interface Coder{  //敲代码的接口.
	public void cod();
}
class student implements Coder{	//学生实现了敲代码接口.重写了敲代码方法.

	@Override
	public void cod() {
		System.out.println("java");		//只要一个java技术,不够强大,不适合推广.
	System.out.println("----------------------------");
	}
	
}

class heima implements Coder{	//heima也实现了敲代码接口.
	private student s;			//封装了学生类对象,表示是本类中的学生.
	public heima(student s) {		//有参构造,参数为学生类对象.
		this.s = s;
	}

	@Override
	public void cod() {	//heima类就是装饰设计模式.把原接口进行强化包装.包装后跟适合推广.它是实现而不是继承,降低了耦合性.
		s.cod();
		System.out.println("javaEE");
		System.out.println("android");
		System.out.println("大数据");
	}
	
}