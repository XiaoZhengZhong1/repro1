package com.xiaohai24.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xiaohai24.domain.User;
import com.xiaohai24.service.loginService;

public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;////���д�����Ϊ��������ɫ!��.�����кŵ���˼

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				
		//��������ܹ�������ʾ,�õ�½��֤,�Լ��Զ���½.
		String username  = request.getParameter("username");
		String password = request.getParameter("password");
		
		loginService service = new loginService();
		User user = null;
		try {
			 user = service.chenkLingon(username,password);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	//��ȡ����������ǰ�ͻ��Լ��ķ����������
		HttpSession session = request.getSession();
		if(user!=null){
		
			
			
			if(user!=null){
				//2:��½������һ��֮���ж�user�Ƿ�Ϊ��,��Ϊ�վͱ�ʾ�û������붼��
				String autoLogin = request.getParameter("autoLogin");

				if(autoLogin!=null){
					//4:�����Ϊ�վ�new����cookie,�ѱ�����username��password�ֱ��������cookie������

					Cookie cookie_name = new Cookie("cookie_name", user.getUsername());
					Cookie cookie_password = new Cookie("cookie_password",user.getPassword());
					
					//5:������cookie���ó־û�ʱ��,�������û��������ڿͻ��˵�cookie��������ܴ洢ʱ�����
					cookie_name.setMaxAge(60*60);
					cookie_password.setMaxAge(60*60);
					
					//6:����cookie����ʱЯ����·��,���Ƕ���webӦ��
					cookie_name.setPath(request.getContextPath());
					cookie_password.setPath(request.getContextPath());
					
					//7:�����úõ�cookie��Ӧ���ͻ���
					response.addCookie(cookie_name);
					response.addCookie(cookie_password);
		
					}
			//�浽�������������,��ʾ���û��Ѵ���,�Է����´οͻ����ٴε�½���ҵ�
			session.setAttribute("user", user);
			//user��Ϊ�ձ�ʾ��ѯ���û�������,��ʾ��½�ɹ�,��Ӧ�����ض�����ҳ
			//request.getContextPath()��ʾ��ǰwebӦ��Ĭ�Ͼ��Ƿ�����ҳ
			response.sendRedirect(request.getContextPath());
			}
	
		
		
		
		
		}else{
		//�����ʾ��½ʧ��,��ʾ���������Ϣ
		request.setAttribute("logininfo","�û������������");
		//ת������½ҳ��
		request.getRequestDispatcher("/login.jsp").forward(request, response);

		
	}
}		
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}