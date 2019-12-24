package com.servlet.login;
//在类中输入servlet用自己建的模板,覆盖类中所有内容
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;//此行代码是为了消除黄色!号
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1:获取用户和密码
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("用户名"+username);
		System.out.println("密码"+password);
		//2:从数据库中验证用户名和密码是否正确
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		System.out.println(runner);
		String sql = "select * from user where username=? and password=?";
		System.out.println(sql);
		User user = null;
		try {
		
			 user = runner.query(sql, new BeanHandler<User>(User.class), username,password);
			 System.out.println(user);
			 
			 String zcusername = request.getParameter("username");
			 String zcpassword = request.getParameter("password");				
			 String aainsertSql="insert into  user(username,password) values (?,?)";
			 runner.insert(aainsertSql, new BeanHandler<User>(User.class), zcusername,zcpassword);
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		//3:根据验证结果,给用户不同的显示信息
		if(user!=null){
			//表示登陆成功
			response.getWriter().write("ok");
		}else{
			//表示登陆失败
			response.getWriter().write("sorry your username or password is wrong");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
