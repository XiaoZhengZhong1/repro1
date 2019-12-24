package com.xiaohai16.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class sessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;////���д�����Ϊ��������ɫ!��.�����кŵ���˼
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//�������ڸÿͻ���(�Ự)��˽��session�����.
		HttpSession session = request.getSession();//��ȡsession�����.
		
	//session���󷽷��ڲ�����ݿͻ���cookie��Ψһ��ʶJSESSIONID�жϷ������ڲ��Ƿ�����ͬ��id�;��ó�����,û�оʹ���
		//��Ȼ�������,�Ϳ���������󴢴�����
		session.setAttribute("name", "xiaolei");
		
		
		
		String id = session.getId();//��ȡsession����ı��id
		response.getWriter().write("JSESSIONID:" + id);
		
		//Ϊ��ֹcookie�Ự����Ķ���,�Ự�ر�ʱ����,���´����Ķ���id�������session��ƥ��,�����´���session�˷���Դ
		//���ֶ�����һ��cookie,�������id��װ��cookie��.������·��,���ó־û�.����Ӧ���ͻ���
		Cookie cookie = new Cookie("JSESSIONID", id);
		cookie.setPath("/WEB16/");
		cookie.setMaxAge(600);
		response.addCookie(cookie);
		
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}