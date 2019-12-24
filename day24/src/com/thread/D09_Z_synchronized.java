package com.thread;

public class D09_Z_synchronized {
	/*###24.14_多线程(礼让线程)(了解)
	* yield让出cpu

	###24.15_多线程(设置线程的优先级)(了解)
	* setPriority()设置线程的优先级

	###24.16_多线程(同步代码块)(掌握)------
	* 1.什么情况下需要同步
		* 当多线程并发, 有多段代码同时执行时, 我们希望某一段代码执行的过程中CPU不要切换到其他线程工作. 这时就需要同步.
		* 如果两段代码是同步的, 那么同一时间只能执行一段, 在一段代码没执行结束之前, 不会执行另外一段代码.
	* 2.同步代码块
		* 使用synchronized关键字加上一个锁对象来定义一段代码, 这就叫同步代码块--就是加了锁后,线程都被锁起来了,只有自己线程执行完
		* 才能执行别的线程.不会出现线程交叉执行.格式:synchronized(任意对象){线程执行语句}
		* 多个同步代码块如果使用相同的锁对象, 那么他们就是同步的
*/
	public static void main(String[] args) {
		final pri p1 = new pri();	
		new Thread(){	//创建一个匿名内部类线程
			public void run(){
				for (int i = 0; i < 50; i++) {
					p1.print();	/*p1会编译报错.(不可以用一个内部类中的非最终变量p1.该内部类是在另一个方法中定义的)意思是内部类中
					使用的变量,必须是被final修饰过的.  */
				}
			}
		}.start();
		new Thread(){	//创建第二个匿名内部类线程.
			public void run(){
				for (int i = 0; i < 5; i++) {
					p1.print2();
				}
			}
		}.start();
	}

}
class pri{
	f f2 = new f();		//创建锁对象.任意对象.
	public void print(){
		synchronized(f2){		/*加上锁和一样的锁对象(f2),两个线程会先运行输出"aaaaa"结束后再运行"12345678"注释锁后,
		两个程序输出语句会交叉执行.*/
		System.out.println("aaaaaa");
		}
		}
	public void print2(){
		synchronized(f2){	//创建锁,对象一样,则为同步.
		System.out.println("12345678");
		}
	}
}
class f {	//创建类.任意类.用来创建锁对象.
	
}