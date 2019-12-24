package com.xiaohai.web;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.xiaohai.domain.Category;
import com.xiaohai.domain.Product;
import com.xiaohai.service.AdminProductService;
import com.xiaohai.vo.condition;

public class AdminSearchProductListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;// //���д�����Ϊ��������ɫ!��.�����кŵ���˼

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");

		// 1:�ռ�������
		Map<String, String[]> properties = request.getParameterMap();
		// 2:��ɢװ��ѯ���ݵ�����װ��һ�� Bean����vo(value object)ʵ���� vo��һ��ר�Ŵ��ʵ����javaBean��İ�
		// ��װ��vo���µ�condition����,��BeanUtils���߰�
		condition condition = new condition();
		try {
			BeanUtils.populate(condition, properties);
		} catch (IllegalAccessException | InvocationTargetException e) {

			e.printStackTrace();
		}

		// ����Ʒ���Ҳ���ص�������ѯҳ��
		AdminProductService service = new AdminProductService();
		List<Category> categoryList = null;
		try {
			categoryList = service.findAllCategory();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		// 3:��ʵ�崫�ݸ�service��
		List<Product> productList = null;
		try {
			productList = service.findProductListByCondition(condition);
		} catch (SQLException e) {

			e.printStackTrace();
		}

		// ���Լ�������ѯ�ļ�¼�洢������,���������������
		request.setAttribute("categoryList", categoryList);

		request.setAttribute("categoryList", categoryList);
		request.setAttribute("productList", productList);
		request.getRequestDispatcher("/admin/product/list.jsp").forward(
				request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}