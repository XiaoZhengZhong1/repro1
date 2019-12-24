package cn.itcast.gjp.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.dbcp.jdbcUtils;
import cn.itcast.gjp.domain.ZhangWu;

//实现对数据表gjp_ZhangWu,的增删改查操作.用dbUtils工具包中的QueryRunner对象,操作sql语句
public class ZhangWuDao {
	private  QueryRunner qr = new QueryRunner(jdbcUtils.getbds());//私有表示只在本类中,关联使用
	//从视图层,到控制层,到业务层,再到ZhangWu数据库层,都是一一关联的,1视图层操作的结果,实际上是由第4层数据库实现再一层层向说返回的
	
	
	/*定义方法,实现对账务的删除功能
	 * 实现思想
	 * 由业务层调用本类删除方法接收,并传递一个主键数据参数.再由本类连接数据库,拼写sql语句实现删除.返回结果
	 * */
	public void deleteZhangwu(int Zwid) {
		//拼写sql语句
		try {
		String sql = "DELETE  FROM gjp_zhangwu WHERE zwid=?";
			qr.update(sql,Zwid);
		} catch (SQLException e) {
			System.out.println(e);
			throw new RuntimeException("账务删除失败");
		}
	}
	
	
	/*定义方法,实现对账务的编辑功能
	 * 实现思想
	 * 接收用户录入数据信息,把信息封装成zhangwu对象.
	 * 本类方法由service业务层调用.并传递录入账务对象参数.实现数据库编辑.
	 * 
	 * */
	public void editZhangWu(ZhangWu zw){
		//拼写sql语句
		try{
		String sql = "UPDATE gjp_zhangwu SET flname=?,money=?,zhanghu=?,createtime=?,description=? WHERE zwid=?";
		Object[] params = {zw.getFlname(),zw.getMoney(),zw.getZhanghu(),zw.getCreatetime(),zw.getDescription(),zw.getZwid()};
		qr.update(sql, params);
		} catch (SQLException e) {
			System.out.println(e);
			throw new RuntimeException("编辑账务失败");
		}
	}	
	
	
	
	
	
	
	/*定义添加账务方法
	 * 本类方法业务层service调用,并传递zhangwu对象*/
	public void addZhangWu(ZhangWu zw){
		//拼写sql添加语句
		try {
  String sql = "INSERT INTO gjp_zhangwu(flname,money,zhanghu,createtime,description) VALUES (?,?,?,?,?)";
  Object[] params = {zw.getFlname(),zw.getMoney(),zw.getZhanghu(),zw.getCreatetime(),zw.getDescription()};
		qr.update(sql, params);
		} catch (SQLException e) {
			System.out.println(e);
		throw new RuntimeException("账务添加失败");
		}
	
	
	}
	

	
	
	
	
	public List<ZhangWu> select(String startDate, String endDate){
		try{
		String sql = "SELECT * FROM gjp_zhangwu WHERE createtime BETWEEN ? AND ?";
		Object[] obj = {startDate , endDate};
		 return  qr.query(sql,new BeanListHandler<>(ZhangWu.class),obj);
			} catch (SQLException e) {
			System.out.println(e);
			throw new RuntimeException("数据查询失败");
		}
	}
	
	/*定义方法,实现查询所有账务数据.此方法由业务层调用.查询的结果接处理,将所有的记录数据储存到Bean的对象中,再储存到List集合中*/
	public List<ZhangWu> selectAll(){
		String sql = "SELECT * FROM gjp_zhangwu";
		try {
		List<ZhangWu> list	= qr.query(sql, new BeanListHandler<>(ZhangWu.class));
		return list;
		} catch (SQLException e) {
		System.out.println(e);	
		throw new RuntimeException("查询所有账务失败");
		}
		
	}






	
}
