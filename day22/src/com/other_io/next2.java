package com.other_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class next2 {
/*##22.11_IO流(两种方式实现键盘录入)(了解)
* A:BufferedReader的readLine方法。
	* BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
* B:Scanner*/
	
	public static void main(String[] args) throws IOException {
		demo();		//两个都是键盘录入,都是4行代码.demo()只能录入字符.而demo2()功能更加强大,能录入更多类型.
		demo2();
	}

public static void demo2() {
	Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		System.out.println(line);
		sc.close();
}

public static void demo() throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));/*创建一个带缓冲区的字符输入
	流.在参数中传入桥梁(字节转字符的桥梁,在桥梁参数中传入(标准键盘输入流))把标准键盘录入转换成字符输入流*/
			String s = br.readLine();	//上面已经创建了一个字符录入流.上面录入后就可以整行读取了.
			System.out.println(s);		//把读出结果输出.
			br.close();					//关流.
}
	

}
