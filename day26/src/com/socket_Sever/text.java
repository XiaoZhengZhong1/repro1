package com.socket_Sever;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class text {
	/*###26.19_网络编程(练习)
	* 客户端向服务器写字符串(键盘录入),服务器(多线程)将字符串反转后写回,客户端再次读取到是反转后的字符串
	*InputStreamReader 是字节流通向字符流的桥梁
	*PrintStream 打印的所有字符都使用平台的默认字符编码转换为字节。在需要写入字符而不是写入字节的情况下，应该使用 PrintWriter 类。 

*/
	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner sc = new Scanner(System.in);//监听端口号(必须先开启服务器监听端口号,才能收到客户端数据)
		Socket sk = new Socket("127.0.0.1", 12345);	//创建服务端,指定ip和端口号.次行ConnectException如果拒绝远程主机对连接的远程方法调用，则抛出 ConnectException。 
		BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
		PrintStream ps = new PrintStream(sk.getOutputStream());	//PrintStream类构造参数可以传入输出流,返回一个打印流
		ps.println(sc.nextLine());	//表示把键盘录入的字符串.写出到服务器.(以\r\n结束)
				System.out.println(br.readLine());  //整行读取服务器写出数据
					sc.close();
					sk.close();
	}

}
