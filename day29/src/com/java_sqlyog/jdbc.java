package com.java_sqlyog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.jdbc.Driver;

/*
 ###04JDBC的开发步骤
	* A: JDBC的开发步骤
		* a: 步骤介绍
			1.注册驱动
				告知JVM使用的是哪一个数据库的驱动
			2.获得连接
				使用JDBC中的类,完成对MySQL数据库的连接
			3.获得语句执行平台
				通过连接对象获取对SQL语句的执行者对象
			4.执行sql语句
				使用执行者对象,向数据库执行SQL语句
				获取到数据库的执行后的结果
			5.处理结果
			6.释放资源  一堆close()
 * */
public class jdbc {
	public static void main(String[] agrs) throws ClassNotFoundException, SQLException {	
	//1:注册驱动,---用反射技术,将驱动加载到内存(而不是自己new对象)
/*使用java.sql的DriverManage(驱动管理)类的静态方法registerDriver(Driver driver)注册给定驱动方法.
	方法参数中的Driver是一个接口,所有的SQL数据库厂商都必须在提供的驱动jar包中实现这个接口,然后在eclipse中在jar包生成引用类中会有
Driver.class文件,说明它实现了Driver接口,名称重复是方便识别,所以就可以在参数中new Driver();*/
	//	DriverManager.registerDriver(new Driver());
	/*在选中Driver按f3查看数据库厂商写的原代码发现,在继承java.sql.Driver
	后在方法中写了一个静态代码块.在静态代码块中new Driver(),在之前学过静态代码块一般是用于程序驱动的,会随着类的加载而执行一次
	所以如果我们在调用类方法的时候原静态代码块就已经new了一个,不需要我们自己new*/
	//所以我们应该用反射来调用Class.forName方法获取类的class名称,就启动了该类.类中静态代码块执行,就new了一个对象.
//1:注册驱动,---用反射技术,将驱动加载到内存(而不是自己new对象)
		Class.forName("com.mysql.jdbc.Driver");//注意,字节码文件一定要写全名, 包名.类名  在jar包中和Driver原码中都能看到
	
/*2:获得连接,还是用DriverManager类中的静态方法,getConnection(String url,String user,String password);给定连接方法,
	返回的是Connection接口的实现类,查看API此接口是连接数据库会话接口*/

//获得连接就是获得会话窗口对象,		
						  //注意这里3306后面是一个/    /后面跟的是自己建的准备在java中使用的库
	String url = "jdbc:mysql://localhost:3306/mybase3";//固定格式分别是,数据库地址,主机地址,端口号,要使用的自建数据库名
	String username = "root";	//用户名	(mysql连接界面可见)
	String password = "123";		//密码     (mysql连接界面可见)
      Connection con = DriverManager.getConnection(url, username, password);
      	System.out.println(con);	//运行后没报错有结果说明连接成功.
	//Run as: com.mysql.jdbc.JDBC4Connection@14f1c67

 //3.获得语句执行平台.通过数据连接对象 con 调用createStatement()方法,返回一个执行SQL语句的接口Statement对象(对象有mysql驱动实现)
      	       Statement sta = con.createStatement();
      	       System.out.println(sta);
      	       
 /*4.执行sql语句.通过语句执行对象 sta 调用statement接口的实现类中的executeUpdate(String sql);方法.该方法功能是执行给定SQL语句
   返回的 是一个int 表示执行成功多少行.(只能执行返回结果是int的比喻insert intto 增加多少条 ,delete删除多少条,update更新多少条)
   */   	       
      	 int row = sta.executeUpdate("INSERT INTO sort(sname,sprice,sdesc) VALUES ('手机',999,'降价原因搞活动')");
      	 	System.out.println(row);	/*运行输出 1 表示一条SQL语句执行成功,在mysql数据库中刷新,就能看到mybase3库中
      	 	rost数据表中,多了一个条 手机 商品记录,表示在eclipse中java执行的结果成功显示在SQL中*/
	
	//5.处理结果 ----增 删 改 ,不需要处理结果.
      	 	
   //6.释放资源  一堆close() 	 	
      	 	sta.close();
      	 	con.close();
	}
}
