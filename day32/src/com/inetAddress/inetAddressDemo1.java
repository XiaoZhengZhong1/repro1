package com.inetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;
/*###01网络模型
  *A:网络模型
     TCP/IP协议中的四层分别是应用层、传输层、网络层和链路层，每层分别负责不同的通信功能，接下来针对这四层进行详细地讲解。
       链路层：链路层是用于定义物理传输通道，通常是对某些网络连接设备的驱动协议，例如针对光纤、网线提供的驱动。
       网络层：网络层是整个TCP/IP协议的核心，它主要用于将传输的数据进行分组，将分组数据发送到目标计算机或者网络。
       传输层：主要使网络程序进行通信，在进行网络通信时，可以采用TCP协议，也可以采用UDP协议。
       应用层：主要负责应用程序的协议，例如HTTP协议、FTP协议等。

###02IP地址
 *A:IP地址
      在TCP/IP协议中，这个标识号就是IP地址，它可以唯一标识一台计算机，
      目前，IP地址广泛使用的版本是IPv4，它是由4个字节大小的二进制数来表示，如：00001010000000000000000000000001。
      由于二进制形式表示的IP地址非常不便记忆和处理，因此通常会将IP地址写成十进制的形式，
      每个字节用一个十进制数字(0-255)表示，数字间用符号“.”分开，如 “192.168.1.100”
      127.0.0.1 为本地主机地址(本地回环地址)
###03端口号
 *A:端口号
    通过IP地址可以连接到指定计算机，但如果想访问目标计算机中的某个应用程序，还需要指定端口号。
    在计算机中，不同的应用程序是通过端口号区分的。
    端口号是用两个字节（16位的二进制数）表示的，它的取值范围是0~65535，
    其中，0~1023之间的端口号用于一些知*/



//java.net包下的类inetAddress 类中没有构造方法,可能私有了,所以不能new 此类表示互联网协议 (IP) 地址。


//学习本类java.net.InetAddress;掌握以下4个方法即可
// 类中有一静态方法. static InetAddress getLocalhost()方法表示返回本地主机.左边是返回值类型InetAddress对象
//另一个静态方法static InetAddress  getByName(String host)  在给定主机名的情况下确定主机的 IP 地址。

//类中还有非静态方法
//String getHostAddress()   返回 IP 地址字符串（以文本表现形式）。
//String getHostName() 	 获取此 IP 地址的主机名。

	public class inetAddressDemo1 {
		public static void main(String[] args) throws UnknownHostException {
		//demo();
		demo2();
		}
	
		//String getHostAddress() String getHostName()	
		public static void demo() throws UnknownHostException{
		 InetAddress inet = InetAddress.getLocalHost();//获取本地主机
		 String ip = inet.getHostAddress();//获取本地ip
		 String name = inet.getHostName();//获取本地主机名
		 System.out.println(ip + "  "  + name);
	
	}

	public static void demo2() throws UnknownHostException{
		InetAddress ip = InetAddress.getByName("192.168.43.189");//通过主机名称,获取主机ip
		System.out.println(ip);
		 
	}
	}
