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
c3.setMaxAge(0); //쿠키가 유지되는 시간, 0으로 설정한뒤 다시 심으면 쿠키가 사라진다.
response.addCookie(c3);
Cookie c4 = new Cookie("locaion","709호");
c4.setMaxAge(0); //쿠키가 유지되는 시간, 0으로 설정한뒤 다시 심으면 쿠키가 사라진다.
response.addCookie(c4);
Cookie c5 = new Cookie("people","19명");
c5.setMaxAge(0); //쿠키가 유지되는 시간, 0으로 설정한뒤 다시 심으면 쿠키가 사라진다.
response.addCookie(c5);
%>
<h1>브라우저에 쿠키 시간으로 심기</h1>
<a href="브라우저에서쿠키가져오기2.jsp">브라우저에서쿠키삭제확인하기</a>
</body>
</html>