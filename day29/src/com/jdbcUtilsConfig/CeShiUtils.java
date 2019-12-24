package com.jdbcUtilsConfig;
//测试读取配置文件,连接数据库的工具类,是否能获得连接对象
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.java_sqlyog.jdbc6_工具类;


public class CeShiUtils {

	public static void main(String[] args) throws Exception {
		Connection con = readUtilsConfig.getConnection();
			System.out.println(con);//能打印出结果,说明数据库连接成功
	
	
//实验以下,在配置文件中更改爱护就库名称,看是否能读取成功.
	 PreparedStatement pst = con.prepareStatement("SELECT uname FROM u ");
	 	ResultSet rs = pst.executeQuery();
	 		while(rs.next()){				//注意一定要先遍历才有结果输出,不能直接输出结果
	 		System.out.println(rs.getString("uname"));
	 		}
	 		jdbc6_工具类.close(con, pst, rs);//调用工具类关流
	}

}
