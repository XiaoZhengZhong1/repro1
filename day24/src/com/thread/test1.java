package com.thread;

public class test1 {
	/*###24.18_多线程(线程安全问题)(掌握)
	* 多线程并发操作同一数据时,(比如4个线程,同时买100张票)就有可能出现线程安全问题(比如遇到休眠,4个线程都休眠后,又同时减减就会跳过判断
	* 语句中的比较变量值)
	* 使用同步技术可以解决这种问题, 把操作数据的代码进行同步,(同步后只有每个线程卖完一张结束后才会让另一个线程进来.) 不要多个线程一起操作
	* */
	public static void main(String[] args) {
		maipiao m = new  maipiao();		//表示创建了4条线程.
		maipiao m2 = new  maipiao();
		maipiao m3 = new  maipiao();
		maipiao m4 = new  maipiao();
			m.start();
			m2.start();
			m3.start();
			m4.start();
	}

}
class maipiao extends Thread{	//表示继承了线程类
	private static int piao = 100;//如果不把100张票定义成公共的.共享的.那每个子类都回拿到100张票.只有定义成共享的.4线程共100
	public void run(){
			
		while(true){
			synchronized(maipiao.class){/*加上线程同步,表示只有每个线程卖完一张票后,别的线程才能进来.这样就安全了.注意加同步
			位置.一定是在while里面.如果是在while外面.表示连这个死循环都一起同步了.就是只有第一天0线程进来执行,直到卖完100张票跳出*/
			if(piao <= 0){
				break;
		}else{
				try {
					Thread.sleep(10);	//如果让线程每次循环休眠10毫秒,再执行下面的输出语句,就代表4线程会分别执行减减.出现负票
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			System.out.println(getName() + "...这是第:" + piao-- + "张票");
		}
			}
		}
		}
}