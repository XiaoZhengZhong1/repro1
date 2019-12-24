package com.Thread2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class D05_Z_ReentarntLock {
	/*###25.06_多线程(JDK1.5的新特性互斥锁)(掌握)(取代了synchronized)
1.ReentrantLock类是再入锁定的意思,它具有与使用 synchronized同步方法和语句所访问的隐式监视器锁相同的一些基本行为和能力，但功能更强大。 
 使用ReentrantLock类的lock()获取锁和unlock()释放锁方法进行同步.获取锁要在while循环判断之前.
 * 2.通信
* 使用ReentrantLock类的newCondition()方法可以获取Condition对象
* 需要等待的时候使用Condition的await()方法, 唤醒的时候用signal()方法(可以明确等待和唤醒的具体线程,不用全部唤醒,也明确了顺序)
* 不同的线程使用不同的Condition, 这样就能区分唤醒的时候找哪个线程了(就是每个线程调用一次newCondition()方法,返回一个监控器)
*/
	public static void main(String[] args) {
			final b b2 = new b();
			new Thread(){
				public void run(){
					while(true){
					try {
						b2.print();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					}
				}
			}.start();
			new Thread(){
				public void run(){
					while(true){
					try {
						b2.print2();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					}
				}
			}.start();
			new Thread(){
				
				public void run(){
					while(true){
					try {
						b2.print3();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
				}
			}.start();
	}

}
class b {
	ReentrantLock r = new ReentrantLock();	//创建一个再入锁定类.方便调用里面的锁同步,和监控器等待唤醒方法.
	private	Condition c = r.newCondition();	//因为方法调用返回的是一个Condition监控器接口,所以要先把接口导包进来.方法才能调用
	private	Condition c2 = r.newCondition();	//表示获取3个不同的监控器,分别代表3个线程.可以指定等待和唤醒具体线程
	private	Condition c3 = r.newCondition();	//都用private私有修饰,表示只在本类中使用.
	private int a = 1;		//定义变量.用做3个线程之间执行的循环判断条件.
	public void print() throws InterruptedException{
		r.lock();		//表示用本类私有对象调用锁同步功能,执行方法中输出语句.
		if(a != 1){	
			c.await();	//c在本方法中就代表本方法和执行本方法的线程等待.
		}
		System.out.print("a");
		System.out.print("b");
		System.out.print("c");
		System.out.print("d");
		System.out.println("");
			a = 2;		//改变值
			c2.signal();	//唤醒c2线程.(注意唤醒锁的时间是在释放锁之前唤醒)
			r.unlock();	//释放锁(就是解锁)
	}
	public void print2() throws InterruptedException{
		r.lock();
		if(a != 2 ){
			c2.await();
		}
		System.out.print("1");
		System.out.print("2");
		System.out.print("3");
		System.out.print("4");
		System.out.println("");
			a = 3;
			c3.signal();
			r.unlock();
	}
	public void print3() throws InterruptedException{
		r.lock();
		if(a != 3){
			c3.await();
		}
		System.out.print("A");
		System.out.print("B");
		System.out.print("C");
		System.out.print("D");
		System.out.println("");
				a = 1;
				c.signal();
				r.unlock();
	}
	/*###25.08_多线程(线程的五种状态)(掌握)
	* 看图说话(面试会问线程的五种状态是那5种)
	* 新建,就绪,运行,阻塞,死亡*/



}