package cn.itcast.gjp.controller;

import java.util.List;

import cn.itcast.gjp.domain.ZhangWu;
import cn.itcast.gjp.service.ZhangWuService;

//控制器层
//接收用户视图层的数据,数据传递给service层,(由于要频繁和service层传递数据,所以在本类new service对象)
public class ZhangWuController {
	private ZhangWuService service = new ZhangWuService();//私有表示只在本类中,关联使用
	
//从视图层,到控制层,到业务层,再到ZhangWu数据库层,都是一一关联的,1视图层操作的结果,实际上是由第4层数据库实现再一层层向说返回的

	/*定义方法,实现对账务的删除功能
	 * 实现思想
	 * 由视图层调用本类删除方法接收,并传递一个主键数据参数.再由本类调用业务层的删除方法.并传递从视图层接收的主键数据.
	 * */
	public void deleteZhangWu(int Zwid) {
		service.deleteZhangWU(Zwid);
	}
	
	
	
	
	
	
	
	
	
	/*定义方法,实现对账务的编辑功能
	 * 实现思想
	 * 接收用户录入数据信息,把信息封装成zhangwu对象.本类方法由视图层view调用.
	 * 本类调用业务层service的编辑账务方法.传递录入账务对象参数.实现编辑.
	 * 
	 * */
	public void editZhangWu(ZhangWu zw){
		service.editZhangWu(zw);
	}	
	
	
	
	
	
/*定义addZhangWu--- 添加账务方法,本类方法由视图层view调用,并传递参数,由于视图层录入的5个参数都是zhangwu类型.就可以直接添加
 * zhangwu对象为参数.本类对象再调用service层方法,传递zhangwu对象参数.获取到添加后的结果集(添加成功的行数 int)*/	
	public void addZhangWu(ZhangWu zw){
		service.addZhangWu(zw);
	}
	
	
	
	
	public List<ZhangWu> select(String startDate, String endDate){
		return service.select(startDate, endDate);
	}
	/*因为视图层关联的是控制器层,所以当视图层view,做出操作时,数据就会传递到控制层controller.所以视图层的要求由控制层实现,因为视图
	 * 层new的是contorller对象*/
	
	/*控制层定义方法,实现查询所有账务数据.方法由视图层view调用(因为视图层new了controller).控制层controller又new了service
	 * 业务层对象,所有控制层调用的是业务层的方法*/
	public List<ZhangWu> selectAll(){//次方法为视图层4:查询--1:查询所有
		return service.selectAll();//返回结果一层层接收.
	}





	

}
