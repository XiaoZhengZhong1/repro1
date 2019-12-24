package com.demo.string;

public class demo3_string {

//1:byte[] 数组名 = 变量.getBytes(); 		把字符串转换为字节数组(就是计算机存储的进制数字)
	public static void main(String[] args) {
/*		String a = "abc";
	byte[] arr = a.getBytes();
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] +",");*/
	
/*		String b = "你好";						//通过gbk码表将字符串转换成字节数字.编码,把我们看得懂的转换为计算机看的懂的
		byte[] arr1 = b.getBytes();				//gdk码表一个中文代表两个字节,并且第一个字节是负数
	for (int j = 0; j < arr1.length; j++) {
		System.out.println(arr1[j]);
	*/
	//}
	
		
		
	
	//}
	
	
//2:char[] 数组名 = 变量.toCharArray();		把字符串转换为字符数组
		/*String a = "helloWord";
			char[] arr2 = a.toCharArray();
	for (int i = 0; i < arr2.length; i++) {
		System.out.print(arr2[i] + ", ");
	}*/


//3:Static String valueOf(char[] arr);  把数组转换成字符串.是静态的String方法.
//格式:String 变量 = String.valueOf(char[] arr); 可以将任何类型的数据转换成字符串.
		char[] a1 = {'a','b','c'};
			String b1 = String.valueOf(a1); 
				System.out.println(b1);
			String a2 = String.valueOf(100);//将int类型的数字转换成字符串.
				System.out.println( a2 + 100);
	
	}

}
