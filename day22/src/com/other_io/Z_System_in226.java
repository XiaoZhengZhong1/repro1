package com.other_io;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class Z_System_in226 {
/*###22.10_IO流(标准输入输出流概述和输出语句)
* 1.什么是标准输入输出流(掌握)
	* System.in是InputStream, 标准输入流, 默认可以从键盘输入读取字节数据
	* System.out是PrintStream, 标准输出流, 默认可以向Console中输出字符和字节数据
	* in是System类中的static静态字段,是标准输入流.类名点调用返回的是InputStream类型对象.
	* System.out.println()也是一个标准的输出流.类名点字段就是一个标准输出流,再调用打印方法.都是它没有关联硬盘中的任何文件,所以不用关
	* */
	public static void main(String[] args) throws IOException {
			
/*2.修改标准输入输出流(了解)要知道流是可以控制的,可以在控制台录入输出.也可以设置下文件中读入和写出.
* 修改输入流: System.setIn(InputStream)
* 修改输出流: System.setOut(PrintStream)
* 	*/
		System.setIn(new FileInputStream("b.txt"));	//改变标准输入流.
		System.setOut(new PrintStream("a.txt"));	//改变标准输出流.
				InputStream is = System.in;			//获取默认指向键盘的标准键盘输入流,让其指向文件b.txt
				PrintStream ps  = System.out;		//获取默认指向控制台的标准输出流.让其指向文件b2.txt
				int i;
				while((i = is.read()) != -1){
					ps.write(i);
				}
				is.close();
				ps.close();
	}
	//demo();什么是标准输入流(掌握)
public static void demo() throws IOException {
	InputStream is = System.in;		//获取标准输入流.默认指向键盘.
	int i = is.read();			//读这个输入流.
	System.out.println(i);    //输出读到的结果.---运行后控制台会出现键盘录入格式.录入0回车显示48,录入1回车显示49.
}

}
