package com.other_io;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Z_ByteArrayOutputStream222 {
/*###22.03_IO流(内存输出流*****)(掌握)
* 1.什么是内存输出流
	* 该输出流可以向内存中写数据, 把内存当作一个缓冲区, 写出之后可以一次性获取出所有数据
* 2.使用方式
	* 创建对象: new ByteArrayOutputStream()
	* 写出数据: write(int),
	* 获取数据: toByteArray()返回一个byte[] arr. 把数组转换成字符串new String(arr)直接输出这个匿名字符串.*/
	public static void main(String[] args) throws IOException {
		demo();
	}

public static void demo() throws FileNotFoundException, IOException {
	FileInputStream fis = new FileInputStream("a.txt");
	ByteArrayOutputStream baos = new ByteArrayOutputStream();//此行创建的是一个流内存缓冲区大小可变.没有关联文件,不关流.
		int i;
		while((i = fis.read()) != -1){
			baos.write(i);
		}
		
		fis.close();
		System.out.println(baos);  /*此行相当于是baos.toString(),把输出数组转换成字符串.因为ByteArrayOutputString
		类中重写了toString方法.输出时不写toString系统会默认加上.*/
//还有一种方法就是用baos.toByteArray();方法返回的是一个byte[] arr;再把数组转换成字符串输出.new String(arr);
}

}
