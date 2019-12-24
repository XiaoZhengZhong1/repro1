package com.xiaohai.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xiaohai.domain.Product;
import com.xiaohai.service.AdminProductService;

public class adminProductListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;////���д�����Ϊ��������ɫ!��.�����кŵ���˼

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//������Ŀ��ϰ,��ʾ���̳ǹ���ϵͳ����,������Ŀ¼,�ұ߾��ܵ���Ʒ��Ϣ
		//�û�����������ҵ�������Ʒ��ϢfindAllProduct
		//����ʵ�ֲ���1:д����ܹ�,
	//2:��web������󴫵ݸ���service��.newҵ������,����ҵ��㷽��findAllProduct();������Ʒ�����(������ʾ����)
		//3:new dao�����,����dao�㷽��findAllProduct();������Ʒ�����(������ʾ����)
		//4:��dao��ִ��sql��ѯ,�Ѳ�ѯ������Ʒ�����List<Product> productList���ص�web��
		//5:��web��Ѳ�ѯ���Ľ�����洢��request�������,��ת������Ʒ����ϵͳ�����ұߵ���ʾҳ��list.jsp
		
		//1:�����󴫵ݵ�serviceҵ���,
		//
		AdminProductService service = new AdminProductService();
		List<Product> productList = null;

	try {
		//2:��web������󴫵ݸ���service��.newҵ������,����ҵ��㷽��findAllProduct();������Ʒ�����(������ʾ����)
		productList = service.findAllProduct();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
	//5:��web��Ѳ�ѯ���Ľ�����洢��request�������,��ת������Ʒ����ϵͳ�����ұߵ���ʾҳ��list.jsp
	request.setAttribute("productList", productList);

	request.getRequestDispatcher("/admin/product/list.jsp").forward(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}