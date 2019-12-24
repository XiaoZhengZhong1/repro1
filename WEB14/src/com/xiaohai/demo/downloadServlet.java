package com.xiaohai.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class downloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;////���д�����Ϊ��������ɫ!��.�����кŵ���˼
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*���������ʾ:�����ͻ���Ӧ�ļ���������.(ǰ������Ŀ����Ҫ���ص��ļ�,��Ҫ����Ŀ�µ�WebCintextĿ¼��дһ��
		 * ����ת�����ǳ��ı�html�ĵ�.�������ת��������)*/
		
		//1:��ȡ�����е��ļ���
			String paramName = request.getParameter("filename");
		//2:���߿ͻ���Ҫ���ص��ļ�������------�ͻ���(ָ��վ)ͨ���ļ���MIME����ȡ��������
			response.setContentType(this.getServletContext().getMimeType(paramName));
		//3:���߿ͻ���(��վ)�ļ�����ֱ�ӽ�����,�����Ը�������ʽ���ص�
			response.setHeader("Content-Disposition","attachment;file");
		//4:��ȡ�ļ��ľ���·��--------ע������ľ���·����ָtomcat��webapps�е�WEB14��Ŀ�����Ǵ�WEB14�е�download/
			String realPath = this.getServletContext().getRealPath("download/"+paramName);
		//5:��ȡ���ļ���������
			InputStream in = new FileInputStream(realPath);
		//6:��ȡ�����.ע������ͻ������.���Ա�����reponse��ȡ
			ServletOutputStream out = response.getOutputStream();
		//7:�ı�������ģ�����
			int len = 0;
			byte[] buffer = new byte[1024];
			while((len=in.read(buffer))>0){
				out.write(buffer, 0, len);
			}
			in.close();
			
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}