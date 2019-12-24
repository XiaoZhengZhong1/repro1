package com.xiaohai24.web;
import java.io.IOException;
import java.net.URLDecoder;
import java.sql.SQLException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xiaohai24.domain.User;
import com.xiaohai24.service.loginService;
public class AutoLoginFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		HttpSession session = req.getSession();
		
		//���cookie���û��������� ���е�¼�Ĳ���
		//����cookie_name
		String cookie_name = null;
		//����cookie_password
		String cookie_password = null;
		//���cookie
		Cookie[] cookies = req.getCookies();
		if(cookies!=null){
			for(Cookie cookie : cookies){
				//���������cookie_username��cookie_password
				if("cookie_name".equals(cookie.getName())){
					cookie_name = cookie.getValue();
					//�ָ������û���
					cookie_name = URLDecoder.decode(cookie_name, "UTF-8");
				}
				if("cookie_password".equals(cookie.getName())){
					cookie_password = cookie.getValue();
				}
			}
		}
		
		//�ж�username��password�Ƿ���null
		if(cookie_name!=null&&cookie_password!=null){
			//��¼�Ĵ���
			loginService service = new loginService();
			User user = null;
			try {
				 user = service.chenkLingon(cookie_name,cookie_password);			
				 } catch (SQLException e) {
				e.printStackTrace();
			}
			//����¼���û���user����浽session��
			session.setAttribute("user", user);
		}
		
		//����
		chain.doFilter(req, resp);
		
	}
	
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	@Override
	public void destroy() {
		
	}

	
	
}
