package com.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*###05UDP协议
   A:UDP协议
     a:UDP协议概述:
      UDP是无连接通信协议，即在数据传输时，数据的发送端和接收端不建立逻辑连接。
      简单来说，当一台计算机向另外一台计算机发送数据时，发送端不会确认接收端是否存在，就会发出数据，同样接收端在收到数据时，也不会向发送端反馈是否收到数据。
     b:UDP协议特点:
      由于使用UDP协议消耗资源小，通信效率高，所以通常都会用于音频、视频和普通数据的传输例如视频会议都使用UDP协议，
      因为这种情况即使偶尔丢失一两个数据包，也不会对接收结果产生太大影响。


###06TCP协议
  *A:TCP协议
    TCP协议是面向连接的通信协议，即在传输数据前先在发送端和接收端建立逻辑连接，然后再传输数据，它提供了两台计算机之间可靠无差错的数据传输。
    在TCP连接中必须要明确客户端与服务器端，
      由客户端向服务端发出连接请求，每次连接的创建都需要经过“三次握手”。
      第一次握手，客户端向服务器端发出连接请求，等待服务器确认
      第二次握手，服务器端向客户端回送一个响应，通知客户端收到了连接请求
      第三次握手，客户端再次向服务器端发送确认信息，确认连接

========================================第二节课=========================================
###07数据包和发送对象介绍
  *A:数据包和发送对象介绍:
    DatagramPacket数据包的作用就如同是“集装箱”，
       可以将发送端或者接收端的数据封装起来。然而运输货物只有“集装箱”是不够的，还需要有码头。
       在程序中需要实现通信只有DatagramPacket数据包也同样不行，为此JDK中提供的一个DatagramSocket类。
       DatagramSocket类的作用就类似于码头，使用这个类的实例对象就可以发送和接收DatagramPacket数据包
    DatagramPacket:封装数据
    DatagramSocket:发送DatagramPacket

###08UDP发送端
   *A:UDP发送端
	     /*
        *  实现UDP协议的发送端:
        *    实现封装数据的类 java.net.DatagramPacket  将你的数据包装
        *    实现数据传输的类 java.net.DatagramSocket  将数据包发出去
        *    
        *  实现步骤:
        *    1. 创建DatagramPacket对象,封装数据, 接收的地址和端口
        *    2. 创建DatagramSocket
        *    3. 调用DatagramSocket类方法send,发送数据包
        *    4. 关闭资源*/
	public class UDPSend {
		/*用DatagramPacket类的构造方法
		 *  DatagramPacket(byte[] buf, int length, InetAddress address, int port) 
		 *  构造数据报包，用来将长度为 length 的包发送到指定主机上的指定端口号。*/
		public static void main(String[] args) throws IOException {
			
		//封装数据
		byte[] data = "你好UDP".getBytes();//表示把要发送的,字符串,包装成字节数组.
		//创建InetAdderss对象,封装ip地址
		InetAddress inet = InetAddress.getByName("127.0.0.1");
		DatagramPacket dp = new DatagramPacket(data, data.length, inet, 5000);//参数有,数据包,包长度,ip,端口号
		DatagramSocket ds = new DatagramSocket();//创建发送对象
			ds.send(dp);//调用发送方法
			ds.close();//关流
	//写完标准UPD发送代码,可以直接发送.因为UDP协议是面向无连接的,所以可以发送不会报错.因为没有接收端,所以数据会丢失
		}
	}
