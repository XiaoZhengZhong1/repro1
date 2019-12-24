package textc3p0;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

import org.junit.Test;

//本类演示测试新键的c3p0连接池工具类
public class textC3P0Utils {
	Connection con;
	PreparedStatement sta;

	@Test
	public void textC3pUtils() {

		try {
			con = c3p0Utils.getConnection();
			String sql = "insert into day1 values(null,?)";
			PreparedStatement sta = con.prepareStatement(sql);
			sta.setString(1, "我5");
			int rows = sta.executeUpdate();
			sta.close();
			con.close();
			if(rows>0){
				System.out.println("添加成功");
			}else{
				System.out.println("添加失败");
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
