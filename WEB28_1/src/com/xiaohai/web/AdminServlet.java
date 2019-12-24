package com.xiaohai.web;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.xiaohai.domain.Category;
import com.xiaohai.domain.Order;
import com.xiaohai.service.AdminService;


public class AdminServlet extends BasicServlet {
	private static final long serialVersionUID = 1L;////此行代码是为了消除黄色!号.是序列号的意思
	
	
	//目的:查询订单详情
	public void findOrderInfoByOid(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		String oid = request.getParameter("oid");
		AdminService service = new AdminService();
		List<Map<String,Object>> orderList	= service.findOrderInfoByOid(oid);
		Gson gson = new Gson();
		 String json = gson.toJson(orderList);
		response.getWriter().write(json);
	
	}
	
	//目的:查询所有订单
	public void findAllOrders(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		AdminService service = new AdminService();
		      List<Order> orderList = service.findAllOrders();
		      request.setAttribute("orderList", orderList);
		      request.getRequestDispatcher("/admin/order/list.jsp").forward(request, response);
		      
		      
		      
		
	}		
		
		public void findAllCategory(HttpServletRequest request, HttpServletResponse response) throws IOException{
		//本类演示商城管理系统中,商品管理目录中添加商品展示商品分类.通过后台获取分类数据
		AdminService service = new AdminService();
			List<Category> categoryList = service.findAllCategory();
			
			Gson gson = new Gson();    
			String json = gson.toJson(categoryList);
			 
			response.setContentType("text/html;charset=UTF-8");
			
			response.getWriter().write(json);
	}

	
}