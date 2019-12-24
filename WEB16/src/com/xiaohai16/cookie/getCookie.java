package com.xiaohai16.cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class getCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;////此行代码是为了消除黄色!号.是序列号的意思

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			//1:获取客户端携带的cookie的数据
			Cookie[] cookies = request.getCookies();
			//2:遍历cookies
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