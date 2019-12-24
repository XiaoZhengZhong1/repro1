package com.test;

import java.io.File;

public class test02 {
	/*###23.02_File类递归练习(删除该文件夹)
	* 需求:2,从键盘接收一个文件夹路径,删除该文件夹
	* 1:第一步,键盘接收一个文件路径.上一个test01中有getDir()方法.可以调用.
	* 2:第二步,创建一个删除文件方法.(因为文件夹有文件是无法删除),删除了没有返回了,也不需要返回,参数是第一步获取的文件夹对象
	* 3:用文件夹对象调用listLise(),返回的是一个File[],因为要判断文件夹中是否包含文件,和文件夹.文件删除,
	* 4:循环结束后,再删除文件夹
	* */
	public static void main(String[] args) {
		File d = test01.getDir();	//test01.getDir()表示调用test01类中的getDir()方法.
		getDeleteFile(d);           //调用删除方法.
	}
	public static void getDeleteFile(File d){
		File[] f = d.listFiles();
			for (File fie : f) {
				if(fie.isFile()){	//表示如果是文件.
					fie.delete();	//就删除文件.
				}else{					
					getDeleteFile(fie);	//如果是文件夹就递归,继续上面的方法.删除文件.
				}
			}
			d.delete();
	
	}
	
}
