<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Cookie c1 = new Cookie("name","김창희");
response.addCookie(c1);
Cookie c2 = new Cookie("age","28");
response.addCookie(c2);
%>
<h1>브라우저에 쿠키심기</h1>
<a href="브라우저에서쿠키가져오기.jsp">브라우저에서쿠키가져오기</a>
</body>
</html>