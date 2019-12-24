package cn.servlet_context;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//�ص�����2:ServletcContext��һ�������,
public class demoServletContext2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
	/*�ص�����2:ServletcContext��һ�������,���Ǵ������ݵ�����������.
	 * ���������÷�Χ:����web��Ŀ���е�web��Դ������,������ServletContext�����ȡ����,���ݹ���
	 * ���������ʾ�ڱ�������ServletContext������ȡ����,����һ��������ServletContext���������*/
		 String attribute = (String) this.getServletContext().getAttribute("name");
			System.out.println(attribute);
	
			/*������ͨ�÷���
			 * 1:setAttribute(name,Object);	��������
			 * 2;getAttribute(name);		��ȡ����
			 * 3:romoveAttribute(name);		ɾ������
			 * */
	
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}