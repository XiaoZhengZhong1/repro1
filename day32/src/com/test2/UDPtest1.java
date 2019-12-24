package com.test2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPtest1 {

	public static void main(String[] args)throws IOException {
		byte[] data = "ÄãºÃ°¡".getBytes();
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		DatagramPacket dp = new DatagramPacket(data, data.length, ip, 20000);
		DatagramSocket ds = new DatagramSocket();
		ds.send(dp);
		ds.close();
	}

}
