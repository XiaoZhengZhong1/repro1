package com.other_io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class next5 {
/*###22.14_IO流(Properties的概述和作为Map集合的使用)(了解)
* A:Properties的概述----是Hashtable的子类.
	* Properties 类表示了一个持久的属性集。
	* Properties 可保存在流中或从流中加载。
	* 属性列表中每个键及其对应值都是一个字符串。 
* B:案例演示
	* Properties作为Map集合的使用
	
###22.15_IO流(Properties的特殊功能使用)(了解)
* A:Properties的特殊功能*/
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// Properties作为Map集合的使用
	Properties p = new Properties();
		p.put("aaa", 123);
	System.out.println(p);
	
/*###22.16_IO流(Properties的load()和store()功能)(了解)
* A:Properties的load(InputStream inStream)方法, 从输入流中读取属性列表（键和元素对）。 
和store(OutputStream out, String comments)以适合使用 load(InputStream) 方法加载到 Properties 表中的格式，
将此 Properties 表中的属性列表（键和元素对）写入输出 流.
* B:案例演示
	* Properties的load()和store()功能	*/
	Properties p2 = new Properties();
		p2.load(new FileInputStream("a5.txt"));	//表示把文件中的内容读到p2集合中.
		System.out.println(p2);		  //输出集合
		p2.setProperty("xiaolei", "3");//表示修改文件中的键的值.注意方法中要求键和值都是字符串类型.;可用于工作开发中修改配置文件
		System.out.println(p2);		   //表示输出结果修改过来了,但是配置文件a5.txt中内容没有修改过来.
		p2.store(new FileOutputStream("a5.txt"),"xxx");		//表示把修改后内容写入文件夹."xxx"是一个记录写入时间的变量
		//调用store方法后,文件内容也修改过来了
	
	}

	
}
