package junit;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.itheima.mybatis.pojo.User;

public class MybatisFisetTest {
	@Test
	//架构入门测试
	public void testMybatis() throws Exception {
		//1:加载核心配置文件(配置文件中有数据库连接配置),先定义配置文件,再获取加载
		String resource = "sqlMapConfig.xml";
		//用io流获取核心配置文件
		InputStream in = Resources.getResourceAsStream(resource);
		
		//2:创建工厂----创建参数中传入核心配置文件中的表文件,以流的类型传递---相当于给工厂材料,让工厂加工出对象
		//工厂生产出来的对象能操作数据库执行sql语句是因为创建对象的参数的in流中有核心配置文件的数据库连接配置
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		
		//3:创建sqlSession(就是使用打开上面工厂生产的sqlSessionFactory)
		 SqlSession openSession = sqlSessionFactory.openSession();
		
		 //4:执行sql语句
		//工厂生产出来的对象能操作数据库执行sql语句是因为创建对象的参数的in流中有核心配置文件的数据库连接配置
		 
		 Object user = openSession.selectOne("test1.findUserById", 10);
		 System.out.println(user);
	
	}
	
	
	
	//二:myBatis框架演示,根据用户姓名模糊查询.查询名字中带 五 的  因为可能有多个名字带五的 所以用selectList
	@Test
	public  void findUserByusername() throws IOException{
		String resource = "sqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSession = new SqlSessionFactoryBuilder().build(in);
		SqlSession openSession = sqlSession.openSession();
		List<User> selectList = openSession.selectList("test1.findUserByusername", "五");
		System.out.println(selectList);
	
	}
	
	//三:myBatis框架演示User表添加用户
	@Test
	public void insertUser() throws IOException{
		String resource = "sqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSession = new SqlSessionFactoryBuilder().build(in);
		SqlSession openSession = sqlSession.openSession();
		//因为是添加用户,User.xml配置文件中是传参的,所以要在此处接收设置
		User user = new User();
		user.setUsername("肖海");
		user.setSex("男");
		user.setBirthday(new Date());
		user.setAddress("aaaaaaaaaa");
		int insert = openSession.insert("test1.insertUser", user);
		//因为核心配置文件中.配置了事务,所以要开启事务
		openSession.commit();
		//System.out.println(insert);
		//打印添加用户生成的最新id
		System.out.println(user.getId());
	}
	
	
	//四:myBatis框架演示User表更新操作
		/*@Test
		public void updateUser() throws IOException{
			String resource = "sqlMapConfig.xml";
			InputStream in = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSession = new SqlSessionFactoryBuilder().build(in);
			SqlSession openSession = sqlSession.openSession();
			//因为是更新用户,User.xml配置文件中是传参的,所以要在此处接收设置
			User user = new User();
			user.setId(27);
			user.setUsername("肖海");
			user.setSex("男");
			user.setBirthday(new Date());
			user.setAddress("aaaaaaaaaa");
			//因为核心配置文件中.配置了事务,所以要开启事务
			int update = openSession.update("test1.updateUserById",user);
			openSession.commit();
			System.out.println(update);
			
		}*/
		
		//五:myBatis框架演示User表删除操作
				@Test
				public void deleteUser() throws IOException{
					String resource = "sqlMapConfig.xml";
					InputStream in = Resources.getResourceAsStream(resource);
					SqlSessionFactory sqlSession = new SqlSessionFactoryBuilder().build(in);
					SqlSession openSession = sqlSession.openSession();
					int delete = openSession.delete("test1.deleteUserById",33);
					openSession.commit();

				}
		
		
		
	
}
