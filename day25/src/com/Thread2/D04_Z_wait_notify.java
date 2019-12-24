package com.Thread2;

public class D04_Z_wait_notify {
	/*###25.04_多线程(两个线程间的通信)(掌握)
	* 1.什么时候需要通信
* 多个线程并发执行时, 在默认情况下CPU是随机切换线程的(就是这个线程执行一会儿,那个线程执行一会儿.加了同步也是一样(同步能保证线程之间不乱))
		* 如果我们希望他们有规律的执行, 就可以使用通信, 例如每个线程执行一次打印
	* 2.怎么通信
		* 如果希望线程等待, 就调用wait()
		* 如果希望唤醒等待的线程, 就调用notify();
		* 这两个方法必须在同步代码中执行, 并且使用同步锁对象来调用(锁对象就是类名点class或者this都是系统默认能识别的.或者创建一个对象)*/
	public static void main(String[] args) {
		final tongxin tg = new tongxin();
		new Thread(){
			public void run(){
				for (int i = 0; i < 10; i++) {
					try {
						tg.print();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}	//表示用匿名线程内部类开启一条线程.tg编译报错(因为内部类中的变量必须是final修饰)
				}
			}
		}.start();
		new Thread(){
			public void run(){
				for (int i = 0; i < 10; i++) {
					try {//因为下面类中两个方法调用抛出异常,抛到方法上,由调用者处理.所以我们调用方法就要处理异常(run父类没有异常,)
						tg.print2();//表示用匿名线程内部类开启一条线程.tg编译报错(因为内部类中的变量必须是final修饰)
					} catch (InterruptedException e) {	//run()方法父类没有异常,子类不能抛异常.只能try
						
						e.printStackTrace();
					}	
				}
			}
		}.start();
	}

}
class tongxin{
	private int a = 1;	//定义一个变量,用来做通信交换条件.私有变量,表示只能在本类中使用.
	public void print() throws InterruptedException{
		synchronized(tongxin.class){
			if(a != 1){		//上面显示赋值为1 ,判断表示a 如果不等于1,就让线程等待.
				tongxin.class.wait();//wait()等待方法是Objict类的方法.所有类也可以调用.所以用类文件对象调用也是可以的this也行
			}
		System.out.print("a");
		System.out.print("b");
		System.out.print("c");
		System.out.print("d");
		System.out.println("");	
			a = 2;	//把变量改为2
			tongxin.class.notify();	//唤醒下线程,有等待肯定要有唤醒.是同时存在的.方便线程通信.
		}
	}
	public void print2() throws InterruptedException{
		synchronized(tongxin.class){
			if(a != 2){	//if语句是从上往下执行的,如果是多个线程,被唤醒后可能直接走下面的被唤醒的wait,而不上去做if判断.
				tongxin.class.wait();	//注意通信等待和唤醒必须在同步里面,因为等待和唤醒的是同步中的内容.
			}
		System.out.print("1");
		System.out.print("2");
		System.out.print("3");
		System.out.print("4");
		System.out.println("");	
			a = 1;
		   tongxin.class.notify(); //做了判断后只有两个值,分别代表一个线程.而且当一个线程执行时,另一个线程在等待.就能保证线程规律
		}
	}
}
/*
###25.05_多线程(三个或三个以上间的线程通信)
* 多个线程通信的问题
	* notify()方法是随机唤醒一个线程
	* notifyAll()方法是唤醒所有线程
	* JDK5之前无法唤醒指定的一个线程
	* 如果多个线程之间通信, 需要使用notifyAll()通知所有线程, 用while来反复判断条件
*/
