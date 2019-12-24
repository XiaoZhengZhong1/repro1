package com.thread;

public class D04_Z_Thread_name {
/*	###24.09_多线程(获取名字和设置名字)(掌握)
	* 1.获取名字----线程也是有名称的,默认名称是按开启线程的个数以0,1,2,3.....为名称.
		* 通过getName()方法获取线程对象的名字.----匿名类可以在输出语句中用this.getName();this代表本匿名类.
	* 2.设置名字
		* 通过构造函数可以传入String类型的名字-----就是在构造方法的("传入名字")*/
	public static void main(String[] args) {
//* 1.获取名字----* 通过getName()方法获取线程对象的名字
		new Thread(){
			public void run(){
				System.out.println(this.getName());   //Run As = Thread-0	表示名称是0线程.
			}
		}.start();
	

		new Thread(){
			public void run(){
				System.out.println(this.getName());   //Run As = Thread-1	表示名称是1线程.
			}
		}.start();
//2:可以在方法中先设置和在构造函数中设置.再获取.		
		new Thread(){
			public void run(){
				this.setName("abc");	//在方法中设置线程名称为abc
				System.out.println(this.getName());   //Run As = abc	表示线程名称是abc.
			}
		}.start();
	
		new Thread("abcdef"){	//在构造函数中设置线程名称为abcdef
			public void run(){	
				System.out.println(this.getName());   //Run As = abcdef	表示线程名称是abcdef
			}
		}.start();
	
//3:通过有名称的类对象设置和获取
		Thread th = new Thread(){	//表示父类引用指向子类对象Thread是父类,new出来的是子类,th就是代表这个子类对象.
			public void run(){	
				System.out.println(this.getName());   //Run As = ggg	表示线程名称是ggg
			}
		};
		th.setName("ggg");			//表示对象有名称就用名称调用设置,和开启方法.
		th.start();
	}

	
	
}
