package com.xiaohai19_2.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xiaohai19_2.service.zzservice;

public class zzServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;////���д�����Ϊ��������ɫ!��.�����кŵ���˼

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//����Ŀ������ܹ���ʾ�ӿͻ��˵������������ݿ��ת��ҵ��
		
		//1:��ȡ�û�������
		String outname = request.getParameter("out");
		String inname = request.getParameter("in");
		String zzmeony = request.getParameter("money");
		
		//ҵ����Ҫ��sql�����ִ��jiajian��������Ҫת��double
		double zzdmoney = Double.parseDouble(zzmeony);
		System.out.println(zzdmoney);
		//2:����ҵ����ת�˷���(��Ϊweb��ֻ������պ���Ӧ�ͻ���),���ݲ���,ִ���û�����.����ִ�н��
		zzservice zzs = new zzservice();
		boolean isboolean = zzs.zzservice(outname, inname, zzdmoney);
		
		//�ж�ִ�н����true����false(isboolean����һ��boolean��)
		//��Ϊд��������,����Ҫ���ñ���
		response.setContentType("text/html;charset=UTF-8");
		if(isboolean){
			response.getWriter().write("ת�˳ɹ�");
		}else{
			response.getWriter().write("ת��ʧ��");
			response.getWriter().write("zzdmoney");

		}
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}