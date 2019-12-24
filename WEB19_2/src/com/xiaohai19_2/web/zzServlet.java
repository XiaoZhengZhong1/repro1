package com.xiaohai19_2.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xiaohai19_2.service.zzservice;

public class zzServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;////此行代码是为了消除黄色!号.是序列号的意思

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//本项目用三层架构演示从客户端到服务器到数据库的转账业务
		
		//1:获取用户的请求
		String outname = request.getParameter("out");
		String inname = request.getParameter("in");
		String zzmeony = request.getParameter("money");
		
		//业务金额要在sql语句中执行jiajian运算所以要转成double
		double zzdmoney = Double.parseDouble(zzmeony);
		System.out.println(zzdmoney);
		//2:调用业务层的转账方法(因为web层只负责接收和响应客户端),传递参数,执行用户请求.返回执行结果
		zzservice zzs = new zzservice();
		boolean isboolean = zzs.zzservice(outname, inname, zzdmoney);
		
		//判断执行结果是true还是false(isboolean就是一个boolean型)
		//因为写出有中文,所以要设置编码
		response.setContentType("text/html;charset=UTF-8");
		if(isboolean){
			response.getWriter().write("转账成功");
		}else{
			response.getWriter().write("转账失败");
			response.getWriter().write("zzdmoney");

		}
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}