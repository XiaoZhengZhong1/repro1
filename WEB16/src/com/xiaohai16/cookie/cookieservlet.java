package com.xiaohai16.cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class cookieservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;////���д�����Ϊ��������ɫ!��.�����кŵ���˼

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1:����cookie����(��������������,����������,���붼���ַ���)
		Cookie cookie = new Cookie("baobao","xiaolei");
		
		//1.1:Ϊcookie���ó־û�-----ָcookie�������Ϣ��Ӳ���б����ʱ��
		cookie.setMaxAge(60*10);//ʱ�䵥λ���� 600��
		
		//1.2:Ϊcookie����Я��·��(����ָ���з���ʲô·���Ŵ�cookie)
		cookie.setPath("/WEB/cookieservlet");//��ʾֻ���ڷ���/WEB/cookieservletʱ�Ŵ�cookie
		
		//2:��cookie�д������Ϣ���͵��ͻ���-------��Ӧͷ�ķ�ʽ
		response.addCookie(cookie);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}