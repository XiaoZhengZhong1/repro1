package com.jdbcUtilsConfig;
//���Զ�ȡ�����ļ�,�������ݿ�Ĺ�����,�Ƿ��ܻ�����Ӷ���
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.java_sqlyog.jdbc6_������;


public class CeShiUtils {

	public static void main(String[] args) throws Exception {
		Connection con = readUtilsConfig.getConnection();
			System.out.println(con);//�ܴ�ӡ�����,˵�����ݿ����ӳɹ�
	
	
//ʵ������,�������ļ��и��İ����Ϳ�����,���Ƿ��ܶ�ȡ�ɹ�.
	 PreparedStatement pst = con.prepareStatement("SELECT uname FROM u ");
	 	ResultSet rs = pst.executeQuery();
	 		while(rs.next()){				//ע��һ��Ҫ�ȱ������н�����,����ֱ��������
	 		System.out.println(rs.getString("uname"));
	 		}
	 		jdbc6_������.close(con, pst, rs);//���ù��������
	}

}
