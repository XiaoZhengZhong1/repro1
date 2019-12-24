package com_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class next2 {
/*###20.17_IO流(拷贝文件)
* 在控制台录入文件的路径,将文件拷贝到当前项目下
* 分析:1在录入的时候可能会出现,格式不对.或者录入的是文件夹,可以定义一个方法,从方法中获取文件.方法中做键盘录入,和判断排除格式错误问题.
* 2:在主方法中获取上面定义的方法中获取文件名.创建一个输入流.参数中传入获取文件名.输出流参数中传入该文件名名称.getname().
* 
* */
	public static void main(String[] args) throws IOException {
		demo();
	}
public static void demo() throws FileNotFoundException, IOException {
	File fi = getfile();
	BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fi)); 
	BufferedOutputStream bos= new BufferedOutputStream(new FileOutputStream(fi.getName()));
		int len;
		while((len = bis.read()) != -1){
			bos.write(len);
		}
		bis.close();
		bos.close();
}
	public static File getfile(){
		Scanner sc = new Scanner(System.in);
			System.out.println("请输入一个文件名");
			
			while(true){
				String f = sc.nextLine();
				File f2 = new File(f);
				if(!f2.exists()){
					System.out.println("您输入的不是一个文件名格式,请重新输入");
				if(f2.isDirectory()){
					System.out.println("您输入的是一个文件夹,请输入文件名.");
				}
				
				
				sc.close();
				}
				return f2;
			}
		
		
	}
}
