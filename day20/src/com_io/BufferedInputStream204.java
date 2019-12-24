package com_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputStream204 {
	public static void main(String[] args) throws IOException{
/*###20.11_IO流(BufferedInputStream和BufferOutputStream拷贝)
* A:缓冲思想
	* 字节流一次读写一个数组的速度明显比一次读写一个字节的速度快很多，
	* 这是加入了数组这样的缓冲区效果，java本身在设计的时候，
	* 也考虑到了这样的设计思想(装饰设计模式后面讲解)，所以提供了字节缓冲区流
* B.BufferedInputStream
	* BufferedInputStream内置了一个缓冲区(数组)
	* 从BufferedInputStream中读取一个字节时
	* BufferedInputStream会一次性从文件中读取8192个, 存在缓冲区中, 返回给程序一个
	* 程序再次读取时, 就不用找文件了, 直接从缓冲区中获取
	* 直到缓冲区中所有的都被使用过, 才重新从文件中读取8192个
* C.BufferedOutputStream
	* BufferedOutputStream也内置了一个缓冲区(数组)
	* 程序向流中写出字节时, 不会直接写到文件, 先写到缓冲区中
	* 直到缓冲区写满, BufferedOutputStream才会把缓冲区中的数据一次性写到文件里
* D.拷贝的代码 	*/

//Buffered缓冲区输入和输出,是对文件输入和输出流进行包装,包装到内存中,比在硬盘中读写速度快,效率高.	
	demo();
	}

	public static void demo() throws FileNotFoundException, IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("qqq.txt"));
		/*表示创建输入流缓冲区对象,Buffered缓冲区.缓冲区原代码里面有个数组,长度为8192个字节,和小数组[1024*8]长度一样.参数表示传入
		 匿名文件输入流对象,*/
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("cop2.qqq"));
		/*表示创建缓冲区输出流对象,输出缓冲区原代码也有数组长度为8192个字节.参数表示传入匿名输出流文件对象*/
		int len;	//定义变量接收读出字节.
		while((len = bis.read()) != -1){	//表示读出的缓冲区字节赋值给len,只有读出的不是-1,就循环.(缓冲区一次读取8192个字节)
			bos.write(len);	//表示把上面读出的字节写入缓冲区输出流对象cop2.qqq中.(一次写入8192个字节)
		}
		bis.close();	//关闭输入流,缓冲对象封装了文件输入流.关闭缓冲区和关闭输入流一样.
		bos.close();	//关闭输出流.
	}
}
//注意,BufferedInputStream(缓冲区拷贝)和new byte[1024*8](小数组拷贝),都实用于工作开发中.可以自行使用.
/* E.小数组的读写和带Buffered的读取哪个更快?
		* 定义小数组如果是8192个字节大小和Buffered比较的话
		* 定义小数组会略胜一筹,因为读和写操作的是同一个数组
		* 而Buffered操作的是两个数组*/



/*###20.12_IO流(flush和close方法的区别)
* flush()方法
	* 用来刷新缓冲区的,刷新后可以再次写出 ,放在循环中,可以一边写入一边刷新.不用等写满8192个字节在一起存入文件 .(有需求才考虑,刷新浪费时间)
* close()方法
	* 用来关闭流释放资源的的,如果是带缓冲区的流对象的close()方法,不但会关闭流,还会再关闭流之前刷新缓冲区,关闭后不能再写出 
*/



/*###20.13_IO流(字节流读写中文) 
* 字节流读取中文的问题
	* 字节流在读中文的时候有可能会读到半个中文,造成乱码 
* 字节流写出中文的问题
	* 字节流直接操作的字节,所以写出中文必须将字符串转换成字节数组 
	* 写出回车换行 write("\r\n".getBytes());*/

