package com.other_io;

import java.io.PrintStream;

import com.person.person;

public class Z_System_out_225 {
/*###22.09_IO流(打印流的概述和特点)(掌握)
* 1.什么是打印流----PrintStream是一个类是实现io流的类,是一个打印流的类
	*该流可以很方便的将对象的toString()结果输出, 并且自动加上换行, 而且可以使用自动刷出的模式
	* System.out方法返回就是一个PrintStream(打印流), 其默认向控制台输出信息
	* PrintStream 打印的所有字符都使用平台的默认字符编码转换为字节。在需要写入字符而不是写入字节的情况下，应该使用 PrintWriter 类。 */
	public static void main(String[] args) {
		System.out.println("a");	//这是我们熟悉的打印输出方式.
		//演示其它输出打印方式.
		PrintStream ps = System.out;	/*获取标准输出流.API显示out是System类中的static字段,只能类名点调用.就是
		System.out, out字段是标准输出流的意思,调用字段返回的是PrintStream类型的值.*/
			ps.println(97);	//Run=97 相当于把97当作字符串输出.因为底层(原代码)用Integer.toString()把97转换成字符串了.
			ps.write(97);;	//Run= a 底层调用了编码表,查到写入的97对应是a
			
			person p1 = new person("xialei",2);
			ps.println(p1);	/*Run=person [name=xialei, age=2] 说明用打印流打印引用数据类型.如果对象不是null就调用
			对象中的toString方法.*/
			person p2 = null;
			ps.println(p2);	//Run=null 说明如果对象赋值位null.就输出null.
			ps.close();		
	}
/*2.使用方式
* 打印: print(), println()
* 自动刷出: PrintWriter(OutputStream out, boolean autoFlush, String encoding) 
* 打印流只操作数据目的*/
}
