package com.java_sqlyog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jabc4_ע�빥�� {
/*
 * ###11SQLע�빥��
	* A: SQLע�빥��
		* a: ע������
			* �����е�¼����SQL�������:
			* SELECT * FROM �û��� WHERE NAME = �û�������û���  AND PASSWORD = �û��������;
			* ��ʱ�����û�������ȷ���˺�������󣬲�ѯ������Ϣ�����û���¼��
				���ǵ��û�������˺�ΪXXX ����Ϊ��XXX��  OR ��a�� =��aʱ��������ִ�еĴ����Ϊ��
				* SELECT * FROM �û��� WHERE NAME = ��XXX�� AND PASSWORD =�� XXX��  OR ��a��=��a��;
			* ��ʱ��������ѯ���ʱ��Զ���Բ�ѯ������ġ���ô�û���ֱ�ӵ�¼�ɹ��ˣ���Ȼ���ǲ�ϣ�����������Ľ���������SQLע�����⡣
 * */
	public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.jdbc.Driver");					//ע������
	String url = "jdbc:mysql://localhost:3306/mybase3";		//��������
	String user = "root";
	String password = "123";
	Connection con = DriverManager.getConnection(url, user, password);	//��ȡ����
	 Statement sta = con.createStatement();								//��ȡsql���ִ�ж���
	
	 
	 //ƴдsql��ѯ���,ģ��������½
//	 String sql = "SELECT * FROM users WHERE uname='Ф��' AND upassword='1'";
	//ƴдsql���ģ��ע�빥��
	 String sql2 = "SELECT * FROM users WHERE uname='asdf' AND upassword='1234' OR 1=1";
//	 ResultSet rs = sta.executeQuery(sql);
	ResultSet rs = sta.executeQuery(sql2); 	//����ƴд��sql2���,���������붼����,ע�빥����,��Ȼ���Ե�½�ɹ�
	System.out.println(rs.next());          //��ʾ���ִ�в�ѯ���Ľ��,��true˵����½�ɹ�
	    rs.close();
		sta.close();
		con.close();
	}

}
