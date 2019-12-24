package com.test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDP2 {

	public static void main(String[] args)throws IOException {
		DatagramSocket ds = new DatagramSocket(30000);
		byte[] data = new byte[1024];
		DatagramPacket dp = new DatagramPacket(data, data.length);
		ds.receive(dp);
		int length = dp.getLength();
		String ip = dp.getAddress().getHostAddress();
		int port = dp.getPort();
		System.out.println(new String(data,0,length) + "   " + ip + "  " + port);
		ds.close();
	}

}
