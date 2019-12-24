package com.itheima.mybatis.pojo;

import java.io.Serializable;
import java.util.List;
//实现Serializable 可串行化接口,数据才能实现机群(就是多台机器之间数据交互  分布式  云 之类)
public class QueryVo implements  Serializable {

	/*
	 *本类是以包装类,包装User类  就是在本类私有User对象
	 */
	private static final long serialVersionUID = 1L;

	private User user;

	//私有一个集合,用来封装满足条件查询中的根据多个id查询多个用户	
	//看原代码发现:如果类中定义的是集合字段 那 xml中foreach循环的cocection=list 
	//看原代码发现:如果定义的是数组Ingteger[] id 那 xml中foreach循环的cocection=array
	private List<Integer> idsList;
	
	//私有一个数组,用来封装满足条件查询中的根据多个id查询多个用户	
	private Integer[] ids;
	
	public Integer[] getIds() {
		return ids;
	}

	public void setIds(Integer[] ids) {
		this.ids = ids;
	}

	public List<Integer> getIdsList() {
		return idsList;
	}

	public void setIdsList(List<Integer> idsList) {
		this.idsList = idsList;
	}

	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
