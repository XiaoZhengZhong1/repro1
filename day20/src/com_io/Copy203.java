package com_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy203 {
	/*###20.06_IO流(拷贝图片)
	* FileInputStream读取
	* FileOutputStream写出*/
/*拷贝图片,先有一个文件内容图片,new一个输入流,把图片文件名传入参数中,方便读read文件.new一个输出流,传入一个新文件名,表示要write写
 *一个文件,定义一个int 变量,用来接收read读出的字节,while循环read读图片文件,在循环语句中输出流调用write写方法,把循环的变量
 *写入输出流中,循环结束关闭输入和输出流. */	
	public static void main(String[] args) throws IOException {
		demo1();
		demo2();

/*###20.09_IO流(定义小数组)
* write(byte[] b)
* write(byte[] b, int off, int len)写出有效的字节个数	
* IO流拷贝方法3:定义数组.
* qqq.txt = abc													*/	
	demo3();	
//下面提取的demo3方法中,只有读输入流,没有写输出流.重新定义一个出入流.
	
	
	
System.out.println("----------------------------------------------------");	
	demo3_3();	//此格式才是工作中开发常用的拷贝格式.数组长度一般自定义为[1024*8]就是8k,刚好1024是2的10次方.是1kb
	}
public static void demo3_3() throws FileNotFoundException, IOException {
		FileInputStream fis4 = new FileInputStream("qqq.txt");
		FileOutputStream fos4 = new FileOutputStream("cop.qqq");
			byte[] b3 = new byte[2];	/*创建一个长度length为2的字节数组,数组长度可以自定义工作中一般定义为[1024*8]*/
			int len;	
			while((len = fis4.read(b3)) != -1){	/*表示len的值等于fis4文件读取赋值到b3数组的值,b3的数组长度是2,所有读取的只能
			小于等于2,fis4文件中有abc3个字节,所有会循环两次,第一次读取2个.第二次读取一个.第三次文件没有字节了,就是-1*/
					fos4.write(b3, 0, len);	/*表示写入b3数组中,从0开始,写len个.第一次是2个,第二次是1个.避免直接写b3数组出现
					第二次循环时,最后读入一个c,覆盖第一次的0索引a,数组中就是cb,第一次循环是ab,最后拷贝的文件内容就是abcb*/
				}
			fis4.close();
			fos4.close();
System.out.println("--------------------------------------------------------");
}

	
	
	public static void demo3() throws FileNotFoundException, IOException {
		FileInputStream fis3 = new FileInputStream("qqq.txt");	//创建输入流.
			byte[] b2 = new byte[2];	//定义一个2个元素索引的数组.
			int i = fis3.read(b2);	//inputStreat类中有read()读数组方法.返回的是一个int数.表示把fis3文件里的内容读到b2数组
		System.out.println(i);		//输出 2.表示把fis3文件读了两个a和b到b2数组.
		for (byte c : b2) {			
			System.out.println(c);	//输出97 98	表示b2数组中有两个元素a和b.把a b转成字节码.
		}
		System.out.println("--------------------------");
		
		int b3 = fis3.read(b2);	//表示再读一次fis3文件,读到b2数组中.
		System.out.println(b3);	//输出 1 表示fis3中读了1个字节,c到b2数组中.表示读的是有效字节文件,文件是abc.第一次读了ab,
		for (byte c2 : b2) {	//再循环下b2数组.
			System.out.println(c2);	//输出  99 98.表示读到的c覆盖了原来的a.因为数组长度是不可变的,还是两个元素,
		}
		fis3.close();
	}
/*

###20.08_IO流(字节数组拷贝之available()方法)
* A:案例演示
	* int read(byte[] b):一次读取一个字节数组
	* write(byte[] b):一次写出一个字节数组
	* available()获取读的文件所有的字节个数
* 弊端:有可能会内存溢出 
*/
//IO流拷贝方法2:available()如果获取过大文件,比如电影之类的几G内存,会导致内存流出,也不推荐使用.	
	public static void demo2() throws FileNotFoundException, IOException {
		FileInputStream fis2 = new FileInputStream("ws.jpg");
		FileOutputStream fos2 = new FileOutputStream("copy2.jpg");
				fis2.available();	//available()是InputStream输入流类的方法,表示获取文件中所有字节个数.返回int
				byte[] arr = new byte[fis2.available()];	//表示创建一个和文件字节一样长度的字节数组.		
					fis2.read(arr);		//读这个数组.
					fos2.write(arr);	//写这个数组.
					fis2.close();
					fos2.close();
	}
/*
###20.07_IO流(拷贝音频文件画原理图)
* A:案例演示
	* 字节流一次读写一个字节复制音频
* 弊端:效率太低
*/
//IO流拷贝方式1:注意下面六行代码结束IO流的主要格式,和核心代码.(读一个写一个,文件都是上万字节,一一读写效率太低)不推荐使用该方法.
	public static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("ws.jpg");	//表示新键一个输入流,用来读图片.关联原图片一定要存在.
		FileOutputStream fos = new FileOutputStream("copy.jpg");	//创建一个输出流,用来写图片.关联拷贝图片.
				int b;		//定义一个变量,用来接收读出的每个字节.
				while((b = fis.read()) != -1){	//表示读出图片所有内容.直到=-1,代表结束.
					fos.write(b);	//表示把每个循环的字符写到输出流中.
				}
				fis.close();		//关闭输入流,释放资源
				fos.close();		//关闭输出流,释放资源.
	}

}
