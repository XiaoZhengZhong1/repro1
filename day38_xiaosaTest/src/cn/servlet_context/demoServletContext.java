package cn.servlet_context;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//本类所以内容都是重点!!!
public class demoServletContext extends HttpServlet {
	private static final long serialVersionUID = 1L;//此行代码是为了消除黄色!号
/*本类演示servletContext:它代表一整个web应用对象.对象内封装的是web应用信息,一个web应用只有一个servletContext对象.
 * servletcontext对象的生命周期
 * 1:随着web项目在服务端加载而创建
 * 2:随着服务器的关闭而销毁
 * */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1:servletContext对象怎么获取.this代表本web项目
		ServletContext st = this.getServletContext();
		System.out.println(st);
		
		/*2:servletContext对象的作用,一:获取web应用全局的初始化参数(前提是必须在web.xml中配置<context-param>)
		 * 一般做框架的时候用
		 * */
		String init = st.getInitParameter("driver");
		System.out.println(init);
		
		
		/*3:重点内容:::如何获取web应用中的任何资源的绝对路径(路径参数只针对tomcat中的webapps中)
		 * 演示获取本web项目中分别在项目不同文件目录下的a b c d 文件的绝对路径,用servletContext对象st获取
		 * */
		/*一:获取webcontent目录下的a.txt,绝对路径指的是带盘符的.因为web项目中的webcontent=webapps,就是所有web
		 * 项目都有webcontent目录,都和tomcat中的webapps是同步的,当项目发送到tomcat服务器,项目中的webcontent
		 * 目录就会被改为项目的名称(以区分不同)而加载到tomcat中的webapps目录中,所以在webapps中一打开先看到项目名称
		 * 打开项目就能看到项目中webcontent目录下的文件所以参数是("/a.txt");*/
		String a = st.getRealPath("a.txt");
		System.out.println(a);
/*C:\Users\肖振声\Desktop\apache-tomcat-7.0.52\apache-tomcat-7.0.52
 * \webapps\day37_WER13_servlet\a.txt*/
		
		//二:获取webcontent目录下的WEB-INF目录下的b.txt文件,
		String b = st.getRealPath("WEB-INF/a.txt");
		System.out.println(b);
		
		
   //二:获取src目录下的c.txt文件,(注意tomcat中没有src目录只有classes,里面装的是web项目中src目录中所以的class文件)
				String c = st.getRealPath("WEB-INF/classes/c.txt");
				System.out.println(c);
		
	
	
	/*另一种获取src(就是tomcat中classes目录下的)下的资源的方法就是类加载器方法,专门加载classes下的文件的
	 * getResource()参数中的路径是针对classes目录下的,直接写名称即可
	 * */
	String path = demoServletContext.class.getClassLoader().getResource("c.txt").getPath();
	System.out.println(path);
	
	
	
	/*重点内容2:ServletcContext是一个域对象,就是储存数据的区域叫域对象.
	 * 域对象的作用范围:整个web项目所有的web资源都可以,随意向ServletContext区域存取数据,数据共享
	 * 下面代码演示在本类中向ServletContext区域中存数据,在另一个类中向ServletContext区域取数据*/
			//表示向ServletContext区域对象st中存入一个名称=xiaolei
			st.setAttribute("name","xiaolei");
	
			/*域对象的通用方法
			 * 1:setAttribute(name,Object);	设置属性
			 * 2;getAttribute(name);		获取属性
			 * 3:romoveAttribute(name);		删除属性
			 * */
			
			
			
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}