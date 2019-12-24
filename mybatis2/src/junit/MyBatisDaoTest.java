package junit;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.itheima.dao.userDaoImp;
import com.itheima.mybatis.pojo.User;

public class MyBatisDaoTest {
	// 本类冲当servlet层调用dao层,演示原始开发
	// 定义工厂
	public SqlSessionFactory sqlSessionFactory;

	@Before
	public void before() throws Exception {
		// 1:加载核心配置文件(配置文件中有数据库连接配置),先定义配置文件,再获取加载
		String resource = "sqlMapConfig.xml";
		// 用io流获取核心配置文件
		InputStream in = Resources.getResourceAsStream(resource);

		// 2:创建工厂----创建参数中传入核心配置文件中的表文件,以流的类型传递---相当于给工厂材料,让工厂加工出对象
		// 工厂生产出来的对象能操作数据库执行sql语句是因为创建对象的参数的in流中有核心配置文件的数据库连接配置
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
				
	}

	@Test
	public void testDao() throws Exception {
		userDaoImp dao = new userDaoImp(sqlSessionFactory);
		User user = dao.selectUserById(10);
		System.out.println(user);
	
	}
}
