package com.xiaohai19_2.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.xiaohai19_2.dbutils.c3p0Utils;




public class zzdao {
	//����ִ��sql���Ҫ����QueryRunner
	QueryRunner runner = new QueryRunner();
	//ִ��ת��ת������(ִ��sql�������,��menoy����)
	public void out(String outname,double zzdmoney) throws SQLException{
	//����c3p0Utils��������,�����߳����з�װ�õĻ�ȡ���Ӷ��󷽷�
	Connection conn = c3p0Utils.getCurrentConnection();
	String sql = "update zhuanzhang set money=money-? where name=?";
	runner.update(conn,sql, zzdmoney,outname);
	}
	
	
	public void in(String inname, double zzdmoney) throws SQLException{
		//����c3p0Utils��������,�����߳����з�װ�õĻ�ȡ���Ӷ��󷽷�
		Connection conn = c3p0Utils.getCurrentConnection();
		String sql = "update zhuanzhang set money=money+? where name=?";
		runner.update(conn, sql, zzdmoney,inname);
	}

}
