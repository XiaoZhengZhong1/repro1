package com.socket_Sever;

import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStream;
import java.io.InputStreamReader;
//import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class D03_Z_socket {
/*###26.16_网络编程(TCP协议)(掌握)
* 1.客户端
	* Socket此类实现客户端套接字（也可以就叫“套接字”）。套接字是两台机器间通信的端点。 
	*创建Socket连接服务端(指定ip地址,端口号)通过ip地址找对应的服务器
	* 调用Socket的getInputStream()和getOutputStream()方法获取和服务端相连的IO流
	* 输入流可以读取服务端输出流写出的数据
	* 输出流可以写出数据到服务端的输入流
*InputStreamReader 是字节流通向字符流的桥梁
*PrintStream 打印的所有字符都使用平台的默认字符编码转换为字节。在需要写入字符而不是写入字节的情况下，应该使用 PrintWriter 类。 

*
*/
	public static void main(String[] args) throws UnknownHostException, IOException {
	  Socket skt = new Socket("127.0.0.1", 62346);//创建一个插座类(客户端与服务器链接的插座.)指定要连接的服务器ip和端口号
/* 
	  InputStream is = skt.getInputStream();	//调用插座类的输入流方法.返回一个字节输入流is(用来read读服务器输出的数据)
	  	OutputStream os = skt.getOutputStream();//调用插座类的输出流方法.返回一个字节输出流os(用来write写出,与服务器交流)
	  	
	 byte[] arr = new byte[1024];//表示创建一个1024个字节的字节数组,用来读取服务器返回的数据,(因为服务器也是把字符串.存入字节数组)
	  int len =	is.read(arr);//表示把通过skt插座类对象,接收的服务器返回的数据信息,读入字节数组中.
	  	System.out.println(new String(arr,0,len));//表示打印一个匿名字符串对象(把参数中的字节数组转换成字符串,从0索引转换len个)
	  	os.write("我客户端有新内容,需要增加".getBytes());表示向指定的ip 端口号写一个字符串,放到字节数组中."".getBytes()表示
		字符串类对象调用获取字节数组方法.把字符串内容存入字节数组中,返回一个新字节数组.因为我们获取的是字节输入流,当然要把字符串转成字节数组.
	  	*/
//优化上面6行代码.	 
	  BufferedReader  br = new BufferedReader(new InputStreamReader(skt.getInputStream()));//把字节流包装成字符流
	  PrintStream ps = new PrintStream(skt.getOutputStream()); //PrintStream有写出换行的方法
ps.println("我客户端有新内容,需要增加");//向服务器写出问题.以\r\n结束. 注意一定要是println PrintStream即可以写字节也能写字符
	  	System.out.println(br.readLine());   //表示整行读取服务器返回数据.以\r\n结束	注意读写都是以\r\n结束的
	  
	  skt.close();	//关闭链接,当客户端不需要再向服务器发出请求时,就关闭插座链接.输入输出流也会随着关闭.
	}
	//ConnectException如果拒绝远程主机对连接的远程方法调用，则抛出 ConnectException。	
}
