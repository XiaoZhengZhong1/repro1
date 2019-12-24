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
	//������ѭ���ĸ�ԭ��Ľӿ�,�ù��������ȡӳ��ʵ������,�ڲ����д���ӿڵ��ֽ���.
	@Test
	public void testMapper() throws Exception {
		//1:���غ��������ļ�(�����ļ��������ݿ���������),�ȶ��������ļ�,�ٻ�ȡ����
		String resource = "sqlMapConfig.xml";
		//��io����ȡ���������ļ�
		InputStream in = Resources.getResourceAsStream(resource);
		//2:��������----���������д�����������ļ��еı��ļ�,���������ʹ���---�൱�ڸ���������,�ù����ӹ�������
		//�������������Ķ����ܲ������ݿ�ִ��sql�������Ϊ��������Ĳ�����in�����к��������ļ������ݿ���������
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		//3:����sqlSession(����ʹ�ô����湤��������sqlSessionFactory)
		 SqlSession openSession = sqlSessionFactory.openSession();
		 
		//SqlSEssion��������һӳ��ʵ����  �����ӿڣ�
		 UserMapper mapper = openSession.getMapper(UserMapper.class);
		 User user = mapper.findUserById(10);
		 System.out.println(user);
		
	
	}
	
	//��ʾ�����û����Ա�Ӻ�if��ǩ�ж��Ƿ�Ϊ��,��where��ǩ������ǩ�ɿ���ȥ����һ��ǰand
	@Test
	public void testselectUserBySexAndUsername() throws Exception {	
		String resource = "sqlMapConfig.xml";		
		InputStream in = Resources.getResourceAsStream(resource);	
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		 SqlSession openSession = sqlSessionFactory.openSession();		 
		 UserMapper mapper = openSession.getMapper(UserMapper.class);
		User user = new User();
		 user.setSex("��");
		// user.setUsername("Ф��");
		 mapper.selectUserBySexAndUsername(user);
	}
	
	@Test
	//��ʾ  sql��ѯ��䴫������ǰ�װ��QueryVo ����
	public void testMapper2() throws Exception {	
		String resource = "sqlMapConfig.xml";		
		InputStream in = Resources.getResourceAsStream(resource);	
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		 SqlSession openSession = sqlSessionFactory.openSession();		 
		 UserMapper mapper = openSession.getMapper(UserMapper.class);
		 //����ģ����ѯ�Ĳ���
		 QueryVo vo = new QueryVo();
		 User user = new User();
		 user.setUsername("��");
		 vo.setUser(user);
		 List<User> us = mapper.findUserByQueryVo(vo);
		 for (User u : us) {
			System.out.println(u);
		}
		
	}
		
		 @Test
			//��ʾ  sql��ѯ��䷵��ֵ�ǻ�������������Integer
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
		//��ʾ������ݿ��б������ֶκ�pojo��װʵ���ֶβ�һ��ʱ,��ô���ֶ�ӳ��
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
		//��ʾ,���ݶ��id��ѯ����û�   id��װ��������
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
			//��ʾ,���ݶ��id��ѯ����û�   id��װ��������
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
			//��ʾ����ѯ���ж����Ͷ�Ӧ���û��� ,һ��һ��ѯ,�Զ���Ϊ����,һ��������һ���û�  ����ֵ�Ƕ���,�ڶ������з�װ�û�����
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
		//��ʾһ�Զ�,һ���û������
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
