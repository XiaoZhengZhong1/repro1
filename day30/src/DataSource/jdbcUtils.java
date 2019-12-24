package DataSource;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

/*###23BasicDataSource类的常见配置
	* A: BasicDataSource类的常见配置
		* a: 常见配置
			分类	属性			描述
			必须项	
					driverClassName	数据库驱动名称
					url				数据库的地址
					username		用户名
					password		密码
			基本项（扩展）	
					maxActive		最大连接数量
					minIdle			最小空闲连接
					maxIdle 		最大空闲连接
					initialSize		初始化连接

			
###24实现数据库连接池工具类
	* A: 实现数据库连接池工具类
		* a: 案例代码
			/*
			 *  使用DBCP实现数据库的连接池
			 *  连接池配置,自定义类,
			 *  最基本四项完整
			 *  对于数据库连接池其他配置,自定义*/
public class jdbcUtils {
//一般做工具类,都是用静态的,包括封装对象,和获取对象,还有给对象添加信息也可以放在静态代码块中.
	private static BasicDataSource bds = new BasicDataSource();
		static{
			bds.setDriverClassName("com.mysql.jdbc.Driver");
			bds.setUrl("jdbc:mysql://localhost:3306/mybase3");
			bds.setUsername("root");
			bds.setPassword("123");
			
			bds.setInitialSize(10);
			bds.setMaxActive(8);
			bds.setMaxIdle(5);
			bds.setMinIdle(1);
		}
	public static DataSource getBds() {
		return bds;
	}

	
	
}
