package com.servletssss.logon;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;

import com.servlet.login.c3p0Utils;

public class logon extends HttpServlet {
	private static final long serialVersionUID = 1L;//���д�����Ϊ��������ɫ!��.�����кŵ���˼
    public logon() {
        super();
    }
    /*����Ϊ��ʾ��ϰ:��Ŀ����,�û�ע��,��½,��html,����servlet��,��������,��Ӧ,����SQL���ݿ�(c3p0,mysql),
     * ��ѯsql���(DBUtils),��½���������ݿ��ѯ����������ж�,�Ƿ�Ϊ��,�������Ӧ*/
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		//Ҫ��:дһ��ע���.����ӵ����ݿ�
		//��Ŀ����:�ȴ����:1:����web.xml��c3p0-config.xml,��Ҫdom4j����jar��
		//2:���ӷ�������Ҫservlet-api.jar
		//3:�������ݿ���Ҫ:c3p0-0.9.12.jar,��c3p0-config.xml�����ļ�.��mysql-Connection����jar��.
		//4:ִ�����ݿ������Ҫdbutils��������jar��pool.�ܼ�6��jarbao
		
		//����ʵ�ֲ���
		/*:1:�����,��������Ҫ��6����.����������ĿWebContectĿ¼�µ�WEB-INFĿ¼�µ�libĿ¼��,����ӵ��������
		 * 2:����Ŀ��webContentĿ¼�д���zhuce.htmlע������ı�,�ı�����תaction="/logon",��Ϊ���ഴ��
		 * ʱ,url-pattern��Ҳ/logon.���Ա���һ��
		 * 3:�ڱ����ȡ�û�������
		 * 4:���û���������ӵ����ݿ�
		 * 5:��֤�Ƿ񴴽��ɹ�
		 * 6:������֤,��Ӧ���û���ӳɹ�����ʧ�ܵ���Ϣ
		 * */
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//2�ڱ����ȡ�û�������
		String paramName = request.getParameter("username");
		String paramPassword = request.getParameter("password");
		String paramEmail = request.getParameter("email");
		
		
		//3:���û���������ӵ����ݿ�
		QueryRunner qr = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "insert into user(username,password,email) values (?,?,?)";
		
		//4:��֤�Ƿ񴴽��ɹ�
		try {
			int rows = qr.update(sql,paramName,paramPassword,paramEmail );
			if(rows>0){
				response.getWriter().write("deng lu cheng gong");
			}else{
				response.getWriter().write("deng lu shi bai");
			}
		} catch (SQLException e) {
			
			throw new RuntimeException(e);
		}
		
	}

}
