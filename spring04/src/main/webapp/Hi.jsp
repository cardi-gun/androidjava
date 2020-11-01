<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="Hi?name=hong"> 하이 서블릿 요청합니다 </a>
<br>
<form action="Hi" method="post">
	사람 이름 입력 <input type="text" name="name"><br>
	<button type="submit">하이 post서블릿 요청</button>
</form>

</body>
</html>