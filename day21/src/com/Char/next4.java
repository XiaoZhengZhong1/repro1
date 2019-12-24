package com.Char;

import java.io.File;
import java.util.Scanner;

public class next4 {
	/*###21.17_File类(练习)
	* 需求:从键盘输入接收一个文件夹路径,打印出该文件夹下所有的.java文件名
	* 1:写一个接收文件路径的方法.创建键盘录入Scanner,提示输入文件夹名称.
	* 2:while(true)无限循环,{存储录入对象,创建一个文件夹路径new File(录入对象)把录入对象封装成文件夹.}
	* 3:在循环里面做if判断,!exists()如果文件不存在就提示. File(是文件名)就提示输入文件夹.既存在又不是文件,肯定是文件夹,返回录入本身
	* 上面3步做的是接收文件夹.下面做打印文件夹方法.
	* 4:写一个打印方法.打印文件夹中所有的.java文件.只打印无需返回值,方法名printjavaname,参数就是上面接收的文件夹.
	* 5:创建一个File[]数组.File类中有listFlies(文件夹)方法.返回的是一个file数组.
	* 6:遍历数组.
	* 7:中遍历中做if判断,如果遍历的元素是文件名并且后缀是.java就输出.如果元素是文件夹,就递归在语句体中打印方法.(就是遍历文件夹的意思)
	* 
	* */
	public static void main(String[] args) {
	     File f = getDir();
		printjava(f);
	}
	
	public static File getDir(){	//Dri是Directory文件夹的缩写.
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入文件夹路径");
		while(true){
			String s = sc.nextLine();
			File f = new File(s);
			if(!f.exists()){
				System.out.println("您输入的文件路径不存在,请重新输入文件夹路径");
			}else if(f.isFile()){
				System.out.println("您输入的是文件路径.请重新输入文件夹路径");
				}else{
				return f;
				}	
			sc.close();	//注意键盘录入关闭后,只能录入一次.
		}
	}
	public static void printjava(File f){
		File[] fi = f.listFiles();	//把文件夹转换成文件数组.File类中有把文件表转换成数组的方法,
			for (File e : fi) {
				if(e.isFile() && e.getName().endsWith(".java")){	//如果元素是文件,并且文件名称是以.java结尾的
					System.out.println(e);
				}else if(e.isDirectory()){	//表示如果元素是文件夹.
				printjava(e);	//递归遍历文件夹元素.
				}
			}
	
	
	
	}
	
	
	}





