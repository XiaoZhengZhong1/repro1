package 总结练习;

import java.sql.Connection;
import java.sql.DriverManager;
//把获取数据库连接对象,写成一个工具类.
public class D2_jdbc_utils {
	private static Connection con;
	static{
		try{
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/day28";
		String user = "root";
		String password = "123";
		 con = DriverManager.getConnection(url, user, password);//注意这里con不需要重新定义类型,上面已经定义了.
		 //注意工具类不能关流,不然调用工具类在加载类的时候,在获取到连接对象的时候同时也关闭了对象调用者拿到的是null对象
		}catch(Exception e){
			throw new RuntimeException("数据库连接失败");
		}
	}
	
	public static Connection getConnection(){
		return con;
	}
	
	

}
