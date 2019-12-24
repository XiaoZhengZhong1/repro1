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
	private static final long serialVersionUID = 1L;////此行代码是为了消除黄色!号.是序列号的意思

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//本类演示商城管理系统中,页面添加商品页面中的商品分类,从数据库中查询所有分类
		//1:按三层架构的操作经验,web层找service   再由service层找dao层
		
		
		//调用service层的方法,获取所有的类别
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