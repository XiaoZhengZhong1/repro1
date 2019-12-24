package com.xiaohai19_2.service;

import java.sql.Connection;
import java.sql.SQLException;

import com.xiaohai19_2.dao.zzdao;
import com.xiaohai19_2.dbutils.c3p0Utils;

public class zzservice {

	public boolean zzservice(String outname, String inname, double zzdmoney) {
	//业务层调用dao层的转账方法,由dao层到数据库执行sql更新语句的转账业务
	
	//由于要在业务层执行数据库事务开启 回滚 提交  而且执行事务的con必须和dao层执行sql语句的con一致,所以要在本类获取con,
		Connection conn = c3p0Utils.getConnection();;
		
		//在本类创建dao层对象,再调用方法,把用户参数中传给dao层.
		 zzdao zzd = new zzdao();
		
		//定义一个boolean型的变量为true.让程序往下走,在try后面的catch中定义为false,表示执行数据库的操作有问题
		boolean boo = true;
		 try {
			 	//conn = c3p0Utils.getConnection();
			 	//开启事务(参数是boolean型   意思是是否自动提交   false表示不自动提交   而是手动提交conn.commit();)
			 	System.out.println("--------------------------11"+conn+"-"+outname+"-"+zzdmoney);			   
			 	//调用c3p0Utils工具类中,本地线程类中封装好的开启事务方法
			 	c3p0Utils.startTransaction();
			 	zzd.out(outname,zzdmoney);
			 	zzd.in(inname,zzdmoney);
		 } catch (Exception e) {
				try {
					boo = false;
					//调用c3p0Utils工具类中,本地线程类中封装好的回滚事务方法
					c3p0Utils.rollback();
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
				e.printStackTrace();
			}finally{
				try {
					//调用c3p0Utils工具类中,本地线程类中封装好的提交事务方法,放在finally中表示必须执行提交事务
					c3p0Utils.commit();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
			
	return boo;
	
	}



}
