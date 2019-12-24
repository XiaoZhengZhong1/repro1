package com.xiaohai16.demoCookie;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class lastTime extends HttpServlet {
	private static final long serialVersionUID = 1L;////���д�����Ϊ��������ɫ!��.�����кŵ���˼

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//��һ������:��ʾ�û��ڶ��η��ʻ�����վ��ʾ�ϴη��ʵ�����
	
		//1:��ȡ��ǰʱ��
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String current = sdf.format(date);
		//2::�����ͻ���cookie�������,��¼��ǰ����ֵ,��װ��cookie�з��͵��ͻ���
		Cookie coo = new Cookie("time",current);
		//3:���ó־û�
		coo.setMaxAge(60*10);
		//4:����coo
		response.addCookie(coo);
		
		//5:��ȡ�ͻ���������Я����cookie
		Cookie[] cookies = request.getCookies();
		//��������е�cookie���ǿ�,˵�����ǵ�һ�η��ʱ���Դ,�ͻ�ȡ���ϴεķ���ʱ��
		String currentTime = null;
		if(cookies!=null){
			for (Cookie cookie : cookies) {
				if("time".equals(cookie.getName())){
					 currentTime = cookie.getValue();
				}
			}
		}
		//6:���ݻ�ȡ��ʱ���Ƿ�Ϊ��,���������Ӧ����ʱ��
		response.setContentType("text/html;charset=UTF-8");
		if(currentTime!=null){
			response.getWriter().write("���ϴη��ʵ�ʱ����:" + currentTime);
		}else{
			response.getWriter().write("���ǵ�һ�η���");

		}
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}