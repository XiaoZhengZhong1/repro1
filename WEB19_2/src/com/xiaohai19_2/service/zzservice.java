package com.xiaohai19_2.service;

import java.sql.Connection;
import java.sql.SQLException;

import com.xiaohai19_2.dao.zzdao;
import com.xiaohai19_2.dbutils.c3p0Utils;

public class zzservice {

	public boolean zzservice(String outname, String inname, double zzdmoney) {
	//ҵ������dao���ת�˷���,��dao�㵽���ݿ�ִ��sql��������ת��ҵ��
	
	//����Ҫ��ҵ���ִ�����ݿ������� �ع� �ύ  ����ִ�������con�����dao��ִ��sql����conһ��,����Ҫ�ڱ����ȡcon,
		Connection conn = c3p0Utils.getConnection();;
		
		//�ڱ��ഴ��dao�����,�ٵ��÷���,���û������д���dao��.
		 zzdao zzd = new zzdao();
		
		//����һ��boolean�͵ı���Ϊtrue.�ó���������,��try�����catch�ж���Ϊfalse,��ʾִ�����ݿ�Ĳ���������
		boolean boo = true;
		 try {
			 	//conn = c3p0Utils.getConnection();
			 	//��������(������boolean��   ��˼���Ƿ��Զ��ύ   false��ʾ���Զ��ύ   �����ֶ��ύconn.commit();)
			 	System.out.println("--------------------------11"+conn+"-"+outname+"-"+zzdmoney);			   
			 	//����c3p0Utils��������,�����߳����з�װ�õĿ������񷽷�
			 	c3p0Utils.startTransaction();
			 	zzd.out(outname,zzdmoney);
			 	zzd.in(inname,zzdmoney);
		 } catch (Exception e) {
				try {
					boo = false;
					//����c3p0Utils��������,�����߳����з�װ�õĻع����񷽷�
					c3p0Utils.rollback();
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
				e.printStackTrace();
			}finally{
				try {
					//����c3p0Utils��������,�����߳����з�װ�õ��ύ���񷽷�,����finally�б�ʾ����ִ���ύ����
					c3p0Utils.commit();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
			
	return boo;
	
	}



}
