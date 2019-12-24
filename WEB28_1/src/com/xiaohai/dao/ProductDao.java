package com.xiaohai.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.xiaohai.domain.Category;
import com.xiaohai.domain.Order;
import com.xiaohai.domain.OrderItem;
import com.xiaohai.domain.Product;
import com.xiaohai.utils.c3p0Utils;

public class ProductDao {

	//1:��ȡ������Ʒ,���͵��̳���ҳ(ͨ�����ݿ���ϼ������ֶ�)
	public List<Product> findHotProductList() throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "select * from product order by pdate desc limit ?,?";
		List<Product> query = runner.query(sql, new BeanListHandler<Product>(Product.class), 0,9);
		return query;
	}

	//2:��ȡ������Ʒ.���͵��̳���ҳ(ͨ�����ݿ��Ƿ������ֶ�0 1)
	public List<Product> findNewProductList() throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "select * from product where is_hot=? limit ?,?";
		List<Product> query = runner.query(sql, new BeanListHandler<Product>(Product.class),1, 0,9);
		return query;
	
	}

	public List<Category> findAllCategory() throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "select * from category";
		List<Category> query = runner.query(sql, new BeanListHandler<Category>(Category.class));
		return query;
	}

	//��ȡ����id������Ʒ������
	public int getCount(String cid) throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "select count(*) from product where cid=?";
		Long query = (Long) runner.query(sql, new ScalarHandler(),cid);
		return query.intValue();
	}

	
	//��ȡ��ǰҳ����ʾ�����ݸ���ָ��,id��,���Ǹ�������ʼ,��ʾ������ 
	public List<Product> findProductByPage(String cid, int index,
			int currentCount) throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "select * from product where cid=? limit ?,?";
		List<Product> productList = runner.query(sql, new BeanListHandler<Product>(Product.class),cid,index,currentCount);
		return productList;
	}

	
	//��ȡҳ������Ʒ�ľ�����Ϣ
	public Product findProductByPid(String pid) throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "select * from product where pid=?";
		Product product = runner.query(sql, new BeanHandler<Product>(Product.class), pid);
		return product;
	}
	
	

	//��orders���������
	public void addOrders(Order order) throws SQLException {
		QueryRunner runner = new QueryRunner();
		String sql = "insert into orders values(?,?,?,?,?,?,?,?)";
		Connection conn = c3p0Utils.getConnection();
		runner.update(conn,sql, order.getOid(),order.getOrdertime(),order.getTotal(),order.getState(),
				order.getAddress(),order.getName(),order.getTelephone(),order.getUser().getUid());
	}

	//��orderitem���������
	public void addOrderItem(Order order) throws SQLException {
		QueryRunner runner = new QueryRunner();
		String sql = "insert into orderitem values(?,?,?,?,?)";
		Connection conn = c3p0Utils.getConnection();
		List<OrderItem> orderItems = order.getOrderItems();
		for(OrderItem item : orderItems){
			runner.update(conn,sql,item.getItemid(),item.getCount(),item.getSubtotal(),item.getProduct().getPid(),item.getOrder().getOid());
		}
		
		
	}

	public void updateOrderAdrr(Order order) throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "update orders set address=?,name=?,telephone=? where oid=?";
		runner.update(sql, order.getAddress(),order.getName(),order.getTelephone(),order.getOid());
	}

	public void updateOrderState(String r6_Order) throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "update orders set state=? where oid=?";
		runner.update(sql, 1,r6_Order);
	}

	public List<Order> findAllOrders(String uid) throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "select * from orders where uid=?";
		return runner.query(sql, new BeanListHandler<Order>(Order.class), uid);
	}

	public List<Map<String, Object>> findAllOrderItemByOid(String oid) throws SQLException {
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "select i.count,i.subtotal,p.pimage,p.pname,p.shop_price from orderitem i,product p where i.pid=p.pid and i.oid=?";
		List<Map<String, Object>> mapList = runner.query(sql, new MapListHandler(), oid);
		return mapList;
	}

	
	
}
