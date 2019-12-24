package com.TCP2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class serverDemo2 {
/*###20TCP上传服务器
    *  TCP图片上传服务器
    *   1. ServerSocket套接字对象,监听端口8000
    *   2. 方法accept()获取客户端的连接对象
    *   3. 客户端连接对象获取字节输入流,读取客户端发送图片
    *   4. 创建File对象,绑定上传文件夹
    *       判断文件夹存在, 不存,在创建文件夹
    *   5. 创建字节输出流,数据目的File对象所在文件夹
    *   6. 字节流读取图片,字节流将图片写入到目的文件夹中
    *   7. 将上传成功会写客户端
    *   8. 关闭资源*/
	public static void main(String[] args) throws IOException {
		ServerSocket sst = new ServerSocket(50003);
		Socket st = sst.accept();
		//3. 客户端连接对象获取字节输入流,读取客户端发送图片
		InputStream in = st.getInputStream();
		//4. 创建File对象,绑定接收上传的文件夹,就是创建一个文件夹准备接收图片
		File fi = new File("F:\\tupian");//创建一个文件路径对象,参数中给一个文件夹路径
		//判断文件夹存在, 不存,在创建文件夹
		if(!fi.exists()){//表示如果文件夹不存在
			fi.mkdirs();//就根据参数中网址创建一个文件夹
		}
		//5. 创建文件字节输出流,将图片写入绑定文件夹中的文件中,注意文件夹是目录,目录中要有具体文件装文件
		//为了防止文件重名用当前毫秒值加六位数的随机数表示文件名
		String fileName = System.currentTimeMillis() + new Random().nextInt(99999) + ".jpg";
		FileOutputStream fos = new FileOutputStream(fi + "\\" + fileName);
		int len = 0;
		byte[] data = new byte[1024];
		while((len = in.read(data))!=-1){
			fos.write(data, 0, len);
		}
		OutputStream out = st.getOutputStream();
		out.write("上传成功".getBytes());
		st.close();
		fos.close();
		sst.close();
	}

}
