package com.xiaohai.web.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xiaohai.service.UserService;

public class CheckUsernameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;////���д�����Ϊ��������ɫ!��.�����кŵ���˼

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			
		//��ȡ�û���,У���Ƿ����
		String username = request.getParameter("username");
		UserService service = new UserService();
		boolean isExist = service.checkUsername(username);
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}