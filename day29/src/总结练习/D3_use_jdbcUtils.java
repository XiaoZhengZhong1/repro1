package �ܽ���ϰ;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class D3_use_jdbcUtils {
//ʹ��һ��,�������ݿ����Ӷ��󹤾���
	public static void main(String[] args) throws Exception {
	Connection	con = D2_jdbc_utils.getConnection();//���ù������ȡ
	PreparedStatement pst = con.prepareStatement("SELECT sname FROM student");
	ResultSet rs = pst.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString("sname"));
			}
	con.close();
	}

}
