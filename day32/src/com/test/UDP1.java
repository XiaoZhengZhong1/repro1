package com.test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDP1 {

	public static void main(String[] args)throws IOException {
		byte[] data = "ÄãºÃ".getBytes();
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		DatagramPacket dp = new DatagramPacket(data, 0, data.length, ip, 30000);
		DatagramSocket ds = new DatagramSocket();
		ds.send(dp);
		ds.close();
	}

}
