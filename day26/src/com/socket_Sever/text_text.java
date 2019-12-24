package com.socket_Sever;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class text_text {
	/*###26.19_网络编程(练习)
	* 客户端向服务器写字符串(键盘录入),服务器(多线程)将字符串反转后写回,客户端再次读取到是反转后的字符串
	*InputStreamReader 是字节流通向字符流的桥梁
	*PrintStream 打印的所有字符都使用平台的默认字符编码转换为字节。在需要写入字符而不是写入字节的情况下，应该使用 PrintWriter 类。 

*/
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(12345);	//创建服务器,绑定端口号(必须和客户端端口号一致)
			while(true){
			final	Socket st2 = ss.accept();	//在无限循环中,表示不断接收客户端请求. 
				new Thread(){				//表示接收到一个请求就开启一条线程.
				public void run() {
					try {
						BufferedReader br2 = new BufferedReader(new InputStreamReader(st2.getInputStream()));
						PrintStream ps2 = new PrintStream(st2.getOutputStream());
						   String lin = br2.readLine();//表示整行读取接收的客户端请求.
						   lin = new StringBuilder(lin).reverse().toString();/*表示把读取的字符串转成缓冲区类型
						   调用缓冲区类型反转方法,把字符串进行反转.反转后重新转换成String类型.也叫链式编程.*/
						   	ps2.println(lin);	//表示把接收到的字符串反转后又重新写出给客户端.
						   	st2.close();  //关闭通信插座.
						   	
					} catch (IOException e) {
						
						e.printStackTrace();
					}
				}
					
				}.start();
	
				ss.close();
			}
	}

}
