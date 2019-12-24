package com.xiaohai.service;

import java.sql.SQLException;
import java.util.List;

import com.xiaohai.dao.AdminProductDao;
import com.xiaohai.domain.Category;
import com.xiaohai.domain.Product;
import com.xiaohai.vo.condition;

public class AdminProductService {
	// ��ʾ��ѯ ���е���Ʒ
	public List<Product> findAllProduct() throws SQLException {
		// ��Ϊû�и��Ƶ�ҵ����Ҫҵ��㴦��.��ֱ�Ӱ����󴫵ݸ�dao��
		AdminProductDao dao = new AdminProductDao();
		// ����ҵ�����쳣,���ҵ������������,����ҵ���try���û��,����û�и���ҵ��,�Ͱ��쳣�׵�web��
		return dao.findAllProduct();

	}

	// ��ʾ���������Ʒ���,����dao�㷽��
	public List<Category> findAllCategory() throws SQLException {
		AdminProductDao dao = new AdminProductDao();
		return dao.findAllCategory();

	}

	// �����Ʒ
	public void addProduct(Product product) throws SQLException {
		AdminProductDao dao = new AdminProductDao();
		dao.addProduct(product);

	}

	// ɾ����Ʒ
	public void delProduct(String pid) throws SQLException {
		AdminProductDao dao = new AdminProductDao();
		dao.delProduct(pid);
	}

	// �޸���Ʒʱ��ʾ��Ʒ����
	public Product findProductById(String pid) throws SQLException {
		AdminProductDao dao = new AdminProductDao();
		return dao.findProductById(pid);
	}

	// ������Ʒ
	public void updateProduct(Product product) throws SQLException {
		AdminProductDao dao = new AdminProductDao();
		dao.updateProduct(product);
	}

	// ����������ѯ��Ʒ
	public List<Product> findProductListByCondition(condition condition)
			throws SQLException {
		AdminProductDao dao = new AdminProductDao();
		return dao.findProductListByCondition(condition);

	}

}
