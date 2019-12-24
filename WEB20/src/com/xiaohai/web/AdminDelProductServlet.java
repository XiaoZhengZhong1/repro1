package com.xiaohai.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xiaohai.service.AdminProductService;

public class AdminDelProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;////此行代码是为了消除黄色!号.是序列号的意思

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//获取要删除的pid
		String pid = request.getParameter("pid");
		//创建业务层对象,调用删除方法,把获取的pid当作参数传递
		AdminProductService service = new AdminProductService();
		try {
			service.delProduct(pid);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		response.sendRedirect(request.getContextPath() + "/adminProductList");
		
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}