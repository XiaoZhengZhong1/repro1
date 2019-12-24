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
		
		System.out.println("destroy方法,在select销毁的时候执行");
	}
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("init方法,servlet创建对象的时候执行");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		//本service方法每次浏览器访问刷新都会只需.
		System.out.println("service方法,每次请求都会执行");
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
