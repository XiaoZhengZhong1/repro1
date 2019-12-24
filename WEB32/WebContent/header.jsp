<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>    
<!DOCTYPE html>
<!-- 登录 注册 购物车... -->
<div class="container-fluid">
	<div class="col-md-4">
		<img src="img/logo2.png" />
	</div>
	<div class="col-md-5">
		<img src="img/header.png" />
	</div>
	<div class="col-md-3" style="padding-top:20px">
		<ol class="list-inline">
		
		<c:if test="${empty user }">
				<li><a href="login.jsp">登录</a></li>
				<li><a href="register.jsp">注册</a></li>
			</c:if>
			<c:if test="${!empty user }">
				<li style="color:red">欢迎您，${user.username }</li>
			</c:if>
			
			<li><a href="cart.jsp">购物车</a></li>
			<li><a href="order_list.jsp">我的订单</a></li>
		</ol>
	</div>
</div>

<!-- 导航条 -->
<div class="container-fluid">
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">首页</a>
			</div>

		
		
			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav" id="categoryUl">
					
					<!-- <li class="active"><a href="product_list.htm">手机数码<span class="sr-only">(current)</span></a></li>
					<li><a href="#">电脑办公</a></li>
					<li><a href="#">电脑办公</a></li>
					<li><a href="#">电脑办公</a></li> -->
				
				
				</ul>
			
			
				<form class="navbar-form navbar-right" role="search">
					<div class="form-group">
						<input type="text" class="form-control" placeholder="Search">
					</div>
					<button type="submit" class="btn btn-default">Submit</button>
				</form>
			</div>
		</div>
	
	<!--用ajax默认异步访的方式,再配合json语言.回调数据库的商品分类信息.表示在访问商城其它页面的同时异步访问头部的商品分类 -->
	
	<script type="text/javascript">
	//header.jsp加载完毕后 去服务器端获得所有的category数据
	$(function(){
		//json类型需要定义一个空窜,用来拼接回调的函数
		var content = "";
		//提交方式
		$.post(
			//提交地址
			"${pageContext.request.contextPath}/product?method=CategoryList",
			//回调函数
			function(data){
				for(var i=0;i<data.length;i++){
					//表示到当前项目商品集合类中(传递参数为)寻找cid=当前遍历数据中的cid(就是商品表中外键列cid和当前遍历的分类表中cid相同的,都是本类商品),显示当前遍历类的名称
					content+="<li><a href='${pageContext.request.contextPath}/product?method=ProductListByCid&cid="+data[i].cid+"'>"+data[i].cname+"</a></li>"
					
				}
				//将拼接好的li放置到ul中
				$("#categoryUl").html(content);
			},
		
			//回调函数类型
			"json"
			
		);
		
	});
	
	
	
	
	
	</script>
	
	
	
	
	
	</nav>
</div>