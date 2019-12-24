package com.socket_Sever;

public class D02 {/*
	###26.05_网络编程(Socket通信原理图解)(了解)
	* A:Socket套接字概述：
		* 网络上具有唯一标识的IP地址和端口号组合在一起才能构成唯一能识别的标识符套接字。
		* 通信的两端都有Socket。
		* 网络通信其实就是Socket间的通信。
		* 数据在两个Socket间通过IO流传输。
		* Socket在应用程序中创建，通过一种绑定机制与驱动程序建立关系，告诉自己所对应的IP和port。

	###26.06_网络编程(UDP传输)(了解)
	* 1.发送Send
		* 创建DatagramSocket, 随机端口号
		* 创建DatagramPacket, 指定数据, 长度, 地址, 端口
		* 使用DatagramSocket发送DatagramPacket
		* 关闭DatagramSocket
	* 2.接收Receive
		* 创建DatagramSocket, 指定端口号
		* 创建DatagramPacket, 指定数组, 长度
		* 使用DatagramSocket接收DatagramPacket
		* 关闭DatagramSocket
		* 从DatagramPacket中获取数据
	* 3.接收方获取ip和端口号
		* String ip = packet.getAddress().getHostAddress();
		* int port = packet.getPort();

	public static void main(String[] args) {

	}

*/}
