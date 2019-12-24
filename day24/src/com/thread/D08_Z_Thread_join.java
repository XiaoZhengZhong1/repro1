package com.thread;

public class D08_Z_Thread_join {
/*###24.13_多线程(加入线程)(掌握)
* join(), 当前线程暂停, 等待指定的线程执行结束后, 当前线程再继续(就是本线程在执行时,别的线程进来插队插本线程前面执行.)
* join(int), 可以等待指定的毫秒之后继续,(表示插队多少毫秒,时间过后插队结束)*/	
	public static void main(String[] args) {
		final Thread t1 = new Thread(){
			public void run(){
				for (int i = 0; i < 10; i++) {
					System.out.println(getName() + "...aaaaa");
				}
				
			}
		};
	
		Thread t2 = new Thread(){
			public void run(){
				for (int i = 0; i < 10; i++) {
					if(i == 3){		//表示如果i == 3
					try {
						t1.join(1);	//t1插队进来执行1毫秒
						//t1.join();	//表示t1插队进来,先执行t1线程.
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}    /*t1编译报错提示(不可以用一个内部类中的非最终变量t1.该内部类是在另一个方法中定义的)意思是说
					内部类的变量t1也是局部内部类变量.必须用final修饰后,才能在别的类中使用.
					解决t1后,还会出现一个运行时间中断异常,try catch检测,捕获解决.*/
					}
					System.out.println(getName() + "...bbbbbb");
				}
				
			}
		};
		t1.start();
		t2.start();
	}

}
