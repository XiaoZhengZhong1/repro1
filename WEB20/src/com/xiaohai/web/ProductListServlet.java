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
	private static final long serialVersionUID = 1L;////���д�����Ϊ��������ɫ!��.�����кŵ���˼

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			//û�з�������,��ʾ��ȡ���ݿ�������Ʒ����,���ص��ҵ���ҳ����ʾ.
			//ֱ��newҵ������,һ��һ���ȡ;
		ProductListService service = new ProductListService();
		
		//ģ�⵱ǰ�ǵ�һҳ
				String currentPageStr = request.getParameter("currentPage");
				if(currentPageStr==null) 	currentPageStr = "1";
				int currentPage = Integer.parseInt(currentPageStr);

				//��Ϊÿҳ��ʾ12��
				int currentCount = 12;
		PageBean<Product> pageBean = null;
		
		try {
			pageBean = service.findPageBean(currentPage,currentCount);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		//�ѻ�ȡ�Ľ���洢�������������
		//request.setAttribute("productList", productList);
		
	
		
		
		/*������ʾ��product_list.jspҳ���50����ƷͼƬ,��ÿҳ12����Ʒ��5ҳ����չʾ,web��Ҫ��ȡ���ǵ�ҳ����ĳһҳ
		 * web���ܷ��ظ�ҳ���12����Ʒ����,ʵ�ַ�����12����Ʒ�ŵ�һ�����϶�����*/
		request.setAttribute("PageBean", pageBean);
		
		//ת������Ŀ��ָ����jspҳ��
		request.getRequestDispatcher("product_list.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}