  package com_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



public class io201 {
	/*###20.01_IO流(IO流概述及其分类)
	* 1.概念
		* IO流用来处理设备之间的数据传输
		* Java对数据的操作是通过流的方式
		* Java用于操作流的类都在IO包中
		* 流按流向分为两种：输入流，输出流。
		* 流按操作类型分为两种：
			* 字节流 : 字节流可以操作任何数据,因为在计算机中任何数据都是以字节的形式存储的
			* 字符流 : 字符流只能操作纯字符数据，比较方便。
	* 2.IO流常用父类
		* 字节流的抽象父类：
			* InputStream 
			* OutputStream
		* 字符流的抽象父类：
			* Reader 
			* Writer		
	* 3.IO程序书写
		* 使用前，导入IO包中的类
		* 使用时，进行IO异常处理
		* 使用后，释放资源
		* 
		* 
###20.02_IO流(FileInputStream)
* read()一次读取一个字  
		* */

	public static void main(String[] args) throws IOException  {
		demo1();
//下面方法已经被Alt + shift + m提取方法了,为	demo1();
	
//现在用whil循环,来优化下面的方法.因为到输出-1就证明读取结束,-1就可以作为表达添加.	
//以下循环优化格式才是以后经常用到的格式.
	FileInputStream fis2 = new FileInputStream("qqq.txt");
	int a;							//定义a,作为读取赋值对象.
	while((a = fis2.read()) != -1){	//注意此处技巧,可以把整个读取赋值的结果,当作一个参数,参入比较.表示结果不等于-1就输出
			System.out.println(a);	//97 98 99
				}
				fis2.close();	//关流释放资源.
	
	}

	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("qqq.txt");	/*创建输入流对象,传入的是流参数.也叫打开流.参数下面会出
		 qqq.txt内容	abc															异常,表示参数可能不存在的异常,Ctrl+1抛出*/
			int x = fis.read();		/*从硬盘上读取fis文件中的一个字节内容.read()读取字节内容.read()下面有报错,显示可能
			内容会无法读取,Ctil + 1抛出异常就可以. */
			
			System.out.println(x);		//97       输出读取的字节.
			int x2 = fis.read();		
			System.out.println(x2);		//98		
			int x3 = fis.read();		
			System.out.println(x3);		//99	证明异一次只能读取一个字节,对应的是码表值,
			int x4 = fis.read();		
			System.out.println(x4);		//-1
			int x5 = fis.read();		
			System.out.println(x5);		//-1	证明-1是结束,因为只有三个字符.
			
			
			fis.close();			//关流释放资源.
	}
	/*###20.03_IO流(read()方法返回值为什么是int)
	* read()方法读取的是一个字节,为什么返回是int,而不是byte
	* 
因为字节输入流可以操作任意类型的文件,比如图片音频等,这些文件底层都是以二进制形式的存储的,如果每次读取都返回byte,有可能在读到中间的时候遇到111111111
那么这11111111是byte类型的-1,我们的程序是遇到-1就会停止不读了,后面的数据就读不到了,所以在读取的时候用int类型接收,如果11111111会在其前面补上
24个0凑足4个字节,那么byte类型的-1就变成int类型的255了这样可以保证整个数据读完,而结束标记的-1就是int类型*/		
}
