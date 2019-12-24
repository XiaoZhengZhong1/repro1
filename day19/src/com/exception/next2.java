package com.exception;

import java.io.File;

/*###19.19_File类(输出指定目录下指定后缀的文件名)
* A:案例演示
	* 需求：判断E盘目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称
*/
public class next2 {
	public static void main(String[] args){
		File f = new File("F:\\");	//封装E盘.注意要转义\\
		File[] f2 = f.listFiles();	//表示获取f,(E盘中)所有目录文件,文件夹.放到数组f2里面.
		
		for (File fi : f2) {
			if(fi.isFile() && fi.getName().endsWith(".jpg")){//意思是,如果fi是一个文件,并且fi的名字是以.jpg结尾的.
				System.out.println(fi);	//注意文件和文件夹的区别.因为没有以.jpg结束的文件,输出为空.
			}
		}
		
	}
}
