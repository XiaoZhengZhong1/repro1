package com.xiaohai.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class downloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;////此行代码是为了消除黄色!号.是序列号的意思
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*本类代码演示:如何向客户响应文件必须下载.(前提是项目中有要下载的文件,还要在项目下的WebCintext目录下写一个
		 * 有跳转链接是超文本html文档.点击后跳转到本类中)*/
		
		//1:获取请求中的文件名
			String paramName = request.getParameter("filename");
		//2:告诉客户端要下载的文件的类型------客户端(指网站)通过文件的MIME类型取区分类型
			response.setContentType(this.getServletContext().getMimeType(paramName));
		//3:告诉客户端(网站)文件不是直接解析的,而是以附件的形式下载的
			response.setHeader("Content-Disposition","attachment;file");
		//4:获取文件的绝对路径--------注意这里的绝对路径是指tomcat中webapps中的WEB14项目所以是打开WEB14中的download/
			String realPath = this.getServletContext().getRealPath("download/"+paramName);
		//5:获取该文件的输入流
			InputStream in = new FileInputStream(realPath);
		//6:获取输出流.注意是向客户端输出.所以必须用reponse获取
			ServletOutputStream out = response.getOutputStream();
		//7:文本拷贝的模块代码
			int len = 0;
			byte[] buffer = new byte[1024];
			while((len=in.read(buffer))>0){
				out.write(buffer, 0, len);
			}
			in.close();
			
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}