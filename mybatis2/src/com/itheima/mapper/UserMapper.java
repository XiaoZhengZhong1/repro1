package com.itheima.mapper;

import java.util.List;

import com.itheima.mybatis.pojo.QueryVo;
import com.itheima.mybatis.pojo.User;

public interface UserMapper {
	//本接口演示最终优化版,动态代理,以下面四个原则,只需要一个接口和一个测试类就能完成数据的增删改查 
	//遵循四个原则
	//接口 方法名  == User.xml 中 id 名 (就是具体的增删改查标签的id)
	//返回值类型  与  Mapper.xml文件中返回值类型要一致(就是增删改查标签上设定的resultType)
	//方法的入参类型 与Mapper.xml中入参的类型要一致(就是增删改查标签上设定的parameterType)
	//命名空间 绑定此接口(指的是<mapper namespace=com.itheima.mapper.UserMapper.java>)
	
	/*User findUserById Integer id  namespace=  有了这四个原则就可以在测试类,用工厂对象获取映射实例,
	 * 在中方法参数中传入本接口的字节码对象,通过反射创建本接口的实例,实例中就有了本接口的四个值了*/
	
	public User findUserById(Integer id);
	
	//演示传入参数为封装类类型
	public List<User> findUserByQueryVo(QueryVo vo);

	//演示返回参数为基本数据类型   查询用户记录条数
	public Integer UserCont();
	
	
	//演示根据用户和性别接合if标签判断是否为空,和where标签条件标签可可以去掉第一个前and
	public List<User> selectUserBySexAndUsername(User user);
	
	//演示,根据多个id查询多个用户   参数为集合
	public List<User> selectUserByIds(List<Integer> ids);

	//演示,根据多个id查询多个用户   参数为数组
	public List<User> selectUserByIds2(Integer[] ids);

}
