package com.xiaohai.web;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.xiaohai.domain.Product;
import com.xiaohai.service.AdminProductService;

public class AdminUpdateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;// //���д�����Ϊ��������ɫ!��.�����кŵ���˼

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		// 1:��ȡ����
		Map<String, String[]> properties = request.getParameterMap();
		// 2:��װ����
		// newһ����ƷJavaBean�����.����BeanUtils���߰��е�ת�Ʒ���,������ӿͻ��˻�ȡ����Ϣ��װ��javaBean����
		Product product = new Product();
		try {
			BeanUtils.populate(product, properties);
		} catch (IllegalAccessException | InvocationTargetException e) {

			e.printStackTrace();
		}

		// ����λ�ñ��е������Ѿ������������װ��Product����(ǰ���Ǳ���name��������г�Ա����һ��)
		// �ֶ���װ���ݿ����е���,�������Ʒ��û�е��ֶ�

		// private String pimage;
		product.setPimage("products/1/c_0042.jpg");
		// private String pdate;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String pdate = format.format(new Date());
		product.setPdate(pdate);
		// private int pflag; ����0.��ʾ��Ʒ���¼�
		product.setPflag(0);

		// 3:�������ݸ�service
		AdminProductService service = new AdminProductService();
		try {
			service.updateProduct(product);
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}