package 总结练习;

import java.sql.Connection;

public class D6_CeShi_ConfigJDBCUtils {
//测试D5_Config_Utils类中写的连接配置文件代码
	public static void main(String[] args) {
		Connection con = D5_Config_Utils.getConnection();
		System.out.println(con);
	}

}
