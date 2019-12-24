package DataSource;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

public class Demo2 {
/*###22BasicDataSource类的使用
连接池jar包中,定义好一个实现类数据源的规范接口javax.sql.DataSource的,实现类BasicDataSource*/
	public static void main(String[] args) {
	//1:创建java的DateSource接口的实现类对象.
		BasicDataSource ds = new BasicDataSource();
	//2:用对象中的setxxx方法,设置数据库的四条基本信息.
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/mybase2");
		ds.setUsername("root");
		ds.setPassword("123");
	//3:调用对象方法getConnertion()
		try {
			Connection con = ds.getConnection();
			System.out.println(con);
		} catch (SQLException e) {
			System.out.println(e);//打印异常原因是给开发人员看的,方便处理异常.
			throw new RuntimeException("数据库连接失败");//此提示是给客户看的
			}
	}
	

}
