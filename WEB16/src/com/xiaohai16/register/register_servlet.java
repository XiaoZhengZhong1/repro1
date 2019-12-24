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
	private static final long serialVersionUID = 1L;////此行代码是为了消除黄色!号.是序列号的意思

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1:获取数据---之前是用这种繁琐的方法,获取请求中的用户名,密码之类的,再把获取的参数封装到javaBean类中进行操作
		//request.getParameter("username");
		//request.getParameter("password");
		//2:将散装的表单数据封装到javaBean类中
		//User user = new User();
		//user.setUsername(username);
		//user.setUsername(password);
		
		
		//现在使用BeanUtils工具包进行自动映射封装
		//BeanUtils工作原理:将map中的数据,根据key与实体的属性(指Bean类)对应关系封装
		//只要key的名字与实体属性的名字一样,就自动封装到实体中(Bean类中)
	
		
		//解决注册表单中中文乱码问题----以下方法只适用于表单post方法(实际开发99%,都是post提交,因为方便)
		request.setCharacterEncoding("UTF-8");//表示用用UTF-8编码编译请求字符集
		
		User user = new User();
		Map<String, String[]> properties = request.getParameterMap();
		
			try {
				BeanUtils.populate(user, properties);
			} catch (IllegalAccessException | InvocationTargetException e1) {
				
				e1.printStackTrace();
			}
		
			
		//到现在这个位置.uesr对象已经封装好了
		//手动封装表单中的uid----封装成uuid----就是随机不重复的32为的字符串----java代码生成后是36位
		//UUID也是一个工具包,------生成随机字符串
		user.setUid(UUID.randomUUID().toString());
		
		//3:将参数传递给一个业务操作方法(就是给下面的方法传参数)
		try {
			register(user);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		//当下面方法传递参数执行完后,先认为是注册成功了,用重定向告诉客户端(网站)跳转到登陆页面
		//request.getContextPath()表示动态获取当前tomcat中的web应用名称(以防止名称被改和Java中项目名称不一致)
		response.sendRedirect(request.getContextPath() + "/login.jsp");
		
	}
	
	
	//写一个注册方法.操作数据库
	public void register(User user) throws Exception{
		//操作数据库
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