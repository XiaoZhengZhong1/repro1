package com.stringBuffer;

public class demo8_integet {

	public static void main(String[] args) {
/*
###13.19_常见对象(基本类型包装类的概述)
* A:为什么会有基本类型包装类
	* 将基本数据类型封装成对象的好处在于可以在对象中定义更多的功能方法操作该数据。
* B:常用操作
	* 常用的操作之一：用于基本数据类型与字符串之间的转换。
* C:基本类型和包装类的对应
* 
		byte 			Byte
		short			Short
		int				Integer
		long			Long
		float			Float
		double			Double
		char			Character
		boolean			Boolean*/
	System.out.println(Integer.MAX_VALUE);//类名.调用int数据类型最大取值范围的方法
	System.out.println(Integer.MIN_VALUE);//类名.调用int数据类型最小取值范围的方法
	
//int转换成string.方法1:用int +""连接.  方法2:用string.valueOf(int);调用值转换方法.这两种最常用.还有别的方法就不说了.
	int a = 100;
	String a1 = a + "";
	System.out.println(a1);
	
	String a2 = String.valueOf(a);
	System.out.println(a2);
	
	
/*string转换成int.用parse.如parseInt(),用类名调用就是int.parseInt();上面种数据类型,除了char类型之外,
其它7种基本数据类型,包装类,里面都有parse();方法.因为char是字符,只能存单个字符,其它类转换过来存不了.转char有toCharArray();	

*/	
//parse();方法.开发常用方法
	String b = "abc";
	int b1 = Integer.parseInt(b);	//调用int包装类Integer调用里面的parse()方法八字符串b转换成int,就是parseInt(b);
	System.out.println(b1);
	
	String b2 = "ture";
	boolean b3 = Boolean.parseBoolean(b2);	//将字符串转换成boolean型
	System.out.println(b3);
	}
	/*###13.20_常见对象(Integer类的概述和构造方法)
	* A:Integer类概述
		* 通过JDK提供的API，查看Integer类的说明

		* Integer 类在对象中包装了一个基本类型 int 的值,
		* 该类提供了多个方法，能在 int 类型和 String 类型之间互相转换，
		* 还提供了处理 int 类型时非常有用的其他一些常量和方法
	* B:构造方法
		* public Integer(int value)
		* public Integer(String s)
	* C:案例演示
		* 使用构造方法创建对象
*/
}
