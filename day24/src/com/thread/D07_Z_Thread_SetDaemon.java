package com.thread;

public class D07_Z_Thread_SetDaemon {
	/*###24.12_多线程(守护线程)(掌握)
	* setDaemon(), 设置一个线程为守护线程, 该线程不会单独执行, 当其他非守护线程都执行结束后, 自动退出*/
	public static void main(String[] args) {
//因为要声明那个是守护线程,那个是被守护线程.所以开启是线程要有名称.而不是匿名.
	Thread t1 = new Thread(){
		public void run(){
			for (int i = 0; i < 1; i++) {
				System.out.println("被守护的主帅");
			}
		}
	};	//因为是内部类,所以要用;结束
	
	Thread t2 = new Thread(){
		public void run(){
			for (int i = 0; i < 10; i++) {
				System.out.println("守护的主帅马前卒");
			}
		}
	};	//因为是内部类,所以要用;结束
	t2.setDaemon(true);  //表示t2是守护线程,守护t1.t1线程如果输出语句很少,或者线程结束弹栈了,t2线程可能没机会开启,或者运行很少
	t1.start();			//当被守护线程t1结束后.t2守护线程在接到指令后也会结束.
	t2.start();
	}

}
