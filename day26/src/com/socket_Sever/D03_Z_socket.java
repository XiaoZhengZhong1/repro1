package com.socket_Sever;

import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStream;
import java.io.InputStreamReader;
//import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class D03_Z_socket {
/*###26.16_������(TCPЭ��)(����)
* 1.�ͻ���
	* Socket����ʵ�ֿͻ����׽��֣�Ҳ���ԾͽС��׽��֡������׽�������̨������ͨ�ŵĶ˵㡣 
	*����Socket���ӷ����(ָ��ip��ַ,�˿ں�)ͨ��ip��ַ�Ҷ�Ӧ�ķ�����
	* ����Socket��getInputStream()��getOutputStream()������ȡ�ͷ����������IO��
	* ���������Զ�ȡ����������д��������
	* ���������д�����ݵ�����˵�������
*InputStreamReader ���ֽ���ͨ���ַ���������
*PrintStream ��ӡ�������ַ���ʹ��ƽ̨��Ĭ���ַ�����ת��Ϊ�ֽڡ�����Ҫд���ַ�������д���ֽڵ�����£�Ӧ��ʹ�� PrintWriter �ࡣ 

*
*/
	public static void main(String[] args) throws UnknownHostException, IOException {
	  Socket skt = new Socket("127.0.0.1", 62346);//����һ��������(�ͻ�������������ӵĲ���.)ָ��Ҫ���ӵķ�����ip�Ͷ˿ں�
/* 
	  InputStream is = skt.getInputStream();	//���ò����������������.����һ���ֽ�������is(����read�����������������)
	  	OutputStream os = skt.getOutputStream();//���ò���������������.����һ���ֽ������os(����writeд��,�����������)
	  	
	 byte[] arr = new byte[1024];//��ʾ����һ��1024���ֽڵ��ֽ�����,������ȡ���������ص�����,(��Ϊ������Ҳ�ǰ��ַ���.�����ֽ�����)
	  int len =	is.read(arr);//��ʾ��ͨ��skt���������,���յķ��������ص�������Ϣ,�����ֽ�������.
	  	System.out.println(new String(arr,0,len));//��ʾ��ӡһ�������ַ�������(�Ѳ����е��ֽ�����ת�����ַ���,��0����ת��len��)
	  	os.write("�ҿͻ�����������,��Ҫ����".getBytes());��ʾ��ָ����ip �˿ں�дһ���ַ���,�ŵ��ֽ�������."".getBytes()��ʾ
		�ַ����������û�ȡ�ֽ����鷽��.���ַ������ݴ����ֽ�������,����һ�����ֽ�����.��Ϊ���ǻ�ȡ�����ֽ�������,��ȻҪ���ַ���ת���ֽ�����.
	  	*/
//�Ż�����6�д���.	 
	  BufferedReader  br = new BufferedReader(new InputStreamReader(skt.getInputStream()));//���ֽ�����װ���ַ���
	  PrintStream ps = new PrintStream(skt.getOutputStream()); //PrintStream��д�����еķ���
ps.println("�ҿͻ�����������,��Ҫ����");//�������д������.��\r\n����. ע��һ��Ҫ��println PrintStream������д�ֽ�Ҳ��д�ַ�
	  	System.out.println(br.readLine());   //��ʾ���ж�ȡ��������������.��\r\n����	ע���д������\r\n������
	  
	  skt.close();	//�ر�����,���ͻ��˲���Ҫ�����������������ʱ,�͹رղ�������.���������Ҳ�����Źر�.
	}
	//ConnectException����ܾ�Զ�����������ӵ�Զ�̷������ã����׳� ConnectException��	
}
