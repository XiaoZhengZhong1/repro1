package com.xiaohai16.register;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.dbutils.QueryRunner;

public class register_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;////���д�����Ϊ��������ɫ!��.�����кŵ���˼

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1:��ȡ����---֮ǰ�������ַ����ķ���,��ȡ�����е��û���,����֮���,�ٰѻ�ȡ�Ĳ�����װ��javaBean���н��в���
		//request.getParameter("username");
		//request.getParameter("password");
		//2:��ɢװ�ı����ݷ�װ��javaBean����
		//User user = new User();
		//user.setUsername(username);
		//user.setUsername(password);
		
		
		//����ʹ��BeanUtils���߰������Զ�ӳ���װ
		//BeanUtils����ԭ��:��map�е�����,����key��ʵ�������(ָBean��)��Ӧ��ϵ��װ
		//ֻҪkey��������ʵ�����Ե�����һ��,���Զ���װ��ʵ����(Bean����)
	
		
		//���ע�����������������----���·���ֻ�����ڱ�post����(ʵ�ʿ���99%,����post�ύ,��Ϊ����)
		request.setCharacterEncoding("UTF-8");//��ʾ����UTF-8������������ַ���
		
		User user = new User();
		Map<String, String[]> properties = request.getParameterMap();
		
			try {
				BeanUtils.populate(user, properties);
			} catch (IllegalAccessException | InvocationTargetException e1) {
				
				e1.printStackTrace();
			}
		
			
		//���������λ��.uesr�����Ѿ���װ����
		//�ֶ���װ���е�uid----��װ��uuid----����������ظ���32Ϊ���ַ���----java�������ɺ���36λ
		//UUIDҲ��һ�����߰�,------��������ַ���
		user.setUid(UUID.randomUUID().toString());
		
		//3:���������ݸ�һ��ҵ���������(���Ǹ�����ķ���������)
		try {
			register(user);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		//�����淽�����ݲ���ִ�����,����Ϊ��ע��ɹ���,���ض�����߿ͻ���(��վ)��ת����½ҳ��
		//request.getContextPath()��ʾ��̬��ȡ��ǰtomcat�е�webӦ������(�Է�ֹ���Ʊ��ĺ�Java����Ŀ���Ʋ�һ��)
		response.sendRedirect(request.getContextPath() + "/login.jsp");
		
	}
	
	
	//дһ��ע�᷽��.�������ݿ�
	public void register(User user) throws Exception{
		//�������ݿ�
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "insert into user values(?,?,?,?,?,?,?,?,?,?)";
		
		runner.update(sql,user.getUid(),user.getUsername(),user.getPassword(),user.getName(),
				user.getEmail(),null,user.getBirthday(),user.getSex(),null,null);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}