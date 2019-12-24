package com.demo.string;

public class demo2_string_konggou {
//public String();	空构造的意思
//public String(byte[] b); 把字节数组转换成字符串
//public String(byte[] b1,int index,int length);  把字节数组的一部分转换成字符串.int index是从0索引开始的意思.int length是转换几个数组的意思.
//public String(char[] b2); 把字符数组转换成字符串,就是把单个的字符串,串联起来.
//public String(char[] b3,int index,int count);	也是表示,从那个索引开始,按顺序依次转换多少个.
//	
//	
//	
//	
//	
	public static void main(String[] args) {
		
		//String a = new String();
	//       System.out.println(a);	//输出空白,因为上面new的对象也是空构造
	
	    byte[] b = {97,98,99,100};
			 String c = new String(b);	//把字节数组转换成字符串
				System.out.println(c);	//输出的是abcd码表的对应值,叫解码,就是将计算机读得懂的,转换成阿我们读得懂的
	
		/*byte[] b1 = {97,98,99,100,101,102};
			String c1 = new String(b1,3,2);	//意思是从第3个索引开始,转换2个字符串
				System.out.println(c1);*/
	/*
		  char[] b2 = {'a','b','c','d'};
			//String c2 = new String(b2);	//将单个字符转换成一串字符.
				System.out.println(new String(b2));//直接输出匿名对象,也可以,和输出新键对象c2一样
	*/
		//char[] b3 = {'a','b','c','d','e','f'};
		//	String c3 = new String(b3,3,2);	//表示从第三个索引开始,依次转换2个
				//System.out.println(new String(b3,3,2));//直接输出匿名对象,也可以,和输出新键对象c3一样
	
		  

	
	
	
	
	}

}
