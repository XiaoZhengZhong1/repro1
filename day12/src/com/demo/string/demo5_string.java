package com.demo.string;

public class demo5_string {
//获取字符串长度,格式:变量名.length  返回值是int类型
	public static void main(String[] args) {
		/*int[] a = {11,22,33,44,55,66,77,88}; 
			System.out.println(a.length);//获取字符串长度*/
//获取指定索引位置的字符:
//注意索引不一定都是指数组.
String b = "helloword,oknea";
//System.out.println(b.charAt(7));//获取指定索引位置的字符.格式: 变量名.charAt(索引);
//System.out.println(b.indexOf('o'));	//获取指定字符,在此字符串中的索引.格式: 变量名.indexOf(字符);
//System.out.println(b.indexOf("ow"));	//获取指定字符 串,在此字符串中的索引.格式: 变量名.indexOf(字符串);
//System.out.println(b.indexOf('o',5));	//获取指定字符,在此字符串中指定的索引位置开始.往后第一次在此字符串中出现的位置
										//格式: 变量名.indexOf(字符,索引);
//System.out.println(b.indexOf("ord",5));	//获取指定字符串,在此字符串中指定的索引位置开始.往后第一次在此字符串中出现的位置
											//格式: 变量名.indexOf(字符串,索引);
	
//System.out.println(b.substring(5));//从指定索引位置开始截取字符串,默认到结尾.格式: 变量名.substring(索引);
System.out.println(b.substring(5,8));//从指定索引位置开始截取字符串,到指定索引结束.格式: 变量名.substring(开始索引,结束索引);
	
//2:String去除空格方法,c.trim(); String的替换功能,c.replace(旧的, 新的)
	String c = "  helloword    ";
	System.out.println(c.trim());//能去除前后的空格,开发中用于去除输入密码之类的,不易发现的空格.c.trim()
	System.out.println(c.replace("he", "nu"));//String的替换功能,c.replace(旧的, 新的)
	}	
			
	
}	
	
	
	
	
	
	


