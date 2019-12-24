package com.UDP2.copy;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;
//要求,用键盘录入,实现UDP发送端
	public class UDPSend {
			public static void main(String[] args) throws IOException {
				Scanner sc = new Scanner(System.in);
				DatagramSocket ds = new DatagramSocket();//发货码头new一次即可
				InetAddress inet = InetAddress.getByName("127.0.0.1");//IP地封装一次即可
				while(true){//表示循环录入发送消息.
				String message = sc.nextLine();//message是消息的意思
				byte[] data = message.getBytes();
				DatagramPacket dp = new DatagramPacket(data, data.length, inet, 50001);
					ds.send(dp);
					ds.close();
					sc.close();
				}
					//
		}
	}
