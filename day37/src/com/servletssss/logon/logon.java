package com.servletssss.logon;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;

import com.servlet.login.c3p0Utils;

public class logon extends HttpServlet {
	private static final long serialVersionUID = 1L;//此行代码是为了消除黄色!号.是序列号的意思
    public logon() {
        super();
    }
    /*本类为显示练习:项目启动,用户注册,登陆,表单html,创建servlet类,接收请求,响应,连接SQL数据库(c3p0,mysql),
     * 查询sql语句(DBUtils),登陆参数和数据库查询参数结果做判断,是否为空,再输出响应*/
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
		//要求:写一个注册表单.并添加到数据库
		//题目分析:先搭建环境:1:解析web.xml和c3p0-config.xml,需要dom4j解析jar包
		//2:连接服务器需要servlet-api.jar
		//3:连接数据库需要:c3p0-0.9.12.jar,和c3p0-config.xml配置文件.和mysql-Connection连接jar包.
		//4:执行数据库操作需要dbutils包和依赖jar包pool.总记6个jarbao
		
		//具体实现步骤
		/*:1:搭建环境,把上面需要的6个包.都到到本项目WebContect目录下的WEB-INF目录下的lib目录中,并添加到引用类库
		 * 2:在项目中webContent目录中创建zhuce.html注册表单超文本,文本中跳转action="/logon",因为本类创建
		 * 时,url-pattern中也/logon.所以必须一致
		 * 3:在本类获取用户和密码
		 * 4:把用户和密码添加到数据库
		 * 5:验证是否创建成功
		 * 6:根据验证,响应给用户添加成功或者失败的信息
		 * */
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//2在本类获取用户和密码
		String paramName = request.getParameter("username");
		String paramPassword = request.getParameter("password");
		String paramEmail = request.getParameter("email");
		
		
		//3:把用户和密码添加到数据库
		QueryRunner qr = new QueryRunner(c3p0Utils.getDatasoursce());
		String sql = "insert into user(username,password,email) values (?,?,?)";
		
		//4:验证是否创建成功
		try {
			int rows = qr.update(sql,paramName,paramPassword,paramEmail );
			if(rows>0){
				response.getWriter().write("deng lu cheng gong");
			}else{
				response.getWriter().write("deng lu shi bai");
			}
		} catch (SQLException e) {
			
			throw new RuntimeException(e);
		}
		
	}

}
