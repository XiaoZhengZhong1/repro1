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
	private static final long serialVersionUID = 1L;////此行代码是为了消除黄色!号.是序列号的意思

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//获取要修改的pid查询显示
		String pid = request.getParameter("pid");
		//3:传递数据给service
		AdminProductService service = new AdminProductService(); 
		Product product = null;
		try {
			 product = service.findProductById(pid);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		System.out.println("----------------0");

		//获取所有的类别,因为修改页面中有商品类型选择项,所有需要把所有的类别加载到修改页面
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