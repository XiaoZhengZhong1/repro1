package com.xiaohai16.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class sessionServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;////���д�����Ϊ��������ɫ!��.�����кŵ���˼

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		
		//��ʾ��ȡsessionServlet����,��session�д��������
		HttpSession session = request.getSession();
		Object attribute = session.getAttribute("name"); 
		response.getWriter().write(attribute + "" );
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
/*3��Session������������ڣ�������/�����⣩
��������һ��ִ��request.getSession()ʱ����
���٣�
1�������������������ر�ʱ
2��session����/ʧЧ��Ĭ��30���ӣ�

���⣺ʱ�������� �Ӻ�ʱ��ʼ����30���ӣ�
�Ӳ������������˵���Դ��ʼ��ʱ

�����ڹ��̵�web.xml�н�������
<session-config>
        <session-timeout>30</session-timeout>
</session-config>
3���ֶ�����session
session.invalidate();
���÷�Χ��
Ĭ����һ�λỰ�У�Ҳ����˵�ڣ�һ�λỰ���κ���Դ����һ��session����
*/