/*
##10.01_面向对象(package关键字的概述及作用)(了解)
* A:为什么要有包
	* 将字节码(.class)进行分类存放 
	* 包其实就是文件夹
#10.02_面向对象(包的定义及注意事项)(掌握)
* A:定义包的格式
	* package 包名;
	* 多级包用.分开即可
* B:定义包的注意事项
	* A:package语句必须是程序的第一条可执行的代码
	* B:package语句在一个java文件中只能有一个
	* C:如果没有package，默认表示无包名
* C:案例演示
	* 包的定义及注意事项
*/
//包名都是倒着写的.比如 package com.ainmal; 动物包,  
 package com.ainmal;	//:package语句必须是程序的第一条可执行的代码
class ainmals{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
