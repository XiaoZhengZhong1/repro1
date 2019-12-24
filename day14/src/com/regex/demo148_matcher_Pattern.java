package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo148_matcher_Pattern {

	public static void main(String[] args) {
/*###14.09_常见对象(Pattern和Matcher的概述)
* A:Pattern和Matcher的概述
* B:模式和匹配器的典型调用顺序
	* 通过JDK提供的API，查看Pattern类的说明

java.util.regex //表示Pattern是正则表达式包下的类.
类 Pattern

* 典型的调用顺序是 
1:Pattern典型的意思是java.util.regex包下的一个类.
2:compile是编译的意思,是Pattern类中的方法. compile(String regex, int flags) 将给定的正则表达式编译到具有给定标志的模式中。
3:"a*b"正则表达式,表示a出现0次或者多次,还有个b.
4:Matcher匹配器,也是java.util.regex 包下的一个类,matcher(CharSequence input) 创建匹配给定输入与此模式的匹配器。
也是Pattern类中的方法.
5:*matches相配的意思.matcher(CharSequence input)编译给定正则表达式并尝试将给定输入与其匹配,是Pattern类中的方法.返回值是Matcher 
* 
* 
* 
* Pattern p = Pattern.compile("a*b");
* Matcher m = p.matcher("aaaaab");
* boolean b = m.matches();*/
//以下方法调用需要导包.Shift+Ctil+o		
	/*	  Pattern p = Pattern.compile("a*b");//表示类名调用编译方法,编译正则表达式,赋值给p.
		  Matcher m = p.matcher("aaaaab");	//p调用创建创建匹配器方法,匹配器中有字符串参数,把p和参数输入m匹配器中.
		  boolean b = m.matches();	//m调用匹配方法,匹配m中的p和字符串,返回一个boolea型的结果赋值给b
		  System.out.println(b);
	//上面那么费劲就是下面一行代码的意思用字符串匹配正则
		  System.out.println("aaaaab".matches("a*b"));
	*/
/*  B:案例演示
	* 需求：把一个字符串中的手机号码获取出来	
*/
	String a = "我的手机号码是13488888888,磊哥的手机号是15899999999,naoofjii18566666666";
	String regex = "1[3587]\\d{9}";				//意思是正则的值必须是1开头第二位是3587中的一个,后面是任意的数字数量是9个,
	 Pattern a1 = Pattern.compile(regex);		//获取正则
	 Matcher a2 = a1.matcher(a);				//获取编译器.
	/* 		a2.find();					匹配a字符串和正则regex,find找到的意思,是matcher类中的一个方法,
									就是拿正则到字符串中找自己子类,正则表达式regex是一个手机号,找它的子类肯定也是一个手机号.
	String a3 =	a2.group();				//表示返回匹配结果,group()是回匹配结果,也是mather类的一个方法.
	System.out.println(a3);	*/			//输出结果:13488888888,只找到了一个号码,因为上面只获取了一次正则和编译器.

//由于找一次只能获取一个号码,每次找的方法都一样.我们就用循环找,
	while(a2.find())	/*表示如果匹配找到正则子类了,就继续执行.因a1和a都已经在a2匹配器里了,find就是找a2中正则子类的
															注意如循环语句没有大括号,那么判断语句满足将执行最近的代码.*/
		System.out.print(a2.group()+",");//返回找到结果给a2,输出结果.group()返回结果的意思
	//13488888888,15899999999,18566666666,
	
	
	}

}
