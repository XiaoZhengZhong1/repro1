package com.xiaohai.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xiaohai.domain.Category;
import com.xiaohai.domain.Product;
import com.xiaohai.service.AdminProductService;

public class AdminUpdateProductUISrevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;////���д�����Ϊ��������ɫ!��.�����кŵ���˼

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//��ȡҪ�޸ĵ�pid��ѯ��ʾ
		String pid = request.getParameter("pid");
		//3:�������ݸ�service
		AdminProductService service = new AdminProductService(); 
		Product product = null;
		try {
			 product = service.findProductById(pid);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		System.out.println("----------------0");

		//��ȡ���е����,��Ϊ�޸�ҳ��������Ʒ����ѡ����,������Ҫ�����е������ص��޸�ҳ��
		List<Category> categoryList	= null;
		try {
				categoryList = service.findAllCategory();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		
		request.setAttribute("categoryList", categoryList);
		request.setAttribute("product",product);
		request.getRequestDispatcher("/admin/product/edit.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}