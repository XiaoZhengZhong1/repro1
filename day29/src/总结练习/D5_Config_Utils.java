package 总结练习;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

//练习.写一个读取配置文件的工具类.
public class D5_Config_Utils {
	public static void main(String[] args) {
		//System.out.println(con);
	}
	private static Connection con;
	static{/*在静态代码块中1:读取配置文件,2:创建一个属性集对象,3:把文件资源流 加载到属性集中,4:获取属性集中的键对应的值,并赋值本类连接
			变量,5:用从配置资源中获取的值,注册驱动.6:用从资源流中获取的值,获取连接对象*/
		try{
		InputStream is = D5_Config_Utils.class.getClassLoader().getResourceAsStream("DBP");
		Properties pt = new Properties();
		pt.load(is);
		String dri = pt.getProperty("dri");
		String url = pt.getProperty("url");
		String user = pt.getProperty("user");
		String pas = pt.getProperty("pas");
		Class.forName(dri);
		con = DriverManager.getConnection(url, user, pas);
		}catch(Exception e){
			throw new RuntimeException("数据库连接失败");
		}
	}
	public static Connection getConnection(){
		return con;
	}
	}
