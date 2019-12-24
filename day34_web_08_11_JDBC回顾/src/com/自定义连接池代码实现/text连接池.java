package com.自定义连接池代码实现;
import java.sql.PreparedStatement;
import java.sql.Connection;

public class text连接池 {
		
	public static void main(String[] args) {
	linkedlist连接池 pool2 = new linkedlist连接池();
		Connection conn = null;
		PreparedStatement sta;
		try {
			conn = pool2.getConnection();
			System.out.println(conn);
			 String sql = "insert into day1 values(null,?)";
			sta = conn.prepareStatement(sql);
			sta.setString(1, "我");
			int rows = sta.executeUpdate();
			if(rows>0){
				System.out.println("添加成功");
			}else{
				System.out.println("添加失败");
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}finally{
			pool2.backCon(conn);
		}
	}

}
