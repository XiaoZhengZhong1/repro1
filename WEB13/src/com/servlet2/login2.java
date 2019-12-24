package com.servlet2;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

//���������ϰ:�û���������͵�½����,��ת��javaweb��Ŀ��,�������ݿ��ѯ,��֤����Ӧ������û��İ���
public class login2 extends HttpServlet {
	private static final long serialVersionUID = 1L;////���д�����Ϊ��������ɫ!��.�����кŵ���˼

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String paramName = request.getParameter("username");
		String paramPassword = request.getParameter("password");
		System.out.println("--------------------");
		System.out.println(paramName+"+"+paramPassword);
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "select * from user where username=? and password=?";
		try {
			User query = runner.query(sql, new BeanHandler<User>(User.class),paramName,paramPassword);
			if(query!=null){
				response.getWriter().write("loginOK");
			}else{
				response.getWriter().write("login????");
			}
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
			
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}