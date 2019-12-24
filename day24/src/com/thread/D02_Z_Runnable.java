package com.thread;

public class D02_Z_Runnable {
	/*###24.05_多线程(多线程程序实现的方式2)(掌握)
	* 2.实现Runnable
		* 定义类实现Runnable接口
		* 实现run方法
		* 把新线程要做的事写在run方法中
		* 创建自定义的Runnable的子类对象(在测试类new)
* 创建Thread对象, 构造参数中传入Runnable的子类new的对象(因为Runnable是一个接口,没有start()开启方法.Thread类是Runnable的子类)
		* 调用start()开启新线程, 内部会自动调用Runnable的run()方法*/
	public static void main(String[] args) {
		A2 aa = new A2();
		Thread t = new Thread(aa);	//把Reannble接口的子类A2类的对象传入,Runnable的另一个子类Thread类的构造方法参数中.
			t.start();				//调用Thread的开启方法.调用start()开启新线程, 内部会自动调用Runnable的run()方法*
			for (int i = 0; i < 1000; i++) {	
				System.out.println("abcd");
			}
	}

}
class A2 implements Runnable{
	public void run() {
		for (int i = 0; i < 1000; i++) {	//方法中可以有自己的执行语句.
			System.out.println("12334");
		}
	}

	
}

/*###24.06_多线程(实现Runnable的原理)(了解)
* 查看源码
	* 1,看Thread类的构造函数,传递了Runnable接口的引用 
	* 2,通过init()方法找到传递的target给成员变量的target赋值
	* 3,查看run方法,发现run方法中有判断,如果target不为null就会调用Runnable接口子类对象的run方法
*/
/*###24.07_多线程(两种方式的区别)(掌握)
* 查看源码的区别:
	* a.继承Thread : 由于子类重写了Thread类的run(), 当调用start()时, 直接找子类的run()方法
	* b.实现Runnable : 构造函数中传入了Runnable的引用, 成员变量记住了它, start()调用run()方法时内部判断成员变量Runnable的引用是否为空, 不为空编译时看的是Runnable的run(),运行时执行的是子类的run()方法
	
	** 继承Thread
	* 好处是:可以直接使用Thread类中的方法,代码简单
	* 弊端是:如果已经有了父类,就不能用这种方法
* 实现Runnable接口
	* 好处是:即使自己定义的线程类有了父类也没关系,因为有了父类也可以实现接口,而且接口是可以多实现的
	* 弊端是:不能直接使用Thread中的方法需要先获取到线程对象后,才能得到Thread的方法,代码复杂.
	*/