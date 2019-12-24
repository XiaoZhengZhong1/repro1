package com.xiaohai17.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.xiaohai17.domain.Product;
import com.xiaohai17.utils.c3p0Utils;

public class productListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;////此行代码是为了消除黄色!号.是序列号的意思

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//本类演示商品列表案例    
		
		
		
		//准备数据---就是向数据库查询所有数据,然后把结果集存储到BeanList集合中
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "select * from product";
		List<Product> productList = null;
		try {
				 productList = runner.query(sql, new BeanListHandler<Product>(Product.class));
		} catch (SQLException e) {
			e.printStackTrace();
		
		}
		
		//商品集合准备好
		/*将集合数据product存储到request域中,再转发给服务器tomcat的容器work中的
		 * product_list.jsp(当用户再发请求时就会按jsp运行原理到work中找对应的)
		 */
		request.setAttribute("productList", productList);
		request.getRequestDispatcher("/product_list.jsp").forward(request, response);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}