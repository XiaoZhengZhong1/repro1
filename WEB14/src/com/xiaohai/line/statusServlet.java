package com.xiaohai.line;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class statusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;////此行代码是为了消除黄色!号.是序列号的意思
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	//手动设置http响应中状态码比如:200 302 404 500.一般由tomcat返回,返回200表示ok.不用自己设置 (浏览器f12快捷键 )
		//response.setStatus(404);	了解
		
		
	//设置响应头  addHeader添加   setHeader设置
		//response.addHeader("name", "xiaoleo"); 往响应头添加内容		了解
		//response.addHeader("name", "xiaohei"); xiaoleo和xiaohei都会存在
		
		//response.setHeader(String,value);
		//response.setHeader("age", "30");	往响应头设置内容		掌握
	   //response.setHeader("age", "20");	20会盖30
		
		//重定向:就是当用户向A发送请求,返回B页面的地址.后台就做了重新定位方法的功能,状态码302
		//1:设置状态码
		//response.setStatus(302);
		//2:设置响应头.类型为跳转location  跳转的值为demoServlet 
		//response.setHeader("location", "/WEB14/demoServlet");
		
		//3:最终优化的重定向方法
		//response.sendRedirect("/WEB14/demoServlet");
		
		//类似扩展的重定向方法()了解
		//response.setHeader("refersh", "5:url=http://www.baidu.com");
		//表示:响应为类型为梅5秒刷新一次,重新跳转到百度
		
		
		
		//4:设置响应体,并解决中文乱码问题
		//response.setCharacterEncoding("utf-8"); 由于此种方法还要手动修改浏览器编码,所以下行代码为优化后
		//方法二:通过响应头,告知客户使用何种编码表,无序手动在浏览器改
		//response.setHeader("Context-type","charset=UTF-8");
		//最终优化后死格式解决乱码问题代码
		response.setContentType("Text/html;charset=UTF-8");
		PrintWriter writer = response.getWriter();
		writer.write("中国好");
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}