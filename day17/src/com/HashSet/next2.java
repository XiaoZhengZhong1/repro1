package com.HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class next2 {
/*###17.07_集合框架(练习)
* 使用Scanner从键盘读取一行输入,去掉其中重复字符, 打印出不同的那些字符*/
	public static void main(String[] args) {
/*1:创建Scanner对象并导包.
 *2:去重复需要把字符串转换成字符数组,再进行遍历,再存储到HashSet集合中.
 *3:去掉重复,需要创建HashSet对象
 *4:打印除不同的字符,就是遍历集合,
  */
	Scanner sc = new Scanner(System.in);	
		System.out.println("请输入一个重复的字符串");
		HashSet<Character> hs = new HashSet<>();	//创建集合.
		String s = sc.nextLine(); 		//键盘录入字符串.
		char[] c = s.toCharArray();		//将字符串转换成字符数组.
		sc.close();						//结束键盘录入
	for (char d : c) {					//遍历字符数组.
		hs.add(d);						//d系统会自动封装成对象.
	}
	for (char d : hs) {					//d系统会自动封装成对象.
		System.out.println(d);			//遍历无重复集合元素
	}
	}
	
}
