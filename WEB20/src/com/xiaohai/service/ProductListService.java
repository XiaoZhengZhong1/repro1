package com.xiaohai.service;

import java.sql.SQLException;
import java.util.List;

import com.xiaohai.dao.ProductListDao;
import com.xiaohai.domain.Product;
import com.xiaohai.vo.PageBean;

public class ProductListService {

	public List<Product> findProduct() throws SQLException {
		ProductListDao dao = new ProductListDao();
		return dao.findProduct();
		 
	}

	//��ҳ����
	public PageBean findPageBean(int currentPage, int currentCount) throws SQLException {
		ProductListDao dao = new ProductListDao();

		//Ŀ�ģ�������취��װһ��PageBean ������
		PageBean pageBean = new PageBean();
		//1����ǰҳprivate int currentPage;
		pageBean.setCurrentPage(currentPage);
		//2����ǰҳ��ʾ������private int currentCount;
		pageBean.setCurrentCount(currentCount);
		//3��������private int totalCount;
		int totalCount = dao.getTotalCount();
		pageBean.setTotalCount(totalCount);
		//4����ҳ��private int totalPage;
		/*
		 * ������		��ǰҳ��ʾ������	��ҳ��
		 * 10		4				3
		 * 11		4				3
		 * 12		4				3
		 * 13		4				4
		 * 
		 * ��ʽ����ҳ��=Math.ceil(������/��ǰ��ʾ������)
		 * 
		 */
		int totalPage = (int) Math.ceil(1.0*totalCount/currentCount);
		pageBean.setTotalPage(totalPage);
		
		//5��ÿҳ��ʾ������private List<T> productList = new ArrayList<T>();
				/*
				 * ҳ����limit��ʼ�����Ĺ�ϵ
				 * ���� ÿҳ��ʾ4��
				 * ҳ��		��ʵ����		ÿҳ��ʾ����
				 * 1		0			4
				 * 2		4			4
				 * 3		8			4
				 * 4		12			4
				 * 
				 * ����index = (��ǰҳ��-1)*ÿҳ��ʾ������
				 * 
				 */
				int index = (currentPage-1)*currentCount;

				List<Product> productList = dao.findProductListForPageBean(index,currentCount);
				pageBean.setProductList(productList);
				return pageBean;
				



	}

	
	
}
