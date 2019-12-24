package com.demotomcat;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/*演示演示eclipse和服务器tomcat的动态连接
 * 1:必须实现一个servlet类
 * */
public class demo_tomcat implements Servlet {
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
	//本方法是专门向客户端提供响应的方法
		HttpServletResponse response = (HttpServletResponse)arg1;
			response.getWriter().write("this is my frist servlet!!!");
	}
	
	@Override
	public void destroy() {
	}

	@Override
	public ServletConfig getServletConfig() {
		
		return null;
	}

	@Override
	public String getServletInfo() {
		
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
	}

	

}
