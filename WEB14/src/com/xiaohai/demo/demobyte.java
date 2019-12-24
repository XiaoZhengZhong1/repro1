package com.xiaohai.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class demobyte extends HttpServlet {
	private static final long serialVersionUID = 1L;////此行代码是为了消除黄色!号.是序列号的意思
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//本类演示如何向客户端发送图片.向复制一张图片到项目中WebContent目录下
		//1:先获取图片的绝对路径.再创建一个文件输入流,读取本地文件.
		String initParameter = this.getServletContext().getRealPath("a.jpg");
		InputStream in = new FileInputStream(initParameter);
		
		//2:使用response获取字节输出流,并创建字节数组,通过读取和输出的效率
		ServletOutputStream out = response.getOutputStream();
		int len = 0;
		byte[] buffer = new byte[1024];
		//注意此处一定要用while循环,表示只要in有内容就输出
		while((len=in.read(buffer))>0){
			out.write(buffer, 0, len);
		}
		in.close();
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}