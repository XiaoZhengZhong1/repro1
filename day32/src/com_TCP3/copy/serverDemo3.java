package com_TCP3.copy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class serverDemo3 {
//�������̷߳�����.�ɽ��ܶ���ͻ����ϴ�ͼƬ
	public static void main(String[] args)throws IOException {
		ServerSocket sst = new ServerSocket(50006);
		while(true){
		Socket socket = sst.accept();
		new Thread(new threadDemo3(socket)).start();
		sst.close();
		}
		}
}
 class threadDemo3 implements Runnable {
		private Socket socket;
		public threadDemo3(Socket socket){this.socket=socket;}
		public void run() {
		try{
		InputStream is = socket.getInputStream();
		File fi = new File("F:\\tupian");
		if(!fi.exists()){
			fi.mkdirs();
		}
		String fileName = System.currentTimeMillis() + new Random().nextInt(99999) + ".jpg";
		FileOutputStream fos = new FileOutputStream(fi + "\\" + fileName);
		int len = 0;
		byte[] data = new byte[1024];
		while((len = is.read(data))!=-1){
			fos.write(data, 0, len);;
		}
		OutputStream out = socket.getOutputStream();
		out.write("�ϴ��ɹ�".getBytes());
		socket.close();
		fos.close();
		}catch(IOException e){
			System.out.println(e);
		}

		}
 }		