package com.xiaohai.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xiaohai.domain.User;
import com.xiaohai.service.UserService;

public class UserServlet extends BasicServlet {

	
	//注销用户
	public void logout(HttpServletRequest request, HttpServletResponse response) throws IOException{
		//获取用户在服务器是存储域,删除里面的用�?
		HttpSession session = request.getSession();
		session.removeAttribute("user");
		
		//将客户端的域中携带的user也删�?就是覆盖,把之前存入cookic的类型名称的值用""空窜覆盖,并把值是生命周期设为0
			Cookie cookic_userneme = new Cookie("cookic_userneme","");
				cookic_userneme.setMaxAge(0);
			Cookie cookic_password = new Cookie("cookic_userneme","");
			cookic_password.setMaxAge(0);
	
		//将和之前存储到cookie中的用户名称和密码设置为�?把生命周期设置为0�?再响应请求的cookie域中覆盖之前�?
			response.addCookie(cookic_userneme);
			response.addCookie(cookic_password);
			
		//重定向到登陆页面
			response.sendRedirect(request.getContextPath()+"/login.jsp");
	}
	
	
	
	
	//用户登录
	public void login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();

		//获得输入的用户名和密�?
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		//对密码进行加�?
		//password = MD5Utils.md5(password);

		//将用户名和密码传递给service�?
		UserService service = new UserService();
		User user = null;
		try {
			user = service.login(username,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		//判断用户是否登录成功 user是否是null
		if(user!=null){
			//登录成功
			//***************判断用户是否勾�?了自动登�?****************
			String autoLogin = request.getParameter("autoLogin");
			if("true".equals(autoLogin)){
				//要自动登�?
				//创建存储用户名的cookie
				Cookie cookie_username = new Cookie("cookie_username",user.getUsername());
				cookie_username.setMaxAge(10*60);
				//创建存储密码的cookie
				Cookie cookie_password = new Cookie("cookie_password",user.getPassword());
				cookie_password.setMaxAge(10*60);

				response.addCookie(cookie_username);
				response.addCookie(cookie_password);

			}

			//***************************************************
			//将user对象存到session�?
			session.setAttribute("user", user);

			//重定向到首页
			response.sendRedirect(request.getContextPath()+"/index.jsp");
		}else{
			request.setAttribute("loginError", "用户名或密码错误");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
	}
}
