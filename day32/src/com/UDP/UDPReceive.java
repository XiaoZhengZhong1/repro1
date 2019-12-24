package com.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceive {
/*###09UDP���ն�
   *A:UDP���ն�
       /*
        *  ʵ��UDP���ն�
        *    ʵ�ַ�װ���ݰ� java.net.DatagramPacket �����ݽ���
        *    ʵ���������     java.net.DatagramSocket �������ݰ�
      
        *     */
	public static void main(String[] args) throws IOException {
		// 1. ����DatagramSocket����,�󶨶˿ں�, Ҫ�ͷ��Ͷ˶˿ں�һ��
		DatagramSocket ds = new DatagramSocket(5000);
		// 2. �����ֽ�����,���շ���������
		byte[] data = new byte[1024];
		//3. �������ݰ�����DatagramPacket,���ֽ������װ������.��Ϊ���ն˵Ķ�ȡ����,��������Ҫ���ݰ�
		DatagramPacket dp = new DatagramPacket(data, data.length);
	//	4. ����DatagramSocket���󷽷�,receive(DatagramPacket dp)��������,���ݷ������ݰ���
		ds.receive(dp);//���ն˵Ľ��շ��������̵߳ȴ��Ĺ���,���ǵȴ����Ͷ˷���.���߳�����Ч��
	//  5. ��� 
	//��ȡ���յ����ֽڸ���, ���ݰ�����DatagramPacket���� getLength()
		int length = dp.getLength();
	//��ȡ���Ͷ˵�IP��ַ,���ݰ�����DatagramPacket����getAddress()��ȡ���Ƿ��Ͷ˵�IP��ַ����, ����ֵ��InetAddress����
		String ip = dp.getAddress().getHostAddress();//��ʾ�ӻ�ȡ��������ַ�л�ȡip
	//��ȡ���ͷ��Ķ˿ں�,���ݰ�����DatagramPacket���� getPort()���Ͷ˿�	
	  int port = dp.getPort();
	//���յİ�������,��ӡ��
	  System.out.println(new String(data,0,length) + "..." + ip + "..." + port);
	  				//��ʾ���ֽ�����ת�����ַ���,�����ǽ��յ������е�0���ܳ�.
	  //6. �ر���Դ	
		ds.close();
	
	}

}
