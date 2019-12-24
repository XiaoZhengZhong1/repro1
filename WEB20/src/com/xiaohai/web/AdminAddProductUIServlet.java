package com.xiaohai.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xiaohai.domain.Category;
import com.xiaohai.service.AdminProductService;

public class AdminAddProductUIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;////���д�����Ϊ��������ɫ!��.�����кŵ���˼

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//������ʾ�̳ǹ���ϵͳ��,ҳ�������Ʒҳ���е���Ʒ����,�����ݿ��в�ѯ���з���
		//1:������ܹ��Ĳ�������,web����service   ����service����dao��
		
		
		//����service��ķ���,��ȡ���е����
		AdminProductService service  = new AdminProductService();
		List<Category> categoryList	= null;
		try {
				categoryList = service.findAllCategory();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		
		request.setAttribute("categoryList", categoryList);
		request.getRequestDispatcher("/admin/product/add.jsp").forward(request, response);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}