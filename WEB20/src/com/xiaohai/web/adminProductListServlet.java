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
	private static final long serialVersionUID = 1L;////此行代码是为了消除黄色!号.是序列号的意思

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//本次项目练习,演示在商城管理系统表中,点击左边目录,右边就能到商品信息
		//用户的请求就是找到所有商品信息findAllProduct
		//具体实现步骤1:写三层架构,
	//2:在web层把请求传递给在service层.new业务层对象,调用业务层方法findAllProduct();返回商品集结果(根据提示生成)
		//3:new dao层对象,调用dao层方法findAllProduct();返回商品集结果(根据提示生成)
		//4:在dao层执行sql查询,把查询返回商品集结果List<Product> productList返回到web层
		//5:在web层把查询到的结果集存储到request域对象中,在转发到商品管理系统表中右边的显示页面list.jsp
		
		//1:将请求传递到service业务层,
		//
		AdminProductService service = new AdminProductService();
		List<Product> productList = null;

	try {
		//2:在web层把请求传递给在service层.new业务层对象,调用业务层方法findAllProduct();返回商品集结果(根据提示生成)
		productList = service.findAllProduct();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
	//5:在web层把查询到的结果集存储到request域对象中,在转发到商品管理系统表中右边的显示页面list.jsp
	request.setAttribute("productList", productList);

	request.getRequestDispatcher("/admin/product/list.jsp").forward(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}