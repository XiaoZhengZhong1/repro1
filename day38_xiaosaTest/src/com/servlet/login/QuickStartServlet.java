 package com.servlet.login;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class QuickStartServlet implements Servlet {
	@Override
	public void destroy() {
		
		System.out.println("destroy����,��select���ٵ�ʱ��ִ��");
	}
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("init����,servlet���������ʱ��ִ��");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		//��service����ÿ�����������ˢ�¶���ֻ��.
		System.out.println("service����,ÿ�����󶼻�ִ��");
	}
	

	@Override
	public ServletConfig getServletConfig() {
		
		return null;
	}

	@Override
	public String getServletInfo() {
		
		return null;
	}

	
	

}
