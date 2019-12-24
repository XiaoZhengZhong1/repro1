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
	private static final long serialVersionUID = 1L;// //此行代码是为了消除黄色!号.是序列号的意思

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");

		// 1:收集表单数据
		Map<String, String[]> properties = request.getParameterMap();
		// 2:将散装查询数据单独封装到一个 Bean类中vo(value object)实体中 vo是一个专门存放实体如javaBean类的包
		// 封装到vo包下的condition类中,用BeanUtils工具包
		condition condition = new condition();
		try {
			BeanUtils.populate(condition, properties);
		} catch (IllegalAccessException | InvocationTargetException e) {

			e.printStackTrace();
		}

		// 把商品类别也加载到条件查询页面
		AdminProductService service = new AdminProductService();
		List<Category> categoryList = null;
		try {
			categoryList = service.findAllCategory();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		// 3:将实体传递给service层
		List<Product> productList = null;
		try {
			productList = service.findProductListByCondition(condition);
		} catch (SQLException e) {

			e.printStackTrace();
		}

		// 把自己条件查询的记录存储到域中,让其回显条件数据
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