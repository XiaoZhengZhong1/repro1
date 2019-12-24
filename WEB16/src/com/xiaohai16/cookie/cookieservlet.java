package com.xiaohai16.cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class cookieservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;////此行代码是为了消除黄色!号.是序列号的意思

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1:创建cookie对象(必须有两个参数,不能用中文,必须都是字符串)
		Cookie cookie = new Cookie("baobao","xiaolei");
		
		//1.1:为cookie设置持久化-----指cookie储存的信息在硬盘中保存的时间
		cookie.setMaxAge(60*10);//时间单位是秒 600秒
		
		//1.2:为cookie设置携带路径(就是指定中访问什么路径才带cookie)
		cookie.setPath("/WEB/cookieservlet");//表示只有在访问/WEB/cookieservlet时才带cookie
		
		//2:把cookie中储存的信息发送到客户端-------响应头的方式
		response.addCookie(cookie);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}