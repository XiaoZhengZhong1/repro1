package com.java_sqlyog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class jdbc5_��ֹ���� {
//�ü���¼���½����������,¼���ֵƥ�������ݿ�Ĳ�ѯ���,��ѯ���ݿ�ļ�¼.
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");					//1:ע������
		String url = "jdbc:mysql://localhost:3306/mybase3";		//���Ӳ���������ʾ
		String user = "root";
		String password = "123";
		Connection con = DriverManager.getConnection(url, user, password);	//2:��ȡ����
		Scanner sc = new Scanner(System.in);	//��������¼�����
				String us = sc.nextLine();		//¼������
				String pa = sc.nextLine();		//¼������
		String sql = "SELECT * FROM users WHERE uname=? and upassword=?";//��?��ռλ��,ռ��ֵ��λ��.�ȴ�¼��
	//��ֹ����,�������ӻỰ�ӿ�Connection�е�prepareStateManat(sql)Ԥ���뷽��,����һ��Ԥ����ӿ�
		PreparedStatement pst = con.prepareStatement(sql);//3:��ȡsql���ִ�ж���.��ʾ��Ԥ���뷽������ƴд��sql��ѯ���
			pst.setObject(1, us);//��Ԥ����ӿ��������ָ����������,ָ����ƴд��sql����е�?��.��Ϊ����ľ���sql���
			pst.setObject(2, pa);//Ĭ�����ʺű����1,2,3...��ʾ������ָ�Ǽ���¼���ֵ
		ResultSet rs = pst.executeQuery();//4:��ʾ��Ԥ����ӿ��е�ִ�в�ѯ����ִ�в�ѯ���,û�в���.��Ϊ�����Ѿ��������
		System.out.println(rs.next());	//5:������
			rs.close();//6:����
			pst.close();
			sc.close();
	
	
	
	}

}
