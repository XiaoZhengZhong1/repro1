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
	private static final long serialVersionUID = 1L;////���д�����Ϊ��������ɫ!��.�����кŵ���˼
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//������ʾ�����ͻ��˷���ͼƬ.����һ��ͼƬ����Ŀ��WebContentĿ¼��
		//1:�Ȼ�ȡͼƬ�ľ���·��.�ٴ���һ���ļ�������,��ȡ�����ļ�.
		String initParameter = this.getServletContext().getRealPath("a.jpg");
		InputStream in = new FileInputStream(initParameter);
		
		//2:ʹ��response��ȡ�ֽ������,�������ֽ�����,ͨ����ȡ�������Ч��
		ServletOutputStream out = response.getOutputStream();
		int len = 0;
		byte[] buffer = new byte[1024];
		//ע��˴�һ��Ҫ��whileѭ��,��ʾֻҪin�����ݾ����
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