package com.socket_Sever;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class text2_text2 {

	public static void main(String[] args) throws IOException {
//		###26.20_网络编程(练习)
//		* 客户端向服务器上传文件(分析服务器操作步骤)
//		* 3:创建多线程服务器.
		ServerSocket server = new ServerSocket(12346);//监听端口号(必须先开启服务器监听端口号,才能收到客户端数据)
		while(true){
			final Socket socket = server.accept();
			new Thread(){
				public void run() {
//					* 4:读取文件名.
					try {
						InputStream is = socket.getInputStream();
						BufferedReader br2 = new BufferedReader(new InputStreamReader(is));/*注意
						上代码,是用此行转换桥梁参数中socket.getInputStream()Alt+shift+r提取出来的*/
						PrintStream ps2 = new PrintStream(socket.getOutputStream());
						String fileName = br2.readLine();
//						* 5:判断文件是否存在,将结果返回客户端.					
						File dir = new File("abc");	//声明一个文件夹.
								dir.mkdir();		//创建一个文件夹.
						File file = new File(dir, fileName);	//表示把接收到的文件名封装成子级文件对象,
							if(file.exists()){					//表示如果服务器已经存在该文件
								ps2.println("文件存在");
								socket.close();   				//表示如果文件存在.就可以关闭通信
									return;   //表示结束,不用执行以下代码.
							}else {
								ps2.println("文件不存在");
								  }
//		 8:定义FileOutputStream从网络读取到数据,储存到本地					
					FileOutputStream fos = new FileOutputStream(file);	
					byte[] arr2 = new byte[8192];
					int len2;
					while((len2 = is.read(arr2)) != -1){
						fos.write(arr2, 0, len2);
						fos.close();
						socket.close();
					}
					} catch (IOException e) {
						
						e.printStackTrace();
					}
				}
			}.start();
			server.close();   //关闭服务器.在哪里调用,在哪里关闭,因为是在while中调用,所有要在whlie结束前关闭.
		}	
		
		



	}
	
}
