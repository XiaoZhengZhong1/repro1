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
	private static final long serialVersionUID = 1L;// //���д�����Ϊ��������ɫ!��.�����кŵ���˼

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");// ��ʾ����UTF-8������������ַ���
		//�ڱ��ύ֮ǰ�Ȼ�ȡ��֤��У��
		//1:��ȡҳ�����û������������֤��
		String CheckCode_client = request.getParameter("checkcode");
		//2:��ȡ����ԭʼ��֤��ͼƬ������
		String CheckCode_session = (String)request.getSession().getAttribute("checkcode_session");
		
		//3�Ա��û��������֤���ԭʼ��֤���Ƿ�һ��
		if(!CheckCode_session.equals(CheckCode_client)){
			//��ʾ����û��������֤���ԭ��֤�벻һ��,����ͻ��˴��������ʾ,��ת������½ҳ��
			request.setAttribute("logininfo","��֤�벻��ȷ");
			request.getRequestDispatcher("/login.jsp").forward(request,response);
			return;
		}
		
		
		// ���ע�����������������----���·���ֻ�����ڱ�post����(ʵ�ʿ���99%,����post�ύ,��Ϊ����)
		

		// 4:��ȡ�û���������
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		// 5:����һ��ҵ�񷽷����и��û���ѯ(ָ�����ݿ��ѯ)
		// �������淽�����ݲ���
		User us = null;//���������Ҫ����,�����ȳ�ʼ��
		try {
			us = login(username, password);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		//6:�Ե�ҵ�񷽷���ѯ���us�Ƿ�Ϊ��,���ж��û����������Ƿ���ȷ
		//��ʾ��½�ɹ�,�ÿͻ���(��վ),�ض���,��ת���̳���ҳ(������ʾ��̬��ȡ��ǰwebӦ������,��Ĭ�Ϸ���index.html)
		if(us!=null){
			
			response.sendRedirect(request.getContextPath());
		}else{
			//��ʾ�û����������ܴ���,��ʹ��ת��(��Ϊת��������request��,������),���ص���½ҳ��login.jsp
			//��request������д���"�û����������ܴ���"
			request.setAttribute("logininfo", "�û����������ܴ���");
			//ʹ��ת��ָ��ת����ַ������ת�������������Ӧ����---jsp���ǿ���Ƕ��java�����,���ܻ�ȡrequest�������Ϣ
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