package com.thread;

public class next2 {
	/*###24.19_多线程(火车站卖票的例子用实现Runnable接口)(掌握)
*/
	public static void main(String[] args) {
		maipiao2 mp = new maipiao2();	//创建实现继承接口子类对象.
		new Thread(mp).start();	//把线程接口子类对象传入有开启方法的Thread线程类构造函数中.来调用开启线程方法.
		new Thread(mp).start();
		new Thread(mp).start();
		new Thread(mp).start();
	}

}
class maipiao2	implements Runnable{
	private int piao = 100;		//因为只需要创建一个对象,分配4条线程构造函数中也是一个同一个对象.所以只有一个对象访问100,无需共享.
	@Override
	public void run() {
	while(true){
		synchronized(maipiao.class){//新键同步表示4个线程,要等每个线程进来执行完卖票后,别的线程才能进来.用类名字节码当对象的唯一
		if(piao <= 0){
			break;
		}
			try {
				Thread.sleep(10);	//注意休眠只能类名点调用.并且是在输出语句前休眠,才能生效.时间停止异常需要Ctrl+1生成try.... 
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "...这是第:" + piao-- + "张票");/*因为Runnable
			只有一个run方法.没有其它方法.所以要用当前线程调用getName()方法,线程开启了,run方法的输出语句会自动执行,*/
		}
	}
	
	
	
	}
	
	
}

/*###24.20_多线程(死锁)(了解)
* 多线程同步的时候, 如果同步代码嵌套, 使用相同锁, 就有可能出现死锁
	* 尽量不要嵌套使用*/