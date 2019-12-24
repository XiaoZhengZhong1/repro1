package com.socket_Sever;

import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStream;
import java.io.InputStreamReader;
//import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class D04_Z_Server {
	/*2.服务端
	* 创建ServerSocket(需要指定端口号),监听端口号(必须先开启服务器监听端口号,才能收到客户端数据)
	* 调用ServerSocket的accept()方法接收一个客户端请求，得到一个Socket
	* 调用Socket的getInputStream()和getOutputStream()方法获取和客户端相连的IO流
	* 输入流可以读取客户端输出流写出的数据
	* 输出流可以写出数据到客户端的输入流*/
	public static void main(String[] args) throws IOException {
	//	demo();//因为服务器必须是多线程的才合理.因为服务器需要接收多个客户端的请求.所有要优化
		
			ServerSocket ss = new ServerSocket(62346); //监听端口号(必须先开启服务器监听端口号,才能收到客户端数据)
			while(true){	//表示把服务器接收请求进行无限循环.
			final Socket sk = ss.accept();	
				new Thread(){	//表示只要有请求就开启一个线程.
					public void run(){
						BufferedReader br;
						try {
							br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
							PrintStream ps = new PrintStream(sk.getOutputStream());
							System.out.println(br.readLine());  
								ps.println("本服务器以收到请求.请发送增加内容");  
						} catch (IOException e) {
							System.out.println(e);
							throw new RuntimeException("io流异常");
						}
						
					}
				}.start();
				ss.close();
			}
		  		
			
	
	}
	
	public static void demo() throws IOException {
		ServerSocket ss = new ServerSocket(12345); //创建服务器.指定服务器端口号.(必须和服务器访问的端口号一致.)
			Socket sk = ss.accept();	// 表示接收客户端通过通信插座ip和端口号12345发出的请求,得到一个通信插座.
			 /*  InputStream is2 = sk.getInputStream();	//调用插座类的获取输入流方法.
			   OutputStream os2 = sk.getOutputStream();	//调用插座类的获取输出流方法.
			   os2.write("本服务器以收到请求.请发送增加内容".getBytes());
			   byte[] arr2 = new byte[1024];		//创建一个字节数组,接收客户端发来的请求.
			   		int	len2 = is2.read(arr2);	//表示把客户端通过通信插座ip和端口号发来的请求,读到字节数组中.返回读取的个数
			   		System.out.println(new String(arr2,0,len2));  //表示把字节数组转换成
*/			   		
//优化上面6行代码.
			 BufferedReader  br = new BufferedReader(new InputStreamReader(sk.getInputStream()));//把字节流包装成字符流
			  PrintStream ps = new PrintStream(sk.getOutputStream()); //PrintStream有写出换行的方法
					System.out.println(br.readLine());  //表示整行打印接收到的客户端数据
						ps.println("本服务器以收到请求.请发送增加内容");  //表示回复客户端
			  
			  			sk.close();	//关闭接收到的客户端插座通信流
			   		ss.close();//本来服务器是不用关的.服务端编译报错显示本机无法链接本机.运行不了
	}

}
