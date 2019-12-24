package com.list;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.java_sqlyog.jdbc6_������;

public class list_sort {
	/*
	 
	 *  JDBC��ȡ���ݱ�sort,����һ��sort��,���г�Ա�����ͱ�������һ��.��sort����ÿ�����ݷ�װ��Sort��Ķ�����
	 //1:ʹ��JDBC������,ֱ�ӻ�ȡ���ݿ����Ӷ���
	//2:���ӻ�ȡ���ݿ�SQL���ִ���߶���
	//3:���ò�ѯ����,��ȡ�����
	//4:�������϶���
	//5:��ȡ��ÿ��������,��װ��Sort������
	//6:��װ��Sort����,�洢��������
	//7:����List����
	 */
	public static void main(String[] args) throws Exception {
		Connection con =jdbc6_������.getConnection();
		PreparedStatement pst = con.prepareStatement("SELECT * FROM sort");
		ResultSet rs = pst.executeQuery();
		List<Sort> list = new ArrayList<>();
		while(rs.next()){
Sort s = new Sort(rs.getInt("sid"),rs.getString("sname"),rs.getDouble("sprice"),rs.getString("sdesc"));
		list.add(s);
		
		}
		for (Sort s : list) {
			System.out.println(s);
		}
		jdbc6_������.close(con, pst, rs);
	}



}
