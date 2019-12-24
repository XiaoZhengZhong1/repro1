package com.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*###14TCP的服务器程序accept方法
   A:TCP的服务器程序accept方法
     /*
      *  实现TCP服务器程序
      *  表示服务器程序的类 java.net.ServerSocket
      *  构造方法:
      *    ServerSocket(int port) 传递端口号
      *  
      *  很重要的事情: 必须要获得客户端的套接字对象Socket
      *    Socket  accept()*/
	public class serversocket {
		public static void main(String[] args) throws IOException {
			//1:创建服务器对象,传入端口号(端口号必须和客户端一致),监听端口号(必须先开启服务器监听端口号,才能收到客户端数据)
			ServerSocket sst = new ServerSocket(60000);
			//2:调用服务器类中的接收方法,接收客户端发送的套接字,返回客户端类对象.
			Socket st = sst.accept();
			System.out.println(st);			
			//3:用客户端对象调用获取输入流方法,获取输入流对象.
			InputStream in = st.getInputStream();
			//4:创建字节数组,用来当作接收客户端数据的容器.	
			byte[] data = new byte[1024];
			//5:读取流中数据,返回读取长度.
			int length = in.read(data);
			//6:输出打印读取的数组,长度是数组的0索引到最大长度,并把内容转成字符串.
			System.out.println(new String(data,0,length));
			//7:用接收的客户端对象,调用获取输出流方法,返回一个输出流对象.
			OutputStream out = st.getOutputStream();
			//8:用输出对象,向客户端发送消息,把信息转换成字节数组,再发出.
			out.write("客户你好".getBytes());
			//9:关流	
				sst.close();
				st.close();
		}
		
}
