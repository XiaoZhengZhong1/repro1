package com.regex;

public class demo145_split {

	public static void main(String[] args) {
/*###14.05_常见对象(正则表达式的分割功能)
* A:正则表达式的分割功能
	* String类的功能：public String[] split(String regex)
* B:案例演示
	* 正则表达式的分割功能

*/
//split:是分开,切开的意思.是String类中的切割正则表达式的方法.String.split(regex)	
//要切开一个字符串,要用数组遍历.字符串切开还是字符串.返回的也是字符串数组.	
	String a = "aaa bbb ccc ddd";		//如果是用.隔开,下面切就要用\\.了表示转义regex里的.
	String[] b = a.split(" ");	//表示从空格开始切开,因为上面是用空格隔开.
	for (int i = 0; i < b.length; i++) {
		System.out.print(b[i]);
	}
	
	}

}
