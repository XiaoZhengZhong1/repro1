package com_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class next3 {
/*###20.18_IO流(录入数据拷贝到文件)
* 将键盘录入的数据拷贝到当前项目下的text.txt文件中,键盘录入数据当遇到quit时就退出*/
	public static void main(String[] args) throws IOException {
		demo();
	}

	public static void demo() throws FileNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数据:");
		FileOutputStream fos = new FileOutputStream("nnn.txt");	//因为是键盘录入,不用再创建输入流.
		while(true){
			String s = sc.nextLine();
			if("quit".equals(s)){
				break;
			}
			fos.write(s.getBytes());//表示把录入的字符串转成字节数组,String类里面有getBytes()方法.将字符串转换为字节数组
			fos.write("\r\n".getBytes());	//表示写出一个换行,上面每循环写出一个字节,就写出一个换行.
		}
		sc.close();
		fos.close();
	}

}
