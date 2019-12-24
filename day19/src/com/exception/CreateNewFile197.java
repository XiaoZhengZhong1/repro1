package com.exception;

import java.io.File;
import java.io.IOException;

public class CreateNewFile197 {
	/*###19.15_File类(File类的创建功能)
	* A:创建功能
		* public boolean createNewFile():创建文件 如果存在这样的文件，就不创建了
		* public boolean mkdir():创建文件夹 如果存在这样的文件夹，就不创建了
		* public boolean mkdirs():创建文件夹,如果父文件夹不存在，会帮你创建出来
	* B:案例演示	创建文件和文件夹,返回的都是boolean类型.
		* File类的创建功能*/ 
//创建文件,
	public static void main(String[] args) throws IOException {
			File f = new File("ccc.txt");		//表示传了一个文件名参数.
			f.createNewFile();	//表示根据f里面的文件名,创建一个新文件夹,(会有异常出现,Ctrl + 1抛出异常,到方法声明上)
	System.out.println(f.createNewFile());	//输出看看文件是否创建成功,因为在当前路径创建的,生成也是在当前路径,f5刷新.
	//文件创建成功,就不再创建,返回false.
	
//创建文件夹mkdir,创建多个文件夹mkdirs.
			File f2 = new File("aaa");		//表示传入一个文件夹,文件夹一般都是没有后缀的,加后缀也可以. 
			System.out.println(f2.mkdir());  //表示把f2中的内容创建一个文件夹,输出是否创建成功,默认当前路径.
			
			File f3 = new File("bbb\\ddd");	//表示传入两个文件夹.\\转义表示两个.
			System.out.println(f3.mkdirs());//表示把f3中的内容创建多个文件夹.
	}

}
