package com.thread;

public class D05_Z_Thread_currentThread {
/*###24.10_多线程(获取当前线程的对象)(掌握)
 * current是"当前的,现在发生的"意思.currentThread()是Thread类中的静态方法,只能类名点调用.是获取当前线程的意思
* Thread.currentThread(), 主线程也可以获取*/
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());	//表示输出当前线程的名称. Run As = main
		Thread.currentThread().setName("我是主线程");	//表示获取当前线程并调用设置方法设置线程名称
		System.out.println(Thread.currentThread().getName());//表示输出获取当前线程,调用获取名称方法Run As =我是主线程
	
		new Thread("我是第二条线程"){
			public void run(){
				System.out.println(getName());	//getName(),前面不加this,系统会自动添加.
			}
		}.start();
		
		new Thread(new Runnable(){	/*new Thread(xxx);表示new的是有参构造方法.一个方法是不能代表一个线程的,但是构造函数中
		传入了一个实现了接口的匿名类.还是Thread的父类.因为API显示Thread(Runnable)是可以传入Runnable对象的.因为它是接口,所以只能
		传入它的子类.API显示会分配一个新的线程.*/
			public void run(){
				System.out.println(Thread.currentThread().getName());	/*Run As = Thread-0 获取当前线程名称
				证明这个线程类又分配到了一个新线程.注意Runnable接口中只要一个run()方法.没有其它任何方法.这也Runnable线程接口的弊端.没有任何
				功能可以用,连自己的子类线程都没有开启的方法.只能通过Thread(Runnable)构造函数.把实现自己的子类传入构造函数中,用Thread的开启方法
				开启线程.自己只有一个run方法.有了currentThread()获取当前线程的方法.就可以在类中获取当前线程,并调用线程的所以方法.*/
			}
		}).start();
			
		
		
		
	
	}

}
