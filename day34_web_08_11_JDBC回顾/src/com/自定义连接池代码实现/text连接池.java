package com.�Զ������ӳش���ʵ��;
import java.sql.PreparedStatement;
import java.sql.Connection;

public class text���ӳ� {
		
	public static void main(String[] args) {
	linkedlist���ӳ� pool2 = new linkedlist���ӳ�();
		Connection conn = null;
		PreparedStatement sta;
		try {
			conn = pool2.getConnection();
			System.out.println(conn);
			 String sql = "insert into day1 values(null,?)";
			sta = conn.prepareStatement(sql);
			sta.setString(1, "��");
			int rows = sta.executeUpdate();
			if(rows>0){
				System.out.println("��ӳɹ�");
			}else{
				System.out.println("���ʧ��");
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}finally{
			pool2.backCon(conn);
		}
	}

}
