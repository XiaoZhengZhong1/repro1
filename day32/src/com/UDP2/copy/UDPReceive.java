package com.UDP2.copy;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
//Ҫ��.���ϵĽ��շ��Ͷ˵���Ϣ
public class UDPReceive {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket(50001);//�˿ں�ֻ��ռ��һ��,���Բ���ѭ��
		byte[] data = new byte[1024];//���յ��ֽ�����newһ�ξͿ�����,��Ϊѭ�����������˷���Դ.����һ����װ��Ϣ����,��Ϊ�յ���Ϣ
		while(true){																//���ϾͲ����,�������½���
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
