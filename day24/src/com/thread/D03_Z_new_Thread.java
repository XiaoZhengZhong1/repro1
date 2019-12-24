package com.thread;

public class D03_Z_new_Thread {
	/*###24.08_多线程(匿名内部类实现线程的两种方式)(掌握)
	* 继承Thread类
	* 字面解释.匿名类部类,就是在一个类中创建一定匿名类(前提是这个匿名类.是存在的).比如Thread xxx = new Thread();Thread本身就是一个
	* 线程类,在别的类中new Thread(){},就是类中创建匿名类.注意后面一定要跟{}代表创建的是类.因为new Thread()本身就是一个匿名类和
	* class A 是一个意思.因为本身是类,前面就不用加class但是.后面一定要加{}表示创建一个类.在一个类中创建另一个匿名类.相当于是继承了
	* 这个类匿名类本身的类.Thread类.
	* */
	public static void main(String[] args) {
//匿名内部类1:new Thread(){}.start(); 类中必须重写run()方法.最后类调用开启方法
		new Thread(){	/*一个继承了Thread类的,内部类匿名子类对象.(因为Thread线程类本身就存在API中,是Java lang包下的,不需要
			导包.在别的类中new Thread就是创建了Thread的子类类对象.).*/
			public void run(){	//重写了方法
				for (int i = 0; i < 1000; i++) {	
					System.out.println("abcd");
				}
			}
		}.start();	//因为new线程就要开启,所有}后面会报错, .start();开启后就不报错了.(因为没有赋值对象.整个匿名类就是对象,调用方法)
		
/*匿名内部类2:	new Thread(new Runnable(){}).start();	 这里匿名类是new Runnable(){}类中必须重写run方法.因为Runnable
 * 接口里面没有start()方法.所以要放在new Thread()匿名对象参数中.用对象调用开启方法.*/
		new Thread(new Runnable(){		//匿名类部类new Runnable(){}实现了Runnable
			public void run(){			//重写方法.
				for (int i = 0; i < 1000; i++) {	//方法中可以有自己的执行语句.
					System.out.println("12334");
				}
			}
		}).start();
			
		
		
	}

}
