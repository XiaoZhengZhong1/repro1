package com.java_sqlyog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class text1_ռλ�� {

	public static void main(String[] args) throws Exception {
//��ռλ�� ? ��ʾ�������ݿ�,ָ����¼��Ϣ.
	Class.forName("com.mysql.jdbc.Driver");//1:ע������
	String url = "jdbc:mysql://localhost:3306/mybase3";
	String user = "root";
	String password = "123";
	Connection con = DriverManager.getConnection(url, user, password);//2:��ȡ����
	String sql = "UPDATE sort SET sname=?,sprice=? WHERE sid=?";//ƴдSQL�������,��?��ռλ������ֵ
	PreparedStatement pst = con.prepareStatement(sql);//3:��ȡִ��sql������,����Ԥ����ӿ�
		pst.setObject(1, "�緹��");//����ռλ���ı������ռλ����ֵ
		pst.setObject(2,325);
		pst.setObject(3, 4);
		pst.executeUpdate();//4:ִ��sql���.��Ԥ����ӿ��е�ִ�з���ִ��sql�������
	
		pst.close();//6:����
		con.close();
	
	}

}
