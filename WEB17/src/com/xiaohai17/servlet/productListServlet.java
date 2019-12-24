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
	private static final long serialVersionUID = 1L;////���д�����Ϊ��������ɫ!��.�����кŵ���˼

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//������ʾ��Ʒ�б���    
		
		
		
		//׼������---���������ݿ��ѯ��������,Ȼ��ѽ�����洢��BeanList������
		QueryRunner runner = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "select * from product";
		List<Product> productList = null;
		try {
				 productList = runner.query(sql, new BeanListHandler<Product>(Product.class));
		} catch (SQLException e) {
			e.printStackTrace();
		
		}
		
		//��Ʒ����׼����
		/*����������product�洢��request����,��ת����������tomcat������work�е�
		 * product_list.jsp(���û��ٷ�����ʱ�ͻᰴjsp����ԭ��work���Ҷ�Ӧ��)
		 */
		request.setAttribute("productList", productList);
		request.getRequestDispatcher("/product_list.jsp").forward(request, response);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}