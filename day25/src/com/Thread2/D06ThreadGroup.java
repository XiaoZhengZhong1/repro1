package com.Thread2;

public class D06ThreadGroup {
	/*###25.07_多线程(线程组的概述和使用)(了解)
	* A:线程组概述
		* Java中使用ThreadGroup来表示线程组，它可以对一批线程进行分类管理，Java允许程序直接对线程组进行控制。
		* 默认情况下，所有的线程都属于主线程组。
			* public final ThreadGroup getThreadGroup()//通过线程对象获取他所属于的组
			* public final String getName()//通过线程组对象获取他组的名字
		* 我们也可以给线程设置分组
			* 1,ThreadGroup(String name) 创建线程组对象并给其赋值名字
			* 2,创建线程对象
			* 3,Thread(ThreadGroup?group, Runnable?target, String?name) 
			* 4,设置整组的优先级或者守护线程
		* B:案例演示
			* 线程组的使用,默认是主线程组*/

	//通过组名称设置后台线程，表示该组的线程都是后台线程
	//tg.setDaemon(true);
			
	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		Thread t1 = new Thread(mr, "张三");
		Thread t2 = new Thread(mr, "李四");
		//获取线程组
		// 线程类里面的方法：public final ThreadGroup getThreadGroup()
		ThreadGroup tg1 = t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();
		// 线程组里面的方法：public final String getName()
		String name1 = tg1.getName();
		String name2 = tg2.getName();
		System.out.println(name1);	//输出结果 main
		System.out.println(name2);	//输出结果 main
		// 通过结果我们知道了：线程默认情况下属于main线程组
		System.out.println(Thread.currentThread().getThreadGroup().getName());	//输出结果 main
		// 通过上面的测试，你应该能够看到，默任情况下，所有的线程都属于同一个组,main线程组

		
		//* 自己设定线程组
 			
		// ThreadGroup(String name)
		ThreadGroup tg = new ThreadGroup("这是一个新的组");

		MyRunnable mr2 = new MyRunnable();
		// Thread(ThreadGroup group, Runnable target, String name)
		Thread t3 = new Thread(tg, mr2, "张三");
		Thread t4 = new Thread(tg, mr2, "李四");
		
		System.out.println(t3.getThreadGroup().getName());	//输出结果这是一个新的组
		System.out.println(t4.getThreadGroup().getName());
	}

}
class MyRunnable implements Runnable{

	@Override
	public void run() {
	for (int i = 0; i < 10; i++) {
		
		System.out.println(Thread.currentThread().getName() + "....." + i);
	}
	}
	
}
/*###25.10_多线程(多线程程序实现的方式3)(了解)
*实现步骤:1:实现接口public class MyCallable implements Callable<Integer> {
* 2:重写方法,方法可以抛异常,有return返回值public Integer call() throws Exception {
* 3:创建一个线程池ExecutorService pool = Executors.newFixedThreadPool(1)
* 4:把实现的接口子类,传入线程池参数中.Future<Integer> f1 = pool.submit(new MyCallable(xxx));
*5:获取返回值:Integer i1 = f1.get();
*6:输出返回值System.out.println(i1);
*提交的是Callable
* 多线程程序实现的方式3的好处和弊端
	* 好处：
		* 可以有返回值
		* 可以抛出异常
		
	* 弊端：
		* 代码比较复杂，所以一般不用
* 
* */
/*###25.11_设计模式(简单工厂模式概述和使用)(了解)
* A:简单工厂模式概述
	* 又叫静态工厂方法模式，它定义一个具体的工厂类负责创建一些类的实例
* B:优点
	* 客户端不需要在负责对象的创建，从而明确了各个类的职责
* C:缺点
	* 这个静态工厂类负责所有对象的创建，如果有新的对象增加，或者某些对象的创建方式不同，就需要不断的修改工厂类，不利于后期的维护
* D:案例演示
	* 动物抽象类：public abstract Animal { public abstract void eat(); }
	* 具体狗类：public class Dog extends Animal {}
	* 具体猫类：public class Cat extends Animal {}
	* 开始，在测试类中每个具体的内容自己创建对象，但是，创建对象的工作如果比较麻烦，就需要有人专门做这个事情，所以就知道了一个专门的类来创建对象。
* 
*/

/*###25.12_设计模式(工厂方法模式的概述和使用)(了解)
* A:工厂方法模式概述
	* 工厂方法模式中抽象工厂类负责定义创建对象的接口，具体对象的创建工作由继承抽象工厂的具体类实现。
* B:优点
	* 客户端不需要在负责对象的创建，从而明确了各个类的职责，如果有新的对象增加，只需要增加一个具体的类和具体的工厂类即可，不影响已有的代码，后期维护容易，增强了系统的扩展性
* C:缺点
	* 需要额外的编写代码，增加了工作量*/
