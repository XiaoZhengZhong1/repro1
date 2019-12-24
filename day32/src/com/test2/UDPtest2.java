package com.test2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPtest2 {

	public static void main(String[] args)throws IOException {
		byte[] data = new byte[1024];
		DatagramPacket dp = new DatagramPacket(data, data.length);
		DatagramSocket ds = new DatagramSocket(20000);
		ds.receive(dp);
		int len = dp.getLength();
		String ip = dp.getAddress().getHostAddress();
		int port = dp.getPort();
		System.out.println(new String(data,0,len)+"  "+ip+"  "+port);
		ds.close();
		}

}
