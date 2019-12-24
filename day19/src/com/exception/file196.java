package com.exception;

import java.io.File;

public class file196 {
	/*###19.14_File类(File类的概述和构造方法)
	* A:File类的概述------文件的意思.当作一个类,就是可以找到文件的路径.通过new对象,在参数中传入要找的文件名.
		* File更应该叫做一个路径
			* 文件路径或者文件夹路径  
			* 路径分为绝对路径和相对路径
			* 绝对路径是一个固定的路径,从盘符开始
			* 相对路径相对于某个位置,在eclipse下是指当前项目下,在dos下
		* 查看API指的是当前路径
		* 文件和目录路径名的抽象表示形式
	* B:构造方法
		* File(String pathname)：根据一个路径得到File对象
		* File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
		* File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对象
	* C:案例演示*/
	public static void main(String[] args) {
//绝对路径.
		File f = new File("F:\\xiaohai");		//表示新键一个路径对象,参数里表示要找的文件,F:代表绝对路径,\\转义的意思
			System.out.println(f.exists());	//f.exists(),表示判断文件是否存在.输出结果是:true,表示文件存在.

//当前路径.
		File f2 = new File("xxx.txt");	//直接输入文件名称,表示是当前路径.就是day19项目,这是为了演示新键的文件
		System.out.println(f2.exists());	//输出结果true.

//父类目录和子类文件
		String parent = "F:\\xiaohai";		//表示父类目录.
		String child = "10_package包";		//表示子类文件名.
		File f3 = new File(parent,child);
			System.out.println(f3.exists());	//输出.true

//可以把父类封装成file对象,使用file的功能.
		File parent2 = new File( "F:\\xiaohai"); 
		String child2 = "10_package包";	
		File f4 = new File(parent2,child2);
		System.out.println(f4.exists());
		System.out.println(parent2.exists()); //能使用File的功能.
	}

}
