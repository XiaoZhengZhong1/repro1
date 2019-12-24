package com.xiaohai.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xiaohai.domain.Product;
import com.xiaohai.service.ProductListService;
import com.xiaohai.vo.PageBean;

public class ProductListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;////此行代码是为了消除黄色!号.是序列号的意思

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			//没有方法请求,演示获取数据库所以商品数据,返回到找到的页面显示.
			//直接new业务层对象,一层一层获取;
		ProductListService service = new ProductListService();
		
		//模拟当前是第一页
				String currentPageStr = request.getParameter("currentPage");
				if(currentPageStr==null) 	currentPageStr = "1";
				int currentPage = Integer.parseInt(currentPageStr);

				//认为每页显示12条
				int currentCount = 12;
		PageBean<Product> pageBean = null;
		
		try {
			pageBean = service.findPageBean(currentPage,currentCount);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		//把获取的结果存储到请求域对象中
		//request.setAttribute("productList", productList);
		
	
		
		
		/*案例演示把product_list.jsp页面的50个商品图片,按每页12个商品分5页进行展示,web需要获取的是当页面点击某一页
		 * web层能返回该页面的12个商品数据,实现方法把12个商品放到一个集合对象中*/
		request.setAttribute("PageBean", pageBean);
		
		//转发到项目类指定的jsp页面
		request.getRequestDispatcher("product_list.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}