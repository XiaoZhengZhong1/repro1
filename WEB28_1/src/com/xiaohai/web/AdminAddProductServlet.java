package com.xiaohai.web;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.IOUtils;

import com.xiaohai.domain.Category;
import com.xiaohai.domain.Product;
import com.xiaohai.service.AdminService;
import com.xiaohai.utils.CommonsUtils;

public class AdminAddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;// //���д�����Ϊ��������ɫ!��.�����кŵ���˼

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Ŀ�ģ��ռ����������� ��װһ��Productʵ�� ���ϴ�ͼƬ�浽������������
		Product product = new Product();

		// �ռ����ݵ�����
		Map<String, Object> map = new HashMap<String, Object>();

		try {
			// ���������ļ����
			DiskFileItemFactory factory = new DiskFileItemFactory();
			// �����ļ��ϴ����Ķ���
			ServletFileUpload upload = new ServletFileUpload(factory);
			// ����request����ļ�����󼯺�

			List<FileItem> parseRequest = upload.parseRequest(request);
			for (FileItem item : parseRequest) {
				// �ж��Ƿ�����ͨ������
				boolean formField = item.isFormField();
				if (formField) {
					// ��ͨ������ ��ñ��������� ��װ��Productʵ����
					String fieldName = item.getFieldName();
					String fieldValue = item.getString("UTF-8");

					map.put(fieldName, fieldValue);

				} else {
					// �ļ��ϴ��� ����ļ����� ����ļ�������
					String fileName = item.getName();
					String path = this.getServletContext()
							.getRealPath("upload");
					InputStream in = item.getInputStream();
					OutputStream out = new FileOutputStream(path + "/"+ fileName);// I:/xxx/xx/xxx/xxx.jpg
					IOUtils.copy(in, out);
					in.close();
					out.close();
					item.delete();
					//��ʾ��ͼƬ��ַ���뵽ָ��Ŀ¼��ָ���ļ�����
					map.put("pimage", "upload/" + fileName);

				}

			}
			//�������ǰ��̳�ϵͳ����ҳ���ͼƬ�ϴ���ǩ��װ��bean������.
			BeanUtils.populate(product, map);
			// �Ƿ�product�����װ������ȫ
			// private String pid;
			product.setPid(CommonsUtils.getUUID());
			// private Date pdate;
			product.setPdate(new Date());
			// private int pflag;
			product.setPflag(0);
			// private Category category;
			Category category = new Category();
			category.setCid(map.get("cid").toString());
			product.setCategory(category);

			// ��product���ݸ�service��
			AdminService service = new AdminService();
			service.saveProduct(product);

		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}