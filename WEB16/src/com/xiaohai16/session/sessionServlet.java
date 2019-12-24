package com.xiaohai16.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class sessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;////此行代码是为了消除黄色!号.是序列号的意思
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//创建属于该客户端(会话)的私有session域对象.
		HttpSession session = request.getSession();//获取session域对象.
		
	//session对象方法内部会根据客户端cookie的唯一标识JSESSIONID判断服务器内部是否有相同的id就就拿出来用,没有就创建
		//既然是域对象,就可以往域对象储存数据
		session.setAttribute("name", "xiaolei");
		
		
		
		String id = session.getId();//获取session对象的编号id
		response.getWriter().write("JSESSIONID:" + id);
		
		//为防止cookie会话级别的对象,会话关闭时销毁,重新创建的对象id和上面的session不匹配,二重新创建session浪费资源
		//就手动创建一个cookie,把上面的id封装到cookie中.并设置路径,设置持久化.再响应到客户端
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