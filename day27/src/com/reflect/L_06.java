package com.reflect;

public class L_06 {
	/*###27.12_设计模式(模版(Template)设计模式概述和使用)
	* A:模版设计模式概述
		* 模版方法模式就是定义一个算法的骨架，而将具体的算法延迟到子类中来实现
	* B:优点和缺点
		* a:优点
			* 使用模版方法模式，在定义算法骨架的同时，可以很灵活的实现具体的算法，满足用户灵活多变的需求
		* b:缺点
			* 如果算法骨架有修改的话，则需要修改抽象类*/
	public static void main(String[] args) {
		/*long start = System.currentTimeMillis();//表示当前时间毫秒值.也是开始时间
			for (int i = 0; i < 100000; i++) {
			System.out.println("*");
			}
		long end = System.currentTimeMillis();//表示结束时间,用来计算代码运行是时间差.
		System.out.println(end - start);      //计算代码运行的时间.
	*/
	
	     C2 c = new C2();
	     	System.out.println(c.getTime());/*表示调用父类C中的私有方法getTime();而方法中计算的是被抽取的方法,而该方法
	     	是抽象的,是强制要求子类重写的,是非静态方法,所以是动态绑定,编译看左边父类.运行看右边子类.所以该方法计算的是,子类的code
	     	方法中代码的运行时间.*/
	}

}
//优化上面计算代码运行时间的代码.把它放在一个类中,在类中定义两个方法.一个写代码方法.一个计算时间差方法.
abstract class C {//因为类中有抽象方法.抽象方法必须在抽象类中.所以类必须是抽象的.
	public final long getTime(){/*表示所有一个获取时间的方法,代码是固定的,结束时间-开始时间.所有次方法不能修改.就用final修饰
	虽然定义成final后,子类无法继承,但是子类可以直接使用.*/
		long start = System.currentTimeMillis();//表示当前时间毫秒值.也是开始时间
				code();
		long end = System.currentTimeMillis();//表示结束时间,用来计算代码运行是时间差.
		//System.out.println(end - start);      //计算代码从开始到结束的时间差.
		return end - start;	//把时间差返回,(方便子类继承后调用方法,就能直接返回计算后的时间)
	}
		
		public abstract void code();/*示一个抽象的写代码的方法.定义成抽象是要求子类必须重写,代码内容由子类自己定义.必须重写
		是因为定义此类就是,定义一个计算代码运行时间的模式.如果没有写代码的方法,就谈不上运行时间*/
}
class C2 extends C{

	@Override
	public void code() {
		int i = 0;
		while(i < 100000){
		System.out.println("0");
				i++;
		}
	}
	
}


