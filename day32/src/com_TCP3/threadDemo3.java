package com_TCP3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Random;

public class threadDemo3 implements Runnable {
//创建一个线程接口子类,重写run方法,在方法中执行图片上传,再在服务器new thread()在参数中new本类对象调用start开启线程方法.
	//私有客户端对象.因为本类就是为了接收,服务器accept方法接收到的具体的客户端.
	private Socket socket;
	//提供有参构造,表示在服务器new本类对象时参数是具体的客户端
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
	out.write("上传成功".getBytes());
	socket.close();
	fos.close();
	}catch(IOException e){
		System.out.println(e);
	}

	}
		
	}


