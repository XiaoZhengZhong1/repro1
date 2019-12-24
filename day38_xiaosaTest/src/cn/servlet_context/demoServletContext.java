package cn.servlet_context;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//�����������ݶ����ص�!!!
public class demoServletContext extends HttpServlet {
	private static final long serialVersionUID = 1L;//���д�����Ϊ��������ɫ!��
/*������ʾservletContext:������һ����webӦ�ö���.�����ڷ�װ����webӦ����Ϣ,һ��webӦ��ֻ��һ��servletContext����.
 * servletcontext�������������
 * 1:����web��Ŀ�ڷ���˼��ض�����
 * 2:���ŷ������Ĺرն�����
 * */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1:servletContext������ô��ȡ.this����web��Ŀ
		ServletContext st = this.getServletContext();
		System.out.println(st);
		
		/*2:servletContext���������,һ:��ȡwebӦ��ȫ�ֵĳ�ʼ������(ǰ���Ǳ�����web.xml������<context-param>)
		 * һ������ܵ�ʱ����
		 * */
		String init = st.getInitParameter("driver");
		System.out.println(init);
		
		
		/*3:�ص�����:::��λ�ȡwebӦ���е��κ���Դ�ľ���·��(·������ֻ���tomcat�е�webapps��)
		 * ��ʾ��ȡ��web��Ŀ�зֱ�����Ŀ��ͬ�ļ�Ŀ¼�µ�a b c d �ļ��ľ���·��,��servletContext����st��ȡ
		 * */
		/*һ:��ȡwebcontentĿ¼�µ�a.txt,����·��ָ���Ǵ��̷���.��Ϊweb��Ŀ�е�webcontent=webapps,��������web
		 * ��Ŀ����webcontentĿ¼,����tomcat�е�webapps��ͬ����,����Ŀ���͵�tomcat������,��Ŀ�е�webcontent
		 * Ŀ¼�ͻᱻ��Ϊ��Ŀ������(�����ֲ�ͬ)�����ص�tomcat�е�webappsĿ¼��,������webapps��һ���ȿ�����Ŀ����
		 * ����Ŀ���ܿ�����Ŀ��webcontentĿ¼�µ��ļ����Բ�����("/a.txt");*/
		String a = st.getRealPath("a.txt");
		System.out.println(a);
/*C:\Users\Ф����\Desktop\apache-tomcat-7.0.52\apache-tomcat-7.0.52
 * \webapps\day37_WER13_servlet\a.txt*/
		
		//��:��ȡwebcontentĿ¼�µ�WEB-INFĿ¼�µ�b.txt�ļ�,
		String b = st.getRealPath("WEB-INF/a.txt");
		System.out.println(b);
		
		
   //��:��ȡsrcĿ¼�µ�c.txt�ļ�,(ע��tomcat��û��srcĿ¼ֻ��classes,����װ����web��Ŀ��srcĿ¼�����Ե�class�ļ�)
				String c = st.getRealPath("WEB-INF/classes/c.txt");
				System.out.println(c);
		
	
	
	/*��һ�ֻ�ȡsrc(����tomcat��classesĿ¼�µ�)�µ���Դ�ķ������������������,ר�ż���classes�µ��ļ���
	 * getResource()�����е�·�������classesĿ¼�µ�,ֱ��д���Ƽ���
	 * */
	String path = demoServletContext.class.getClassLoader().getResource("c.txt").getPath();
	System.out.println(path);
	
	
	
	/*�ص�����2:ServletcContext��һ�������,���Ǵ������ݵ�����������.
	 * ���������÷�Χ:����web��Ŀ���е�web��Դ������,������ServletContext�����ȡ����,���ݹ���
	 * ���������ʾ�ڱ�������ServletContext�����д�����,����һ��������ServletContext����ȡ����*/
			//��ʾ��ServletContext�������st�д���һ������=xiaolei
			st.setAttribute("name","xiaolei");
	
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