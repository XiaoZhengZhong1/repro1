package com.servlet.login;
//����������servlet���Լ�����ģ��,����������������
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;//���д�����Ϊ��������ɫ!��
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1:��ȡ�û�������
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("�û���"+username);
		System.out.println("����"+password);
		//2:�����ݿ�����֤�û����������Ƿ���ȷ
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
		//3:������֤���,���û���ͬ����ʾ��Ϣ
		if(user!=null){
			//��ʾ��½�ɹ�
			response.getWriter().write("ok");
		}else{
			//��ʾ��½ʧ��
			response.getWriter().write("sorry your username or password is wrong");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
