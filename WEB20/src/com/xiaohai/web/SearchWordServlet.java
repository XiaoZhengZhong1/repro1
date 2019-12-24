package com.xiaohai.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.xiaohai.srevice.ProductService;

public class SearchWordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;////此行代码是为了消除黄色!号.是序列号的意思

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//本次三层架构演示:ajax异步访问	
		
		//获得关键字
		String word = request.getParameter("word");
		
		//查询该关键字的所有商品
		ProductService service = new ProductService();
		List<Object> productList = null;
		
			try {
				productList = service.findProductByWord(word);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		
		
		//["xiaomi","huawei",""...]
		
		//使用json的转换工具将对象或集合转成json格式的字符串
		/*JSONArray fromObject = JSONArray.fromObject(productList);
		String string = fromObject.toString();
		System.out.println(string);*/
		
		Gson gson = new Gson();
		String json = gson.toJson(productList);
		System.out.println(json);
		
		response.setContentType("text/html;charset=UTF-8");
		
		response.getWriter().write(json);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}