package com.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
/*###12TCP的客户端和服务器
   *A:TCP的客户端和服务器
     TCP通信同UDP通信一样，都能实现两台计算机之间的通信，通信的两端都需要创建socket对象。
      区别在于，UDP中只有发送端和接收端，不区分客户端与服务器端，计算机之间可以任意地发送数据。
      而TCP通信是严格区分客户端与服务器端的，在通信时，必须先由客户端去连接服务器端才能实现通信，
      服务器端不可以主动连接客户端，并且服务器端程序需要事先启动，等待客户端的连接。
      在JDK中提供了两个类用于实现TCP程序，一个是ServerSocket类，用于表示服务器端，一个是Socket类，用于表示客户端。
      通信时，首先创建代表服务器端的ServerSocket对象，该对象相当于开启一个服务，并等待客户端的连接，
	  然后创建代表客户端的Socket对象向服务器端发出连接请求，服务器端响应请求，两者建立连接开始通信。*/
	
	/*实现TCP客户端,连接到服务器
	    *  和服务器实现数据交换
	    *  实现TCP客户端程序的类 java.net.Socket实现TCP客户端,连接到服务器
	    *  和服务器实现数据交换
	    *  实现TCP客户端程序的类 java.net.Socket*/
	public class socketDemo{
		public static void main(String[] args) throws IOException {
		//1:创建客户端对象,传入pi和端口号,连接服务器.
		Socket st = new Socket("127.0.0.1", 60000);
		//2:调用对象中的,字节输出流方法,获取输出对象.
		OutputStream out = st.getOutputStream();
		//3:用输出对象,向服务器写出数据.
		out.write("你好服务器".getBytes());
		//4:用客户端对象,获取输入流方法,用来读取服务器返回数据
		InputStream in = st.getInputStream();	;
		//5:创建一个数组,用来接收服务器返回数据
		byte[] data = new byte[1024];
		//6:用获取的输入流对象,读取流中的数据,读到数组中.返回读取的长度.
		int len = in.read(data);
		//7:输出读取的数组数据,长度是0索引到数组的全部长度
		System.out.println(new String(data,0,len));
		//8:关流
		st.close();
		
		}
}
