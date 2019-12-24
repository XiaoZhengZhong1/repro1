package com.regex;

public class demo147_fenzu {

	public static void main(String[] args) {
/*###14.08_常见对象(正则表达式的分组功能)
* A:正则表达式的分组功能
	* 捕获组可以通过从左到右计算其开括号来编号。例如，在表达式 ((A)(B(C))) 中，存在四个这样的组： 
* 
		1     ((A)(B(C))) 
		2     (A 
		3     (B(C)) 
		4     (C) 
	
		组零始终代表整个表达式。
B:案例演示
	a:切割
		需求：请按照叠词切割： "sdqqfgkkkhjppppkl";
b:替换
	需求：我我....我...我.要...要要...要学....学学..学.编..编编.编.程.程.程..程
	将字符串还原成:“我要学编程”。*/
//数小括号,有几个小括号,就有几个数组.数一边就行了.	
//单个分组重复一次.	
	String regex = "(.)\\1";	//.代表任何字符,\\1表示前面的字符又出现一次.
	System.out.println("aa".matches(regex));//表示用String匹配方法,"aa"匹配下上面的正则表达式        输出结果:true
//两个分组分别重复一次.	
	String regex1 = "(.)\\1(.)\\2";	//表示第1组重复1次,第2组重复1次
	System.out.println("aabb".matches(regex1));// 输出结果:true
//两个分组分别重复多次.	
	String regex2 = "(.)\\1+(.)\\2+";	//+号表示多次.第1组重复多次,第2组重复多次
	System.out.println("aaaaaaaabbbbbbbbbb".matches(regex2));// 输出结果:true
//单个分组两个任意字符重复一次.	
	String regex3 = "(..)\\1";	//表示两个任意字符,重复一次.
	System.out.println("abab".matches(regex3));	// 输出结果:true
//单个分组两个任意字符重复多次.		
	String regex4 = "(..)\\1+";	//表示两个任意字符,重复一次.
	System.out.println("ababababababab".matches(regex4));	// 输出结果:true
/*
B:案例演示
	a:切割
		需求：请按照叠词切割： "sdqqfgkkkhjppppkl";
*/
	String a = "sdqqfgkkkhjppppkl";
	String regex5 = "(.)\\1+";
	String[] a1 = a.split( regex5);
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}
/*
 * b:替换
	需求：我我....我...我.要...要要...要学....学学..学.编..编编.编.程.程.程..程
 * */	
//String regex7 = "(.)\\1+"	//表示单个重复多次的组1     $1是本我,就是重复的对象本身.用来做替换用
	String a2 = "我我....我...我.要...要要...要学....学学..学.编..编编.编.程.程.程..程";
	String regex6 = "\\.+";	//表示任意重复一次或者多次的单个字符
	String a3 = a2.replaceAll(regex6, "");//表示替换全部重复一次或者多次的单个字符,用空窜""替换
	System.out.println(a3);//我我我我要要要要学学学学编编编编程程程程
	String regex7 = "(.)\\1+"; //表示单组重复多次的单个字符.
	String a4 = a3.replaceAll(regex7, "$1");//表示替换全部单组重复多次的字符,用$1(本我),就是1数组本身,就是重复对象本身.
	System.out.println(a4);	//我要学编程
	
	
	}

}
