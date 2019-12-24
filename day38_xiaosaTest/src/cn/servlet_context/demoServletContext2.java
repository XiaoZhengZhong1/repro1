package cn.servlet_context;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//重点内容2:ServletcContext是一个域对象,
public class demoServletContext2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
	/*重点内容2:ServletcContext是一个域对象,就是储存数据的区域叫域对象.
	 * 域对象的作用范围:整个web项目所有的web资源都可以,随意向ServletContext区域存取数据,数据共享
	 * 下面代码演示在本类中向ServletContext区域中取数据,在另一个类中向ServletContext区域存数据*/
		 String attribute = (String) this.getServletContext().getAttribute("name");
			System.out.println(attribute);
	
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