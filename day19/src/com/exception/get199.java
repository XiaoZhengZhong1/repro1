package com.exception;

import java.io.File;

public class get199 {
	/*###19.18_File类(File类的获取功能)
	* A:获取功能
		* public String getAbsolutePath()：获取绝对路径
		* public String getPath():获取路径---获取构造方法中传入的路径,构造方法传入的是当前路径,获取的就是当前路径.
		* public String getName():获取名称
		* public long length():获取长度。字节数
		* public long lastModified():获取最后一次的修改时间，毫秒值
		* public String[] list():获取指定目录下的所有文件或者文件夹的名称数组-----仅获取名称.
		* public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组 -----获取对象.*/
	public static void main(String[] args) {
		File f = new File("e.txt");	//表示封装已有文件.
		System.out.println(f.getAbsolutePath());  //表示要获取文件绝对路径,输出:E:\workspacexiaohei\day19\e.txt
	}

}
