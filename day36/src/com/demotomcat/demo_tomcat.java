package com.demotomcat;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/*��ʾ��ʾeclipse�ͷ�����tomcat�Ķ�̬����
 * 1:����ʵ��һ��servlet��
 * */
public class demo_tomcat implements Servlet {
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
	//��������ר����ͻ����ṩ��Ӧ�ķ���
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
