package com.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*###05UDPЭ��
   A:UDPЭ��
     a:UDPЭ�����:
      UDP��������ͨ��Э�飬�������ݴ���ʱ�����ݵķ��Ͷ˺ͽ��ն˲������߼����ӡ�
      ����˵����һ̨�����������һ̨�������������ʱ�����Ͷ˲���ȷ�Ͻ��ն��Ƿ���ڣ��ͻᷢ�����ݣ�ͬ�����ն����յ�����ʱ��Ҳ�������Ͷ˷����Ƿ��յ����ݡ�
     b:UDPЭ���ص�:
      ����ʹ��UDPЭ��������ԴС��ͨ��Ч�ʸߣ�����ͨ������������Ƶ����Ƶ����ͨ���ݵĴ���������Ƶ���鶼ʹ��UDPЭ�飬
      ��Ϊ���������ʹż����ʧһ�������ݰ���Ҳ����Խ��ս������̫��Ӱ�졣


###06TCPЭ��
  *A:TCPЭ��
    TCPЭ�����������ӵ�ͨ��Э�飬���ڴ�������ǰ���ڷ��Ͷ˺ͽ��ն˽����߼����ӣ�Ȼ���ٴ������ݣ����ṩ����̨�����֮��ɿ��޲������ݴ��䡣
    ��TCP�����б���Ҫ��ȷ�ͻ�����������ˣ�
      �ɿͻ��������˷�����������ÿ�����ӵĴ�������Ҫ�������������֡���
      ��һ�����֣��ͻ�����������˷����������󣬵ȴ�������ȷ��
      �ڶ������֣�����������ͻ��˻���һ����Ӧ��֪ͨ�ͻ����յ�����������
      ���������֣��ͻ����ٴ���������˷���ȷ����Ϣ��ȷ������

========================================�ڶ��ڿ�=========================================
###07���ݰ��ͷ��Ͷ������
  *A:���ݰ��ͷ��Ͷ������:
    DatagramPacket���ݰ������þ���ͬ�ǡ���װ�䡱��
       ���Խ����Ͷ˻��߽��ն˵����ݷ�װ������Ȼ���������ֻ�С���װ�䡱�ǲ����ģ�����Ҫ����ͷ��
       �ڳ�������Ҫʵ��ͨ��ֻ��DatagramPacket���ݰ�Ҳͬ�����У�Ϊ��JDK���ṩ��һ��DatagramSocket�ࡣ
       DatagramSocket������þ���������ͷ��ʹ��������ʵ������Ϳ��Է��ͺͽ���DatagramPacket���ݰ�
    DatagramPacket:��װ����
    DatagramSocket:����DatagramPacket

###08UDP���Ͷ�
   *A:UDP���Ͷ�
	     /*
        *  ʵ��UDPЭ��ķ��Ͷ�:
        *    ʵ�ַ�װ���ݵ��� java.net.DatagramPacket  ��������ݰ�װ
        *    ʵ�����ݴ������ java.net.DatagramSocket  �����ݰ�����ȥ
        *    
        *  ʵ�ֲ���:
        *    1. ����DatagramPacket����,��װ����, ���յĵ�ַ�Ͷ˿�
        *    2. ����DatagramSocket
        *    3. ����DatagramSocket�෽��send,�������ݰ�
        *    4. �ر���Դ*/
	public class UDPSend {
		/*��DatagramPacket��Ĺ��췽��
		 *  DatagramPacket(byte[] buf, int length, InetAddress address, int port) 
		 *  �������ݱ���������������Ϊ length �İ����͵�ָ�������ϵ�ָ���˿ںš�*/
		public static void main(String[] args) throws IOException {
			
		//��װ����
		byte[] data = "���UDP".getBytes();//��ʾ��Ҫ���͵�,�ַ���,��װ���ֽ�����.
		//����InetAdderss����,��װip��ַ
		InetAddress inet = InetAddress.getByName("127.0.0.1");
		DatagramPacket dp = new DatagramPacket(data, data.length, inet, 5000);//������,���ݰ�,������,ip,�˿ں�
		DatagramSocket ds = new DatagramSocket();//�������Ͷ���
			ds.send(dp);//���÷��ͷ���
			ds.close();//����
	//д���׼UPD���ʹ���,����ֱ�ӷ���.��ΪUDPЭ�������������ӵ�,���Կ��Է��Ͳ��ᱨ��.��Ϊû�н��ն�,�������ݻᶪʧ
		}
	}
