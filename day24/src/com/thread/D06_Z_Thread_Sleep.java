package com.thread;

public class D06_Z_Thread_Sleep {
	/*###24.11_多线程(休眠线程)(掌握)----Sleep是睡眠的意思.Thread.Sleep(毫秒)是线程睡眠的意思.因为window系统不支持纳秒
	* Thread.sleep(毫秒,纳秒), 控制当前线程休眠若干毫秒1秒= 1000毫秒 .1秒 = 1000 * 1000 * 1000纳秒 =1000000000纳秒就是10亿*/
	public static void main(String[] args) throws InterruptedException {
			Thread.sleep(5000);		//表示主线程在运行时休眠5秒钟,后再运行.(此行会出现时间停止异常)
			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);  //表示在循环中,每循环一次休眠1秒.
				System.out.println("i");
			}
	
			new Thread(){
				public void run(){	//方法重写代表继承,子类继承父类只能比父类强,父类的run()方法没有异常.子类就不能抛出异常
					for (int i = 10; i > 0; i--) {
						try {	
							Thread.sleep(1000);	//注意此行同样会报出时间停止异常,但是不能抛出.只能Ctrl + 1 生成try catch
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
						System.out.println("a");
					}
				}
			}.start();
	
	}

}
