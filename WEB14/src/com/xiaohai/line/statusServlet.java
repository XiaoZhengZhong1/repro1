package com.xiaohai.line;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class statusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;////���д�����Ϊ��������ɫ!��.�����кŵ���˼
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	//�ֶ�����http��Ӧ��״̬�����:200 302 404 500.һ����tomcat����,����200��ʾok.�����Լ����� (�����f12��ݼ� )
		//response.setStatus(404);	�˽�
		
		
	//������Ӧͷ  addHeader���   setHeader����
		//response.addHeader("name", "xiaoleo"); ����Ӧͷ�������		�˽�
		//response.addHeader("name", "xiaohei"); xiaoleo��xiaohei�������
		
		//response.setHeader(String,value);
		//response.setHeader("age", "30");	����Ӧͷ��������		����
	   //response.setHeader("age", "20");	20���30
		
		//�ض���:���ǵ��û���A��������,����Bҳ��ĵ�ַ.��̨���������¶�λ�����Ĺ���,״̬��302
		//1:����״̬��
		//response.setStatus(302);
		//2:������Ӧͷ.����Ϊ��תlocation  ��ת��ֵΪdemoServlet 
		//response.setHeader("location", "/WEB14/demoServlet");
		
		//3:�����Ż����ض��򷽷�
		//response.sendRedirect("/WEB14/demoServlet");
		
		//������չ���ض��򷽷�()�˽�
		//response.setHeader("refersh", "5:url=http://www.baidu.com");
		//��ʾ:��ӦΪ����Ϊ÷5��ˢ��һ��,������ת���ٶ�
		
		
		
		//4:������Ӧ��,�����������������
		//response.setCharacterEncoding("utf-8"); ���ڴ��ַ�����Ҫ�ֶ��޸����������,�������д���Ϊ�Ż���
		//������:ͨ����Ӧͷ,��֪�ͻ�ʹ�ú��ֱ����,�����ֶ����������
		//response.setHeader("Context-type","charset=UTF-8");
		//�����Ż�������ʽ��������������
		response.setContentType("Text/html;charset=UTF-8");
		PrintWriter writer = response.getWriter();
		writer.write("�й���");
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}