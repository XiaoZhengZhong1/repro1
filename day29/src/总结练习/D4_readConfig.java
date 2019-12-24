package 总结练习;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;


public class D4_readConfig {
//读取配置文件.
	public static void main(String[] args) throws Exception {
	 InputStream is = D4_readConfig.class.getClassLoader().getResourceAsStream("DBP");/*1:用本类类名的class
		对象调用Class类中的获取加载器方法.再用加载器中的获取资源流方法,在参数中传入字符串配置文件名*/
		Properties pt = new Properties();	//2:创建永久属性集
				pt.load(is);				//3:用属性集合中加载方法,把文件资源流加载到集合
		String dri = pt.getProperty("dri");//4:用集合中获取流中键对应值的方法,给本类SQL连接变量赋值
		String url = pt.getProperty("url");
		String user = pt.getProperty("user");
		String pas = pt.getProperty("pas");
		Class.forName(dri);					//5:获取驱动,参数用属性集合从配置文件资源流中获取的值
		Connection con = DriverManager.getConnection(url, user, pas);//6:获取连接对象,参数是配置文件中获取的.
			System.out.println(con);								//7:输出有结果证明配置文件读取成功
			
	//获取SQL语句执行对象,执行sql语句
		PreparedStatement pst = con.prepareStatement("SELECT sname FROM student;");
		ResultSet rs = pst.executeQuery();	
		while(rs.next()){
			System.out.println(rs.getObject("sname"));
		}	
		rs.close();
		pst.close();
		con.close();
	}
	
}
