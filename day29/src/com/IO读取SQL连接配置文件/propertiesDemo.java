package com.IO读取SQL连接配置文件;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/*注意获取驱动和连接信息的配置文件一般都放在src中创建file
 * properties是一个持久的属性集.相当于是一个集合
 * 1:加载database.properties配置文件,用IO(就是用本类类字节码class对象propertiesDemo.class调用Class类中getClassLoader()
 * 获取加载器方法,再调用加载器中getResourceAsStream("database.properties")读取文件路径和资源的方法,读取参数中配置文件的信息)
 * 流读取配置文件中的键值对,储存到集合.
 * 2:从集合(指的是new properties()),
 * 3:以键值对方式获取数据库连接信息pro.load(Is);
 * 4:用属性集合中pro.getProperty()方法,获取属性集合中指定键(指配置文件在的键)对应的值,赋值到本类数据连接信息
 * 5:在本类完成注册驱动(用获取到的配置文件中的包名.类名的字节码对象)
 * 6:完成数据库连接
 *
 */
public class propertiesDemo {
	public static void main(String[] args) throws IOException, Exception {
	InputStream Is = propertiesDemo.class.getClassLoader().getResourceAsStream("database.properties");//1
		Properties pro = new Properties();//2
					pro.load(Is);//3
					String DriverClass = pro.getProperty("driverClass");//4
					String url = pro.getProperty("url");
					String user = pro.getProperty("user");
					String password = pro.getProperty("password");
					Class.forName(DriverClass);//5
	Connection con = DriverManager.getConnection(url, user, password);//6
	System.out.println(con);
	}
	
}
