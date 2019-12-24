package com.xiaohai.web;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.xiaohai.domain.Product;
import com.xiaohai.service.AdminProductService;

public class AdminAddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;////此行代码是为了消除黄色!号.是序列号的意思

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			request.setCharacterEncoding("UTF-8");
			//1:获取数据
			Map<String, String[]> properties = request.getParameterMap();
			//2:封装数据
			//new一个商品JavaBean类对象.再用BeanUtils工具包中的转移方法,把上面从客户端获取的信息封装到javaBean类中
			Product product = new Product(); 
			try {
				BeanUtils.populate(product, properties);
			} catch (IllegalAccessException | InvocationTargetException e) {
				
				e.printStackTrace();
			}
			
			//到此位置表单中的数据已经借助工具类封装到Product类中(前提是表单中name必须和类中成员变量一致)
			//手动封装数据库中有的列,而添加商品中没有的字段
			//private String pid;
			product.setPid(UUID.randomUUID().toString());
		
			//private String pimage;
			product.setPimage("products/1/c_0042.jpg");
			//private String pdate;
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
				String pdate = format.format(new Date());
				product.setPdate(pdate);
			//private int pflag; 设置0.表示商品不下架
				product.setPflag(0);
			
			
			//3:传递数据给service
			AdminProductService service = new AdminProductService();
			try {
				service.addProduct(product);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
			//上面传递数据完成表示添加成功,让访问跳转到列表页面(参数表示获取WEB应用的名称+目录)
			response.sendRedirect(request.getContextPath()+"/adminProductList");
			
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}