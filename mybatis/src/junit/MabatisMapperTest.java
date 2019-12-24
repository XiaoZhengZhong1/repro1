package junit;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.itheima.mapper.UserMapper;
import com.itheima.mybatis.pojo.User;

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
}
