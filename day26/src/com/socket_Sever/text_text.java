package com.socket_Sever;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class text_text {
	/*###26.19_������(��ϰ)
	* �ͻ����������д�ַ���(����¼��),������(���߳�)���ַ�����ת��д��,�ͻ����ٴζ�ȡ���Ƿ�ת����ַ���
	*InputStreamReader ���ֽ���ͨ���ַ���������
	*PrintStream ��ӡ�������ַ���ʹ��ƽ̨��Ĭ���ַ�����ת��Ϊ�ֽڡ�����Ҫд���ַ�������д���ֽڵ�����£�Ӧ��ʹ�� PrintWriter �ࡣ 

*/
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(12345);	//����������,�󶨶˿ں�(����Ϳͻ��˶˿ں�һ��)
			while(true){
			final	Socket st2 = ss.accept();	//������ѭ����,��ʾ���Ͻ��տͻ�������. 
				new Thread(){				//��ʾ���յ�һ������Ϳ���һ���߳�.
				public void run() {
					try {
						BufferedReader br2 = new BufferedReader(new InputStreamReader(st2.getInputStream()));
						PrintStream ps2 = new PrintStream(st2.getOutputStream());
						   String lin = br2.readLine();//��ʾ���ж�ȡ���յĿͻ�������.
						   lin = new StringBuilder(lin).reverse().toString();/*��ʾ�Ѷ�ȡ���ַ���ת�ɻ���������
						   ���û��������ͷ�ת����,���ַ������з�ת.��ת������ת����String����.Ҳ����ʽ���.*/
						   	ps2.println(lin);	//��ʾ�ѽ��յ����ַ�����ת��������д�����ͻ���.
						   	st2.close();  //�ر�ͨ�Ų���.
						   	
					} catch (IOException e) {
						
						e.printStackTrace();
					}
				}
					
				}.start();
	
				ss.close();
			}
	}

}
