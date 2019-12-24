package com.xiaohai16.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class sessionServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;////此行代码是为了消除黄色!号.是序列号的意思

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		
		//演示获取sessionServlet类中,向session中储存的数据
		HttpSession session = request.getSession();
		Object attribute = session.getAttribute("name"); 
		response.getWriter().write(attribute + "" );
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
/*3．Session对象的生命周期（面试题/笔试题）
创建：第一次执行request.getSession()时创建
销毁：
1）服务器（非正常）关闭时
2）session过期/失效（默认30分钟）

问题：时间的起算点 从何时开始计算30分钟？
从不操作服务器端的资源开始计时

可以在工程的web.xml中进行配置
<session-config>
        <session-timeout>30</session-timeout>
</session-config>
3）手动销毁session
session.invalidate();
作用范围：
默认在一次会话中，也就是说在，一次会话中任何资源公用一个session对象
*/