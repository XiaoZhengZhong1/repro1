package com_TCP3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class serverDemo3 {
//�������̷߳�����.�ɽ��ܶ���ͻ����ϴ�ͼƬ
	public static void main(String[] args)throws IOException {
		ServerSocket sst = new ServerSocket(50005);
//��ʾ��������ѭ���Ľ��տͻ���,����һ���Ϳ���һ���߳�,new�̵߳�ʵ����,����ֻ��mian�������ϴ�ͼƬ��.�����߳�������ÿ����̷߳���
		while(true){
		Socket socket = sst.accept();
		new Thread(new threadDemo3(socket)).start();
		sst.close();
		}
		}
}
