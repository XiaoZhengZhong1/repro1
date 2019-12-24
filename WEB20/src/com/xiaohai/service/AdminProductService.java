package com.xiaohai.service;

import java.sql.SQLException;
import java.util.List;

import com.xiaohai.dao.AdminProductDao;
import com.xiaohai.domain.Category;
import com.xiaohai.domain.Product;
import com.xiaohai.vo.condition;

public class AdminProductService {
	// 演示查询 所有的商品
	public List<Product> findAllProduct() throws SQLException {
		// 因为没有复制的业务需要业务层处理.就直接把请求传递给dao层
		AdminProductDao dao = new AdminProductDao();
		// 对于业务层的异常,如果业务层有事务控制,就在业务层try如果没有,并且没有复杂业务,就把异常抛到web层
		return dao.findAllProduct();

	}

	// 演示添加所有商品类别,调用dao层方法
	public List<Category> findAllCategory() throws SQLException {
		AdminProductDao dao = new AdminProductDao();
		return dao.findAllCategory();

	}

	// 添加商品
	public void addProduct(Product product) throws SQLException {
		AdminProductDao dao = new AdminProductDao();
		dao.addProduct(product);

	}

	// 删除商品
	public void delProduct(String pid) throws SQLException {
		AdminProductDao dao = new AdminProductDao();
		dao.delProduct(pid);
	}

	// 修改商品时显示商品代码
	public Product findProductById(String pid) throws SQLException {
		AdminProductDao dao = new AdminProductDao();
		return dao.findProductById(pid);
	}

	// 更新商品
	public void updateProduct(Product product) throws SQLException {
		AdminProductDao dao = new AdminProductDao();
		dao.updateProduct(product);
	}

	// 根据条件查询商品
	public List<Product> findProductListByCondition(condition condition)
			throws SQLException {
		AdminProductDao dao = new AdminProductDao();
		return dao.findProductListByCondition(condition);

	}

}
