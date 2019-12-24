package com.thread;



public class D10_Z_synchronized {
	/*###24.17_多线程(同步方法)(掌握)
	* 使用synchronized关键字修饰一个方法,该方法中所有的代码都是同步的(前提是有同步的对象,有另一个方法中有缩和对象,并且对象能默认相同)
	 非静态同步函数的锁是:this
	 * 静态的同步函数的锁是:字节码对象(就是方法本身的类文件(类名.class))*/
	public static void main(String[] args) {
		final one o = new one();
		new Thread(){
			public void run(){
				for (int i = 0; i < 10; i++) {
					o.println();
				}
			}
		}.start();
		new Thread(){
			public void run(){
				for (int i = 0; i < 10; i++) {
					o.println2();
				}
			}
		}.start();
	}

}

class one{
	public synchronized void println(){	//方法中加了synchronized表示同步方法.和本类已有的方法同步,包括锁.锁要是系统能默认
		System.out.print("a");
		System.out.print("b");
		System.out.print("c");
		System.out.print("d");
		System.out.print("\r\n");	//有了同步方法,就能保证abcd是一行输出.如果没有同步方法,集合交叉输出,如:abcdAB
	}
	public void println2(){
		synchronized(this){		//表示同步下面输出语句.锁我this.本类对象.
		System.out.print("A");
		System.out.print("A");
		System.out.print("A");
		System.out.print("A");
		System.out.print("\r\n");	//有了同步方法.能保证AAAA在一行输出,不会出现AAAAab
		}
	}
}

/*静态方法就是第一个方法声明上public static synchronized void println() 方法中加了static
 * 第二个方法中synchronized(one.class) 把第二个同步锁对象改为(one.class).因为静态是随着类的加载而加载的,加载类的时候没有对象
 * 类文件对象class就是系统能识别的对象.*/

/*###24.21_多线程(以前的线程安全的类回顾)(掌握)
* A:回顾以前说过的线程安全问题
	* 看源码：Vector,StringBuffer,Hashtable,Collections.synchroinzed(xxx)
	* Vector是线程安全的,ArrayList是线程不安全的-----在编译(写代码)区,Ctrl+Shift+t,搜索类或者集合.再Ctrl+o搜索add和put方法
	* 会发现,线程安全的方法中都添加了synchronized同步方法.线程不安全的都没有添加同步方法.
	* StringBuffer是线程安全的,StringBuilder是线程不安全的
	* Hashtable是线程安全的,HashMap是线程不安全的
*/
