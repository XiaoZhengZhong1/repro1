package com.socket_Sever;

import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStream;
import java.io.InputStreamReader;
//import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class D04_Z_Server {
	/*2.�����
	* ����ServerSocket(��Ҫָ���˿ں�),�����˿ں�(�����ȿ��������������˿ں�,�����յ��ͻ�������)
	* ����ServerSocket��accept()��������һ���ͻ������󣬵õ�һ��Socket
	* ����Socket��getInputStream()��getOutputStream()������ȡ�Ϳͻ���������IO��
	* ���������Զ�ȡ�ͻ��������д��������
	* ���������д�����ݵ��ͻ��˵�������*/
	public static void main(String[] args) throws IOException {
	//	demo();//��Ϊ�����������Ƕ��̵߳Ĳź���.��Ϊ��������Ҫ���ն���ͻ��˵�����.����Ҫ�Ż�
		
			ServerSocket ss = new ServerSocket(62346); //�����˿ں�(�����ȿ��������������˿ں�,�����յ��ͻ�������)
			while(true){	//��ʾ�ѷ��������������������ѭ��.
			final Socket sk = ss.accept();	
				new Thread(){	//��ʾֻҪ������Ϳ���һ���߳�.
					public void run(){
						BufferedReader br;
						try {
							br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
							PrintStream ps = new PrintStream(sk.getOutputStream());
							System.out.println(br.readLine());  
								ps.println("�����������յ�����.�뷢����������");  
						} catch (IOException e) {
							System.out.println(e);
							throw new RuntimeException("io���쳣");
						}
						
					}
				}.start();
				ss.close();
			}
		  		
			
	
	}
	
	public static void demo() throws IOException {
		ServerSocket ss = new ServerSocket(12345); //����������.ָ���������˿ں�.(����ͷ��������ʵĶ˿ں�һ��.)
			Socket sk = ss.accept();	// ��ʾ���տͻ���ͨ��ͨ�Ų���ip�Ͷ˿ں�12345����������,�õ�һ��ͨ�Ų���.
			 /*  InputStream is2 = sk.getInputStream();	//���ò�����Ļ�ȡ����������.
			   OutputStream os2 = sk.getOutputStream();	//���ò�����Ļ�ȡ���������.
			   os2.write("�����������յ�����.�뷢����������".getBytes());
			   byte[] arr2 = new byte[1024];		//����һ���ֽ�����,���տͻ��˷���������.
			   		int	len2 = is2.read(arr2);	//��ʾ�ѿͻ���ͨ��ͨ�Ų���ip�Ͷ˿ںŷ���������,�����ֽ�������.���ض�ȡ�ĸ���
			   		System.out.println(new String(arr2,0,len2));  //��ʾ���ֽ�����ת����
*/			   		
//�Ż�����6�д���.
			 BufferedReader  br = new BufferedReader(new InputStreamReader(sk.getInputStream()));//���ֽ�����װ���ַ���
			  PrintStream ps = new PrintStream(sk.getOutputStream()); //PrintStream��д�����еķ���
					System.out.println(br.readLine());  //��ʾ���д�ӡ���յ��Ŀͻ�������
						ps.println("�����������յ�����.�뷢����������");  //��ʾ�ظ��ͻ���
			  
			  			sk.close();	//�رս��յ��Ŀͻ��˲���ͨ����
			   		ss.close();//�����������ǲ��ùص�.����˱��뱨����ʾ�����޷����ӱ���.���в���
	}

}
