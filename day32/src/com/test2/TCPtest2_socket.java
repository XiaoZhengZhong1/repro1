package com.test2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPtest2_socket {
	public static void main(String[] args)throws IOException {
		Socket st = new Socket("127.0.0.1", 10000);
		OutputStream out = st.getOutputStream();
		FileInputStream fis = new FileInputStream("H:\\ws.jpg");
		int len = 0;
		byte[] data = new byte[1024];
		while((len=fis.read(data))!=-1){
			out.write(data, 0, len);
		}
		st.shutdownOutput();
		InputStream is = st.getInputStream();
		len=is.read(data);
		System.out.println(new String(data,0,len));
		st.close();
		fis.close();
	
	}
}