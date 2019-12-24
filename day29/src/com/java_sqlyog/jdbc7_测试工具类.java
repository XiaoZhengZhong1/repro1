package com.java_sqlyog;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class jdbc7_测试工具类 {

	public static void main(String[] args) throws Exception {
		Connection con = jdbc6_工具类.getConnection();
		System.out.println(con);	
		PreparedStatement pst = con.prepareStatement("SELECT zname,money FROM zhangwu");
				ResultSet rs = pst.executeQuery();
				while(rs.next()){
				System.out.println(rs.getString("zname") + " " + rs.getDouble("money"));
				}
				jdbc6_工具类.close(con, pst, rs);	
	}

}
