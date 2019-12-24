package com_TCP3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class serverDemo3 {
//创建多线程服务器.可接受多个客户端上传图片
	public static void main(String[] args)throws IOException {
		ServerSocket sst = new ServerSocket(50005);
//表示可以无限循环的接收客户端,接收一个就开启一条线程,new线程的实现类,类中只有mian方法是上传图片的.在用线程子类调用开启线程方法
		while(true){
		Socket socket = sst.accept();
		new Thread(new threadDemo3(socket)).start();
		sst.close();
		}
		}
}
