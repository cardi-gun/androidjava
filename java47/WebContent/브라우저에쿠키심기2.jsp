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
c1.setMaxAge(0); //쿠키가 유지되는 시간, 0으로 설정한뒤 다시 심으면 쿠키가 사라진다.
response.addCookie(c1);
%>
<h1>브라우저에 쿠키 시간으로 심기</h1>
<a href="브라우저에서쿠키가져오기.jsp">브라우저에서쿠키가져오기</a>
</body>
</html>