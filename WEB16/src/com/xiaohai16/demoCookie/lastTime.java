package com.xiaohai16.demoCookie;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class lastTime extends HttpServlet {
	private static final long serialVersionUID = 1L;////此行代码是为了消除黄色!号.是序列号的意思

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//做一个案例:演示用户第二次访问会在网站提示上次访问的数据
	
		//1:获取当前时间
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String current = sdf.format(date);
		//2::创建客户端cookie储存对象,记录当前毫秒值,封装到cookie中发送到客户端
		Cookie coo = new Cookie("time",current);
		//3:设置持久化
		coo.setMaxAge(60*10);
		//4:发送coo
		response.addCookie(coo);
		
		//5:获取客户端请求中携带的cookie
		Cookie[] cookies = request.getCookies();
		//如果请求中的cookie不是空,说明不是第一次访问本资源,就获取它上次的访问时间
		String currentTime = null;
		if(cookies!=null){
			for (Cookie cookie : cookies) {
				if("time".equals(cookie.getName())){
					 currentTime = cookie.getValue();
				}
			}
		}
		//6:根据获取的时间是否为空,向浏览器响应访问时间
		response.setContentType("text/html;charset=UTF-8");
		if(currentTime!=null){
			response.getWriter().write("您上次访问的时间是:" + currentTime);
		}else{
			response.getWriter().write("您是第一次访问");

		}
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}