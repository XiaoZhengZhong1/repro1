package 总结练习;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class D3_use_jdbcUtils {
//使用一下,建的数据库连接对象工具类
	public static void main(String[] args) throws Exception {
	Connection	con = D2_jdbc_utils.getConnection();//调用工具类获取
	PreparedStatement pst = con.prepareStatement("SELECT sname FROM student");
	ResultSet rs = pst.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString("sname"));
			}
	con.close();
	}

}
