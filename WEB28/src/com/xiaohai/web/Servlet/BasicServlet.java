package com.xiaohai.web.Servlet;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//本类是辅助productServlet类,在客户端进行商品查询操作时.通过获取请求的方法参数,用反射技术调用productServlet中的方法
public class BasicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;////此行代码是为了消除黄色!号.是序列号的意思

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		req.setCharacterEncoding("UTF-8");
		
		try {
			//1、获得请求的method的名称
			String methodName = req.getParameter("method");
			//2、获得当前被访问的对象的字节码对象
			Class clazz = this.getClass();//ProductServlet.class ---- UserServlet.class
			//3、获得当前字节码对象的中的指定方法
			Method method = clazz.getMethod(methodName, HttpServletRequest.class,HttpServletResponse.class);
			//4、执行相应功能方法
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