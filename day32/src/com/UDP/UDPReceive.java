package com.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceive {
/*###09UDP接收端
   *A:UDP接收端
       /*
        *  实现UDP接收端
        *    实现封装数据包 java.net.DatagramPacket 将数据接收
        *    实现输出传输     java.net.DatagramSocket 接收数据包
      
        *     */
	public static void main(String[] args) throws IOException {
		// 1. 创建DatagramSocket对象,绑定端口号, 要和发送端端口号一致
		DatagramSocket ds = new DatagramSocket(5000);
		// 2. 创建字节数组,接收发来的数据
		byte[] data = new byte[1024];
		//3. 创建数据包对象DatagramPacket,把字节数组封装到包中.因为接收端的读取方法,参数中需要数据包
		DatagramPacket dp = new DatagramPacket(data, data.length);
	//	4. 调用DatagramSocket对象方法,receive(DatagramPacket dp)接收数据,数据放在数据包中
		ds.receive(dp);//接收端的接收方法具有线程等待的功能,就是等待发送端发送.即线程阻塞效果
	//  5. 拆包 
	//获取接收到的字节个数, 数据包对象DatagramPacket方法 getLength()
		int length = dp.getLength();
	//获取发送端的IP地址,数据包对象DatagramPacket方法getAddress()获取的是发送端的IP地址对象, 返回值是InetAddress对象
		String ip = dp.getAddress().getHostAddress();//表示从获取的主机地址中获取ip
	//获取发送方的端口号,数据包对象DatagramPacket方法 getPort()发送端口	
	  int port = dp.getPort();
	//接收的包拆完了,打印下
	  System.out.println(new String(data,0,length) + "..." + ip + "..." + port);
	  				//表示把字节数组转换成字符串,长度是接收的数组中的0到总长.
	  //6. 关闭资源	
		ds.close();
	
	}

}
