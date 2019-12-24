package 总结练习;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class D1_数据库连接的6个步骤 {

	public static void main(String[] args) throws Exception {
//总结练习数据库连接
		Class.forName("com.mysql.jdbc.Driver");		//1:注册驱动.
		String url = "jdbc:mysql://localhost:3306/mybase2";//显示赋值
		String user = "root";
		String password = "123";
		Connection con = DriverManager.getConnection(url, user,password);	//2:获取连接,返回连接接口
		System.out.println(con);	//验证是否连接成功
		String sql = "SELECT * FROM u ";	//拼写sql语句.查询u表私有记录
		PreparedStatement pst = con.prepareStatement(sql);//3:获取SQL语句执行对象.(防止攻击是预编译接口),返回预编译接口	
		System.out.println(pst);
		ResultSet rs = pst.executeQuery();//4:执行SQL语句,返回结果集接口(用预编译接口preparedStatement中的执行方法)
		while(rs.next()){	//5:处理结果,遍历结果
		System.out.println(rs.getObject("uid") + " " + rs.getObject("uname") + " " + rs.getObject("uaddress"));
		}
		
//再演示一个数据库更新Update
		String sql2 = "UPDATE u SET uname=? WHERE uid=?;";//用?号占位符,防止攻击.在预编译中用SetObject()方法赋值
		PreparedStatement pst2 = con.prepareStatement(sql2);
			pst2.setObject(1, "xzz");//给占位符赋值,小括号中1是问好编号,xzz是值
			pst2.setObject(2, 1);
			int rs2 = pst2.executeUpdate();//注意,增删改,的返回结果是int表示执行成功多少条sql语句
			System.out.println(rs2);		
		
		rs.close();//6:关流
		pst.close();
		con.close();
	}

}
