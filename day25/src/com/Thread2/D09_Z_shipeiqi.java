package com.Thread2;

public class D09_Z_shipeiqi {
	/*###25.19_设计模式(适配器设计模式)(掌握)
	* a.什么是适配器
		* 在使用监听器的时候, 需要定义一个类事件监听器接口.
		* 通常接口中有多个方法, 而程序中不一定所有的都用到, 但又必须重写, 这很繁琐.
		* 适配器简化了这些操作, 我们定义监听器时只要继承适配器, 然后重写需要的方法即可.
	* b.适配器原理
		* 适配器就是一个类, 实现了监听器接口, 所有抽象方法都重写了, 但是方法全是空的.
		* 适配器类需要定义成抽象的,因为创建该类对象,调用空方法是没有意义的
		* 目的就是为了简化程序员的操作, 定义监听器时继承适配器, 只重写需要的方法就可以了.*/
	public static void main(String[] args) {

	}

}
interface ABCDE{
	public void a();	//因为接口的方法,必须是抽象的.系统会默认加上abstract,抽象方法是没有{}的
	public void b();
	public void c();
	public void d();
	public void e();
}
 abstract	class FG implements ABCDE{//FG就是一个适配器类.它实现了这个接口,重写了方法(因为接口中的方法默认都是抽象的,强制重写)

	@Override
	public void a() {
	}

	@Override
	public void b() {
	}

	@Override
	public void c() {
	}

	@Override
	public void d() {
	}

	@Override
	public void e() {
	}
	
}
 class HJ extends FG{
	 @Override
	public void c() {
		System.out.println("我只需要c方法.继承适配器FG就可以完成,如果没有适配器,就要实现接口,重写所有方法");
		
	}
 }