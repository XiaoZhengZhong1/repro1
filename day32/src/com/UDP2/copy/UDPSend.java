package com.UDP2.copy;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;
//Ҫ��,�ü���¼��,ʵ��UDP���Ͷ�
	public class UDPSend {
			public static void main(String[] args) throws IOException {
				Scanner sc = new Scanner(System.in);
				DatagramSocket ds = new DatagramSocket();//������ͷnewһ�μ���
				InetAddress inet = InetAddress.getByName("127.0.0.1");//IP�ط�װһ�μ���
				while(true){//��ʾѭ��¼�뷢����Ϣ.
				String message = sc.nextLine();//message����Ϣ����˼
				byte[] data = message.getBytes();
				DatagramPacket dp = new DatagramPacket(data, data.length, inet, 50001);
					ds.send(dp);
					ds.close();
					sc.close();
				}
					//
		}
	}
