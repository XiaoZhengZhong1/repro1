<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
	<form action="${pageContext.request.contextPath}/zz" method="post">
		转出用户:<input type="text" name="out"><br>
		转入用户:<input type="text" name="in"><br>
		转出金额:<input type="text" name="money"><br>
				<input type="submit" value="确认转账"><br>
	</form>






<body>

</body>
</html>