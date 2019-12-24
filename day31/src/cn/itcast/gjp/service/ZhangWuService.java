package cn.itcast.gjp.service;

import java.util.List;

import cn.itcast.gjp.dao.ZhangWuDao;
import cn.itcast.gjp.domain.ZhangWu;

/*本类是业务层类,接收上一层控制层contorller的数据,经过计算后,传递给dao层,(因为需要频繁和dao层进行数据传输,所有先在本类创建一个dao包
 * 中的dao类对象)
 * 
 */
public class ZhangWuService {
	private  ZhangWuDao dao = new ZhangWuDao();//私有表示只在本类中,关联使用
	//从视图层,到控制层,到业务层,再到ZhangWu数据库层,都是一一关联的,1视图层操作的结果,实际上是由第4层数据库实现再一层层向说返回的

	
	/*定义方法,实现对账务的删除功能
	 * 实现思想
	 * 由控制层调用本类删除方法接收,并传递一个主键数据参数.再由本类调用dao层的删除方法.并传递从控制层接收的主键数据.
	 * */
	public void deleteZhangWU(int Zwid) {
		dao.deleteZhangwu(Zwid);
	}
	
	
	
	
	
	
	
	
	
	
	/*定义方法,实现对账务的编辑功能
	 * 实现思想
	 * 接收用户录入数据信息,把信息封装成zhangwu对象.
	 * 调用dao层的连接数据库编辑账务方法.传递录入账务对象参数.实现编辑.
	 * 
	 * */
	
	public void editZhangWu(ZhangWu zw){
		dao.editZhangWu(zw);
	}	
	
	
	
	
	/*定义添加账务方法
	 * 本类方法由控制层controller调用,并传递zhangwu对象
	 * 本类再调用dao层方法,并传递参数.*/
	public void addZhangWu(ZhangWu zw){
		dao.addZhangWu(zw);
	}
	
	
	
	
	
	
	
	
	public List<ZhangWu> select(String startDate, String endDate){
	return dao.select(startDate, endDate);
	}
	
	/*定义方法,实现查询所有账务数据.方法由控制层Controller调用,最终由本业务类调用dao层(实现数据库连接池)*/	
		public List<ZhangWu> selectAll(){
			return dao.selectAll();/*因为本业务类,关联的是ZhangWudao层的dao对象.dao对象中才有数据库连接,和增删改查功能
			所以从视图层,到控制层,到业务层,再到ZhangWu数据库层,都是一一关联的,1视图层操作的结果,实际上是由第4层数据库实现再
			一层层向说返回的*/
		}




		
}
