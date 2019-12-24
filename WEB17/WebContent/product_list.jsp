<%@page import="javax.swing.text.StyledEditorKit.ForegroundAction"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>	
<%@ page import="com.xiaohai17.domain.*" %>>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>会员登录</title>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<!-- 引入自定义css文件 style.css -->
<link rel="stylesheet" href="css/style.css" type="text/css" />

<style>
body {
	margin-top: 20px;
	margin: 0 auto;
	width: 100%;
}

.carousel-inner .item img {
	width: 100%;
	height: 300px;
}
</style>
</head>

<body>


	<!-- 引入header.jsp -->
	<jsp:include page="/header.jsp"></jsp:include>


	<div class="row" style="width: 1210px; margin: 0 auto;">
		<div class="col-md-12">
			<ol class="breadcrumb">
				<li><a href="#">首页</a></li>
			</ol>
		</div>

	
	<%
			//获得request域对象中的集合productList,并到顶上导包,还有下行代码强转,因为request获取的 是Objest
				//注意集合中的泛型是javaBean类product
				List<Product> productList = (List<Product>)request.getAttribute("productList");
				//遍历集合,并把数据库中每一行记录按照下面的模板一行一行写出到客户端
				
			if(productList!=null){
			for(Product  pt : productList){
			out.write("<div class='col-md-2' style='height:250px'>");
			out.write("<a href='product_info.htm'>");
			out.write("<img src='"+pt.getPimage()+"' width='170' height='170' style='display: inline-block'>");
			out.write("</a>");
			out.write("<p><a href='product_info.html' style='color: green'>"+pt.getPname()+"</a></p>");
			out.write("<p><font color='#FF0000'>商城价：&yen;"+pt.getShop_price()+"</font></p>");
			out.write("</div>");
				}
			
				}
		%>

	<!-- 以下一个div代表一个商品 ,我已经把之前商城首页的其它商品全部删除了,只留了一个商品和记录做我数据库查询后输出的模板-->
		
		<!--       <div class="col-md-2">
			<a href="product_info.htm"> <img src="products/1/cs10001.jpg"
				width="170" height="170" style="display: inline-block;">
			</a>
			<p>
			<a href="product_info.html" style='color: green'>冬瓜</a>
			</p>
			
			<p>
				<font color="#FF0000">商城价：&yen;299.00</font>
			</p>
		</div>

	</div>                      -->
		
		
<!--商品浏览记录-->
	<div
		style="width: 1210px; margin: 0 auto; padding: 0 9px; border: 1px solid #ddd; border-top: 2px solid #999; height: 246px;">

		<h4 style="width: 50%; float: left; font: 14px/30px 微软雅黑">浏览记录</h4>
		<div style="width: 50%; float: right; text-align: right;">
			<a href="">more</a>
		</div>
		<div style="clear: both;"></div>

		<div style="overflow: hidden;">

			<ul style="list-style: none;">
				<li
					style="width: 150px; height: 216; float: left; margin: 0 8px 0 0; padding: 0 18px 15px; text-align: center;"><img
					src="products/1/cs10001.jpg" width="130px" height="130px" /></li>
			</ul>

		</div>
	</div>


	<!-- 引入footer.jsp -->
	<jsp:include page="/footer.jsp"></jsp:include>

</body>

</html>