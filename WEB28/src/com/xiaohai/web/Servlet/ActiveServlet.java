package com.xiaohai.web.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xiaohai.service.UserService;

public class ActiveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;////此行代码是为了消除黄色!号.是序列号的意思

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//获得激活码
				String activeCode = request.getParameter("activeCode");
				
				UserService service = new UserService();
				service.active(activeCode);
				
				//跳转到登录页面
				response.sendRedirect(request.getContextPath()+"/login.jsp");
				
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}