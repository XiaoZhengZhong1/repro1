package com.java_sqlyog;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class jdbc7_���Թ����� {

	public static void main(String[] args) throws Exception {
		Connection con = jdbc6_������.getConnection();
		System.out.println(con);	
		PreparedStatement pst = con.prepareStatement("SELECT zname,money FROM zhangwu");
				ResultSet rs = pst.executeQuery();
				while(rs.next()){
				System.out.println(rs.getString("zname") + " " + rs.getDouble("money"));
				}
				jdbc6_������.close(con, pst, rs);	
	}

}
