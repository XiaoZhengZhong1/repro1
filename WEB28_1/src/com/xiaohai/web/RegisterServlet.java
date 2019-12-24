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
	private static final long serialVersionUID = 1L;////此行代码是为了消除黄色!号.是序列号的意思

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		//1:获取页面用户的登陆请求的所有数据
		Map<String, String[]> properties = request.getParameterMap();
		//2:封装散装数据(就是数据库有的,而用户登陆页面没有,为了从页面获取的字段的顺序和字段内容和数据库一致,好封装)
		User user = new User();
		try {
			
			
			//将从页面接收到的日期字符串,转成date类型,再映射封装到User中,因为数据库中日期是date型
			//自己指定一个类型转换器（将String转成Date）
			ConvertUtils.register(new Converter() {
				@Override
				public Object convert(Class clazz, Object value) {
					//将string转成date
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
			
			//映射封装
			BeanUtils.populate(user, properties);
		} catch (IllegalAccessException | InvocationTargetException e) {
			
			e.printStackTrace();
		} 
		
		//private String uid;
				user.setUid(CommonsUtils.getUUID());
				//private String telephone;
				user.setTelephone(null);
				//private int state;//是否激活
				user.setState(0);
				//private String code;//激活码
				String activeCode = CommonsUtils.getUUID();
				user.setCode(activeCode);
		
				
		//3:三层架构调用注册方法
				UserService service = new UserService();
				boolean isRegisterSuccess = false;
				
					 isRegisterSuccess = service.login(user);
				
					
			
				
				//判断是否注册成功
				if(isRegisterSuccess){
					
					//发送激活邮件
					String emailMsg = "恭喜您注册成功，请点击下面的连接进行激活账户"
							+ "<a href='http://localhost:8080/WEB28_1/active?activeCode="+activeCode+"'>"
									+ "http://localhost:8080/WEB28_1/active?activeCode="+activeCode+"</a>";
					
						
							try {
								MailUtils.sendMail(user.getEmail(), emailMsg);
							} catch (javax.mail.MessagingException e) {
								
								e.printStackTrace();
							}
						
						
					//表示注册成功.重定向到成功页面
					response.sendRedirect(request.getContextPath()+"/registerSuccess.jsp");
					
				}else{
					//表注册失败,重定向到注册失败页面
					response.sendRedirect(request.getContextPath()+"/registerFail.jsp");

				}
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}