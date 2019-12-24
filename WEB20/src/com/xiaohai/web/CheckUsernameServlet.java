package com.xiaohai.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xiaohai.service.UserService;

public class CheckUsernameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;////���д�����Ϊ��������ɫ!��.�����кŵ���˼

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//���ҪУ����û���
				String username = request.getParameter("username");
				
				//����username��service
				UserService service = new UserService();
				boolean isExist = false;
				
					try {
						isExist = service.checkUsername(username);
					} catch (SQLException e) {
						
						e.printStackTrace();
					}
				
				
				
				response.getWriter().write("{\"isExist\":"+isExist+"}");
				
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}