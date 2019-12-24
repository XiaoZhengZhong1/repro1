package com.demo.string;

public class demo4_string {

	public static void main(String[] args) {
//1:String的替换功能,格式:String 变量名 = 变量名.replace(char '旧的',char '新的')		单个字符替换.
	/*	String a = "helloWord";
		String a1 = a.replace('e', 'h');	//单个字符替换.
				System.out.println(a1);*/
//:String的替换功能,格式:String 变量名 = 变量名.replace(String "旧的",String "新的")		多个字符,字符串的替换.
		/*String b = "helloWord";
		String b1 = b.replace("hell", "abcd");	//多个字符,字符串的替换.
			System.out.println(b1);*/

		//2:String去除空格方法,trim(); 
	String c = "  helloword    ";
	String c1 = c.trim();	//能去除前后的空格,开发中用于去除输入密码之类的,不易发现的空格.
	System.out.println(c1);//能去除前后的空格,开发中用于去除输入密码之类的,不易发现的空格.c.trim()
	

	}

}
