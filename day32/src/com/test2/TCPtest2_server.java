package com.test2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TCPtest2_server {

	public static void main(String[] args)throws IOException {
		ServerSocket sst = new ServerSocket(10000);
		Socket st = sst.accept();
		InputStream is = st.getInputStream();
		File fi = new File("F:\\tupian3");
		if(!fi.exists()){
			fi.mkdirs();
		}
	String fileName = System.currentTimeMillis()+new Random().nextInt(999)+".jpg";
	FileOutputStream fos = new FileOutputStream(fi+"\\"+fileName);
	int len=0;
	byte[] data = new byte[1024];
	while((len=is.read(data))!=-1){
		fos.write(data, 0, len);
	}
	OutputStream out = st.getOutputStream();
	out.write("图片上传成功".getBytes());
	sst.close();
	fos.close();
	
	}

}
