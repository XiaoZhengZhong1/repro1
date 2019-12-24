package com.xiaohai16.cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class getCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;////���д�����Ϊ��������ɫ!��.�����кŵ���˼

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			//1:��ȡ�ͻ���Я����cookie������
			Cookie[] cookies = request.getCookies();
			//2:����cookies
			for (Cookie cookie : cookies) {
				
				if(cookie.getName().equals("baobao")){
					String value = cookie.getValue();
					System.out.println(value);
				}
			}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}