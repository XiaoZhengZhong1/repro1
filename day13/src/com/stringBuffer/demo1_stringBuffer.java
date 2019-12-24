package com.stringBuffer;

public class demo1_stringBuffer {

	public static void main(String[] args) {
/*
 	A:StringBuffer的构造方法：
	* public StringBuffer():无参构造方法
	* public StringBuffer(int capacity):指定容量的字符串缓冲区对象
	* public StringBuffer(String str):指定字符串内容的字符串缓冲区对象
* B:StringBuffer的方法：
	* public int capacity()：返回当前容量。	理论值(不掌握)
	* public int length():返回长度（字符数）。 实际值
* C:案例演示
	* 构造方法和长度方法的使用
*/
		System.out.println(new StringBuffer().length());//StringBuffer():无参构造方法,表示新键一个无参构造.
														//输出length()容器字符个数,输出结果为0
		System.out.println(new StringBuffer().capacity());//capacity()容器初始容量长度,输出结果16										
	
		System.out.println(new StringBuffer(10).length());	//输出结果0
		System.out.println(new StringBuffer(10).capacity());//输出结果10
	
		System.out.println(new StringBuffer("xzz").length());	//输出结果3 演示证明length()只记字符的个数.
		System.out.println(new StringBuffer("xzz").capacity());//输出结果19 演示证明capacity()有字符串,容量初始值会扩展
	
	}

}
