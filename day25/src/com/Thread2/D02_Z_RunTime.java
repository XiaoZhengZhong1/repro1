package com.Thread2;

import java.io.IOException;

public class D02_Z_RunTime {
	/*###25.02_多线程(Runtime类)-----是java lang包下的,用时不用导包.
	* Runtime类是一个单例类---类中有一个方法是 Process exec(String command) 表示 在单独的进程中执行指定的字符串命令。
 	1:Runtime类中没有构造方法(一个类中如果没有构造方法.)说明私有了构造方法.有可能类中所有方法都是静态的.或者是一个单列类.(不让本类以外
	的类区创建本类对象.只在本类中创建一个对象,对外提供一个获取方法.)饿汉式.
	*
	*
	*/
	public static void main(String[] args) throws IOException {
		Runtime rt = Runtime.getRuntime();	//获取单列类对象.
			//	rt.exec("shutdown -s -t 600");	//表示执行字符串关机命令.运行后,计算机将在10分钟后关闭.
			rt.exec("shutdown -a");//表示取消上面的关闭命令,(注意单列类,只能创建一个对象,每次只能有一个对象执行命令)
	}

}
