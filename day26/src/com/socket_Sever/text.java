package com.socket_Sever;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class text {
	/*###26.19_������(��ϰ)
	* �ͻ����������д�ַ���(����¼��),������(���߳�)���ַ�����ת��д��,�ͻ����ٴζ�ȡ���Ƿ�ת����ַ���
	*InputStreamReader ���ֽ���ͨ���ַ���������
	*PrintStream ��ӡ�������ַ���ʹ��ƽ̨��Ĭ���ַ�����ת��Ϊ�ֽڡ�����Ҫд���ַ�������д���ֽڵ�����£�Ӧ��ʹ�� PrintWriter �ࡣ 

*/
	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner sc = new Scanner(System.in);//�����˿ں�(�����ȿ��������������˿ں�,�����յ��ͻ�������)
		Socket sk = new Socket("127.0.0.1", 12345);	//���������,ָ��ip�Ͷ˿ں�.����ConnectException����ܾ�Զ�����������ӵ�Զ�̷������ã����׳� ConnectException�� 
		BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
		PrintStream ps = new PrintStream(sk.getOutputStream());	//PrintStream�๹��������Դ��������,����һ����ӡ��
		ps.println(sc.nextLine());	//��ʾ�Ѽ���¼����ַ���.д����������.(��\r\n����)
				System.out.println(br.readLine());  //���ж�ȡ������д������
					sc.close();
					sk.close();
	}

}
