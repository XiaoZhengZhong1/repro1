package com.xiaohai16.login;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.xiaohai16.register.User;
import com.xiaohai16.register.c3p0Utils;
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;// //此行代码是为了消除黄色!号.是序列号的意思

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");// 表示用用UTF-8编码编译请求字符集
		//在表单提交之前先获取验证码校验
		//1:获取页面中用户输入输入的验证码
		String CheckCode_client = request.getParameter("checkcode");
		//2:获取生成原始验证码图片的文字
		String CheckCode_session = (String)request.getSession().getAttribute("checkcode_session");
		
		//3对比用户输入的验证码和原始验证码是否一致
		if(!CheckCode_session.equals(CheckCode_client)){
			//表示如果用户输入的验证码和原验证码不一致,就向客户端存入错误提示,并转发到登陆页面
			request.setAttribute("logininfo","验证码不正确");
			request.getRequestDispatcher("/login.jsp").forward(request,response);
			return;
		}
		
		
		// 解决注册表单中中文乱码问题----以下方法只适用于表单post方法(实际开发99%,都是post提交,因为方便)
		

		// 4:获取用户名和密码
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		// 5:调用一个业务方法进行该用户查询(指到数据库查询)
		// 调用下面方法传递参数
		User us = null;//参数如果需要传递,必须先初始化
		try {
			us = login(username, password);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		//6:以到业务方法查询结果us是否为空,来判断用户名和密码是否正确
		//表示登陆成功,让客户端(网站),重定向,跳转到商城首页(参数表示动态获取当前web应用名称,会默认访问index.html)
		if(us!=null){
			
			response.sendRedirect(request.getContextPath());
		}else{
			//表示用户名或者秘密错误,就使用转发(因为转发可以往request中,存数据),跳回到登陆页面login.jsp
			//向request域对象中存入"用户名或者秘密错误"
			request.setAttribute("logininfo", "用户名或者秘密错误");
			//使用转发指定转发地址参数和转发本类请求和响应参数---jsp中是可以嵌套java代码的,就能获取request域对象信息
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
	}

	public User login(String username, String password) throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "select * from user where username=? and password=?";
		User user = runner.query(sql, new BeanHandler<User>(User.class),
				username, password);
		return user;

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}