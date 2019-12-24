package com.UDP2.copy;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
//要求.不断的接收发送端的消息
public class UDPReceive {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket(50001);//端口号只能占用一次,所以不能循环
		byte[] data = new byte[1024];//接收的字节数组new一次就可以了,因为循环创建数组浪费资源.创建一个能装消息就行,因为收到消息
		while(true){																//马上就拆包了,又能重新接收
		DatagramPacket dp = new DatagramPacket(data, data.length);
		ds.receive(dp);
		int length = dp.getLength();
		String ip = dp.getAddress().getHostAddress();
		int port = dp.getPort();
		System.out.println(new String(data,0,length) + "..." + ip + "..." + port);
		ds.close(); 
		}


	
	}

}
