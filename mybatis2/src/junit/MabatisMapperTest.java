package junit;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.itheima.mapper.OrderMapper;
import com.itheima.mapper.UserMapper;
import com.itheima.mybatis.pojo.QueryVo;
import com.itheima.mybatis.pojo.User;
import com.itheima.mybatis.pojo.orders;

public class MabatisMapperTest {
	//测试遵循了四个原则的接口,用工厂对象获取映射实例对象,在参数中传入接口的字节码.
	@Test
	public void testMapper() throws Exception {
		//1:加载核心配置文件(配置文件中有数据库连接配置),先定义配置文件,再获取加载
		String resource = "sqlMapConfig.xml";
		//用io流获取核心配置文件
		InputStream in = Resources.getResourceAsStream(resource);
		//2:创建工厂----创建参数中传入核心配置文件中的表文件,以流的类型传递---相当于给工厂材料,让工厂加工出对象
		//工厂生产出来的对象能操作数据库执行sql语句是因为创建对象的参数的in流中有核心配置文件的数据库连接配置
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		//3:创建sqlSession(就是使用打开上面工厂生产的sqlSessionFactory)
		 SqlSession openSession = sqlSessionFactory.openSession();
		 
		//SqlSEssion帮我生成一映射实现类  （给接口）
		 UserMapper mapper = openSession.getMapper(UserMapper.class);
		 User user = mapper.findUserById(10);
		 System.out.println(user);
		
	
	}
	
	//演示根据用户和性别接合if标签判断是否为空,和where标签条件标签可可以去掉第一个前and
	@Test
	public void testselectUserBySexAndUsername() throws Exception {	
		String resource = "sqlMapConfig.xml";		
		InputStream in = Resources.getResourceAsStream(resource);	
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		 SqlSession openSession = sqlSessionFactory.openSession();		 
		 UserMapper mapper = openSession.getMapper(UserMapper.class);
		User user = new User();
		 user.setSex("男");
		// user.setUsername("肖海");
		 mapper.selectUserBySexAndUsername(user);
	}
	
	@Test
	//演示  sql查询语句传入参数是包装类QueryVo 类型
	public void testMapper2() throws Exception {	
		String resource = "sqlMapConfig.xml";		
		InputStream in = Resources.getResourceAsStream(resource);	
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		 SqlSession openSession = sqlSessionFactory.openSession();		 
		 UserMapper mapper = openSession.getMapper(UserMapper.class);
		 //设置模糊查询的参数
		 QueryVo vo = new QueryVo();
		 User user = new User();
		 user.setUsername("五");
		 vo.setUser(user);
		 List<User> us = mapper.findUserByQueryVo(vo);
		 for (User u : us) {
			System.out.println(u);
		}
		
	}
		
		 @Test
			//演示  sql查询语句返回值是基本数据类型入Integer
			public void testMapper3() throws Exception {	
				String resource = "sqlMapConfig.xml";		
				InputStream in = Resources.getResourceAsStream(resource);	
				SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
				 SqlSession openSession = sqlSessionFactory.openSession();		 
				 UserMapper mapper = openSession.getMapper(UserMapper.class);
				 Integer userCont = mapper.UserCont();
				 System.out.println(userCont);
	
	}
		 
		 
		 
		 
		 @Test
		//演示解决数据库中表是列字段和pojo封装实例字段不一样时,怎么用手动映射
			public void testOrderMapper() throws Exception {	
				String resource = "sqlMapConfig.xml";		
				InputStream in = Resources.getResourceAsStream(resource);	
				SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
				 SqlSession openSession = sqlSessionFactory.openSession();		 
				 OrderMapper mapper = openSession.getMapper(OrderMapper.class);
				   List<orders> selectOrder = mapper.selectOrder();
				   for (orders order : selectOrder) {
					System.out.println(order);
				}
	
	}
		 
		 
		 
		 
		 @Test
		//演示,根据多个id查询多个用户   id封装到集合中
			public void testselectUserByIds() throws Exception {	
				String resource = "sqlMapConfig.xml";		
				InputStream in = Resources.getResourceAsStream(resource);	
				SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
				 SqlSession openSession = sqlSessionFactory.openSession();		 
				 UserMapper mapper = openSession.getMapper(UserMapper.class);
				  List<Integer> ids = new ArrayList<>();
				  ids.add(10);
				  ids.add(16);
				  ids.add(22);
				   List<User> selectUserByIds = mapper.selectUserByIds(ids);
				  for (User user : selectUserByIds) {
					  System.out.println(user);
				}
				 
			
	}
		 
		 
		 
		 @Test
			//演示,根据多个id查询多个用户   id封装到数组中
				public void testselectUserByIds2() throws Exception {	
					String resource = "sqlMapConfig.xml";		
					InputStream in = Resources.getResourceAsStream(resource);	
					SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
					 SqlSession openSession = sqlSessionFactory.openSession();		 
					 UserMapper mapper = openSession.getMapper(UserMapper.class);
					 Integer[] ids = new Integer[2];
					 ids[0]=25;
					 ids[1]=26;
					 List<User> selectUserByIds2 = mapper.selectUserByIds2(ids); 
					 for (User user : selectUserByIds2) {
						System.out.println(user);
					}
					
					 
				
		}
			  
	
		 
		 @Test
			//演示多表查询所有订单和对应的用户名 ,一对一查询,以订单为中心,一个订单对一个用户  返回值是订单,在订单类中封装用户对象
				public void testselectOrderList() throws Exception {	
					String resource = "sqlMapConfig.xml";		
					InputStream in = Resources.getResourceAsStream(resource);	
					SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
					 SqlSession openSession = sqlSessionFactory.openSession();		 
					OrderMapper mapper = openSession.getMapper(OrderMapper.class);
					List<orders> selectOrdersList = mapper.selectOrdersList();
					for (orders or : selectOrdersList) {
						System.out.println(or);
					}
		}

		 
		 @Test
		//演示一对多,一个用户多个表单
		 public void testselectUserByOrderList() throws Exception {	
					String resource = "sqlMapConfig.xml";		
					InputStream in = Resources.getResourceAsStream(resource);	
					SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
					 SqlSession openSession = sqlSessionFactory.openSession();		 
					OrderMapper mapper = openSession.getMapper(OrderMapper.class);
					List<User> selectOrderListByUser = mapper.selectOrderListByUser();
					for (User user : selectOrderListByUser) {
						System.out.println(user);
					}
					
		}
		 
}
