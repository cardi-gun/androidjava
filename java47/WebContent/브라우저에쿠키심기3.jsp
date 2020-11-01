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
Cookie c3 = new Cookie("subject","스프링");
response.addCookie(c3);
Cookie c4 = new Cookie("locaion","709호");
response.addCookie(c4);
Cookie c5 = new Cookie("people","19명");
response.addCookie(c5);
%>
<h1>브라우저에 쿠키심기</h1>
<a href="브라우저에서쿠키가져오기2.jsp">브라우저에서쿠키가져오기2</a>
</body>
</html>