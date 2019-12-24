package com.list;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.java_sqlyog.jdbc6_工具类;

public class list_sort {
	/*
	 
	 *  JDBC读取数据表sort,创建一个sort类,类中成员变量和表中列名一样.把sort表中每行数据封装到Sort类的对象中
	 //1:使用JDBC工具类,直接获取数据库连接对象
	//2:连接获取数据库SQL语句执行者对象
	//3:调用查询方法,获取结果集
	//4:创建集合对象
	//5:获取到每个列数据,封装到Sort对象中
	//6:封装的Sort对象,存储到集合中
	//7:遍历List集合
	 */
	public static void main(String[] args) throws Exception {
		Connection con =jdbc6_工具类.getConnection();
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
		jdbc6_工具类.close(con, pst, rs);
	}



}
