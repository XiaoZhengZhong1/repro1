package com.xiaohai.web;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.mail.internet.AddressException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;
import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
import com.xiaohai.commonsUtils.CommonsUtils;
import com.xiaohai.domain.User;
import com.xiaohai.service.UserService;
import com.xiaohai.utils.MailUtils;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;////���д�����Ϊ��������ɫ!��.�����кŵ���˼

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		//1:��ȡҳ���û��ĵ�½�������������
		Map<String, String[]> properties = request.getParameterMap();
		//2:��װɢװ����(�������ݿ��е�,���û���½ҳ��û��,Ϊ�˴�ҳ���ȡ���ֶε�˳����ֶ����ݺ����ݿ�һ��,�÷�װ)
		User user = new User();
		try {
			
			
			//����ҳ����յ��������ַ���,ת��date����,��ӳ���װ��User��,��Ϊ���ݿ���������date��
			//�Լ�ָ��һ������ת��������Stringת��Date��
			ConvertUtils.register(new Converter() {
				@Override
				public Object convert(Class clazz, Object value) {
					//��stringת��date
					SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
					Date parse = null;
					try {
						try {
							parse = format.parse(value.toString());
						} catch (java.text.ParseException e) {
							
							e.printStackTrace();
						}
					} catch (ParseException e) {
						e.printStackTrace();
					}
					return parse;
				}
			}, Date.class);
			
			//ӳ���װ
			BeanUtils.populate(user, properties);
		} catch (IllegalAccessException | InvocationTargetException e) {
			
			e.printStackTrace();
		} 
		
		//private String uid;
				user.setUid(CommonsUtils.getUUID());
				//private String telephone;
				user.setTelephone(null);
				//private int state;//�Ƿ񼤻�
				user.setState(0);
				//private String code;//������
				String activeCode = CommonsUtils.getUUID();
				user.setCode(activeCode);
		
				
		//3:����ܹ�����ע�᷽��
				UserService service = new UserService();
				boolean isRegisterSuccess = false;
				
					 isRegisterSuccess = service.login(user);
				
					
			
				
				//�ж��Ƿ�ע��ɹ�
				if(isRegisterSuccess){
					
					//���ͼ����ʼ�
					String emailMsg = "��ϲ��ע��ɹ���������������ӽ��м����˻�"
							+ "<a href='http://localhost:8080/WEB28_1/active?activeCode="+activeCode+"'>"
									+ "http://localhost:8080/WEB28_1/active?activeCode="+activeCode+"</a>";
					
						
							try {
								MailUtils.sendMail(user.getEmail(), emailMsg);
							} catch (javax.mail.MessagingException e) {
								
								e.printStackTrace();
							}
						
						
					//��ʾע��ɹ�.�ض��򵽳ɹ�ҳ��
					response.sendRedirect(request.getContextPath()+"/registerSuccess.jsp");
					
				}else{
					//��ע��ʧ��,�ض���ע��ʧ��ҳ��
					response.sendRedirect(request.getContextPath()+"/registerFail.jsp");

				}
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}