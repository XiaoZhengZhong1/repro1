package com.xiaohai24.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xiaohai24.domain.User;
import com.xiaohai24.service.loginService;

public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;////此行代码是为了消除黄色!号.是序列号的意思

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				
		//本次三层架构代码演示,用登陆验证,以及自动登陆.
		String username  = request.getParameter("username");
		String password = request.getParameter("password");
		
		loginService service = new loginService();
		User user = null;
		try {
			 user = service.chenkLingon(username,password);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	//获取当发送请求前客户自己的服务器域对象
		HttpSession session = request.getSession();
		if(user!=null){
		
			
			
			if(user!=null){
				//2:登陆代码跑一遍之后判断user是否为空,不为空就表示用户和密码都有
				String autoLogin = request.getParameter("autoLogin");

				if(autoLogin!=null){
					//4:如果不为空就new两个cookie,把编码后的username和password分别放入两个cookie参数中

					Cookie cookie_name = new Cookie("cookie_name", user.getUsername());
					Cookie cookie_password = new Cookie("cookie_password",user.getPassword());
					
					//5:给两个cookie设置持久化时间,就是让用户和密码在客户端的cookie域对象中能存储时间更长
					cookie_name.setMaxAge(60*60);
					cookie_password.setMaxAge(60*60);
					
					//6:设置cookie访问时携带的路径,就是对象web应用
					cookie_name.setPath(request.getContextPath());
					cookie_password.setPath(request.getContextPath());
					
					//7:将设置好的cookie响应给客户端
					response.addCookie(cookie_name);
					response.addCookie(cookie_password);
		
					}
			//存到服务器域对象中,表示该用户已存在,以方便下次客户端再次登陆那找到
			session.setAttribute("user", user);
			//user不为空表示查询该用户和密码,表示登陆成功,响应让其重定向到首页
			//request.getContextPath()表示当前web应用默认就是访问首页
			response.sendRedirect(request.getContextPath());
			}
	
		
		
		
		
		}else{
		//否则表示登陆失败,提示请求错误信息
		request.setAttribute("logininfo","用户名或密码错误");
		//转发到登陆页面
		request.getRequestDispatcher("/login.jsp").forward(request, response);

		
	}
}		
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}