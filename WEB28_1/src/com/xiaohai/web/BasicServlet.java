package com.xiaohai.web;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//�����Ǹ���productServlet��,�ڿͻ��˽�����Ʒ��ѯ����ʱ.ͨ����ȡ����ķ�������,�÷��似������productServlet�еķ���
public class BasicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;////���д�����Ϊ��������ɫ!��.�����кŵ���˼

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		
		try {
			//1����������method������
			String methodName = req.getParameter("method");
			//2����õ�ǰ�����ʵĶ�����ֽ������
			Class clazz = this.getClass();//ProductServlet.class ---- UserServlet.class
			//3����õ�ǰ�ֽ��������е�ָ������
			Method method = clazz.getMethod(methodName, HttpServletRequest.class,HttpServletResponse.class);
			//4��ִ����Ӧ���ܷ���
			method.invoke(this, req,resp);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
		

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}